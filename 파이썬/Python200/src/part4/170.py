'''
Created on 2021. 7. 20.
url 접속하여 html 페이지 소스 보기
@author: pc354
'''
from urllib.request import urlopen


url = 'http://www.python.org'
with urlopen(url) as f:
    doc = f.read().decode()
    print(doc)