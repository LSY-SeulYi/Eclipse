'''
Created on 2021. 7. 19.
텍스트 파일을 읽고 출력하기 (read)
@author: pc354
'''

f = open('stockcode.txt','r',encoding = 'UTF-8')
data = f.read()
print(data)
f.close() # 반드시 외부파일을 사용하고 난 다음 닫아줘야 한다.

############################################################

with open('stockcode.txt','r',encoding = 'UTF-8') as f:
    data = f.read()
    print(data) # with 블럭을 마치는 순간 자동으로 close 된다.