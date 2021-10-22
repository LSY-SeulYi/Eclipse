'''
Created on 2021. 7. 19.
텍스트 파일 복사하기
@author: pc354
'''

f = open('stockcode.txt','r',encoding = 'utf-8')
h = open('stockcode1_copy.txt','w',encoding = 'utf-8')

h.write(f.read())
f.close()
h.close()

#############################################################

with open('stockcode.txt','r',encoding = 'utf-8') as f:
    with open('stockcode2_copy.txt','r',encoding = 'utf-8') as h:
        h.write(f.read())
        pass