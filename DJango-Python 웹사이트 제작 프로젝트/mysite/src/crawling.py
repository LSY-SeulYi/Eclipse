'''
Created on 2021. 8. 13.
네이버 블로그를 크롤링하여 파일로 저장하는 프로그램
@author: pc354
'''
from urllib.parse import quote_plus
from urllib.request import urlopen
import csv
from bs4 import BeautifulSoup


def search(word):
    print('크롤링 작업 중입니다.')
    url = f"https://m.search.naver.com/search.naver?where=m_view&sm=mtb_jum&query={quote_plus(word)}"
    html = urlopen(url).read()
    soup = BeautifulSoup(html,'html.parser')
    # title = item.find("span", "subject_fixed")["title"]
    total = soup.select('.api_txt_lines.total_tit')
    # 저장작업
    data=[]
    for i in total:
        # print(i.text)
        # print(i.attrs['href'])
        data.append([i.text,i.attrs['href']])
    return data
            
if __name__ == '__main__':
    data = search('검색어 입력')
    for x in data:
        print(x)