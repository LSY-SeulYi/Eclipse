from urllib.parse import urlparse

from bs4 import BeautifulSoup
from django.shortcuts import render
from django.views.generic.edit import FormView
import requests
from bottleneck.nonreduce import replace


# Create your views here.
def get_html_content(request):
    import requests
    recipe = request.GET.get('recipe')
    recipe = recipe.replace(" ", "+")
    USER_AGENT = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.157 Safari/537.36"
    LANGUAGE = "en-US,en;q=0.5"
    session = requests.Session()
    session.headers['User-Agent'] = USER_AGENT
    session.headers['Accept-Language'] = LANGUAGE
    session.headers['Content-Language'] = LANGUAGE
    html_content = session.get(f'https://haemukja.com/recipes?sort=rlv&name=+{recipe}').text
    return html_content


def home(request):
    result = None

    if 'recipe' in request.GET:
        html_content = get_html_content(request)
        soup = BeautifulSoup(html_content, 'html.parser')
        result = dict()
        res1 = soup.find("ul", {"class" : "lst_recipe"})
        res2 = res1.select_one('p')
        result['name'] = res2.find("a",{"class" : "call_recipe"}).text
        res3 = soup.find("ul", {"class" : "lst_recipe"})
        result['img'] = res3.find("img")["src"]
        result['href'] = "https://haemukja.com" + res3.find("a")["href"]
        res5 = soup.select("ul > li > a.call_recipe > img")
        result['img1'] = str(res5).replace(",", "").replace("[", "").replace("]", "").replace('">', "")
        
        

    return render(request, 'core/home.html', {'result': result})

