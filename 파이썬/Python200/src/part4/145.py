'''
Created on 2021. 7. 19.
파일의 특정 부분만 복사하기 (seek, read, write)
@author: pc354
'''

startPosition = 21
size = 50

with open('stockcode.txt','r',encoding = 'utf-8') as src:
    with open('stockcode_part.txt','w',encoding = 'utf-8') as target:
        src.seek(startPosition)
        data = src.read(size)
        target.write(data)
        pass
    pass
