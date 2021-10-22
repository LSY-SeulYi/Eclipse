'''
Created on 2021. 7. 12.
사전 이해하기
@author: pc354
'''
dic = {'김길자':0,1:'홍길동',2:'유관순',3:'정치근',4:'안현필'}

# 총 학생수
print(len(dic))

# 3번 학생은
print(dic[3])
print(dic and '정치근')

# 나중에 추가하고 싶으면
dic[7] = '혁거세'
print(dic)

# 삭제 하고 싶을때
dic.__delitem__(2)
print(dic)
