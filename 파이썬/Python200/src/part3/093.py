'''
Created on 2021. 7. 15.
문자열을 특정 문자열로 토큰화 시키기
@author: pc354
'''
url = 'http://www.naver.com/news/today=20160831'
tokens = url.split('/')

print(tokens)

log = 'name:홍길동 age:17 gender:Male nation:Kor'
tokens1 = log.split(':') # 쪼갤때 사용하는 구분자 = 세퍼레이트, 리덱스라고 함
print(tokens1)


# 위 logs 데이타를 딕셔너리로 바꾸기
logs = '''name:홍길동 age:17
gender:Male nation:Kor'''
tokens2 = logs.split()

mydict = dict({})
for x in tokens2:
    tk = x.split(':')
    mydict[tk[0]] = tk[1]
print(mydict)
