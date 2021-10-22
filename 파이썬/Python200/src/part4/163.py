'''
Created on 2021. 7. 19.
url에서 호스트 도메인 추출하기
@author: pc354
'''

# URL ==> 프로토콜 + 호스트도메인 + 경로 + 쿼리 (질의 : url에 질의어를 넣을 때에는 무조건 ? 가 들어가야 한다.)
url = 'http://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=105&oid=028&aid=0002334601'
tmp = url.split('/')
for x in tmp:
    print(x)
print('도메인:%s'%tmp[2])

# 질의 부분 추출
sql = url.split('?')[1]
print(sql)

# 질의 부분의 파라미터와 값 추출
tokens = sql.split('&')
dic_data = {}
for x in tokens:
    xs = x.split('=')
    dic_data[xs[0]] = xs[1]
print(dic_data)