'''
Created on 2021. 7. 20.
파일 ZIP 압축 파일로 만들기
@author: pc354
'''
from zipfile import *


def compress2zip(fileName, zipName):
    print('[%s]->[%s]압축...'%(fileName,zipName))
    with ZipFile(zipName,'w') as ziph:
        ziph.write(fileName)
    print('압축이 끝났습니다.')
compress2zip('mydata.txt','mydata.zip')