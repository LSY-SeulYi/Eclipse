'''
Created on 2021. 7. 20.
URL에 접속하여 HTML 페이지를 파일로 저장하기
빅데이터=<크롤링>=소스 리스트의 전부를 긁어 오는것
빅데이터=<스크래핑>=특정 사이트의 원하는 특정 정보만 추출해서 가져오는 것
@author: pc354
'''
from urllib.request import urlopen


url = 'http://www.python.org/'
with urlopen(url) as f:
    doc = f.read().decode()
    with open('pythonhome.html','w',encoding = 'utf-8') as h:
        h.writelines(doc)