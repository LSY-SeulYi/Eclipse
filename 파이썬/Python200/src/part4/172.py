'''
Created on 2021. 7. 20.
인터넷에 있는 이미지를 내 PC로 저장하기
@author: pc354
'''
from urllib.request import urlopen


imgurl = 'http://imgnn.seoul.co.kr/img/upload/2020/10/12/SSI_20201012165045.jpg'
imgeName = imgurl.split('/') [-1]
try:
    with urlopen(imgurl) as f:
        with open(imgeName,'wb') as h:
            img = f.read()
            h.write(img)
except Exception as e:
    print(e)