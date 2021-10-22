'''
Created on 2021. 7. 20.
텍스트파일에 있는 단어 개수 계산하기
@author: pc354
'''
with open('news.txt','r',encoding = 'utf-8') as f:
    words = f.read().split()
    # 옳은 로직은 전처리 단계를 거쳐야 한다.
    # 전처리 작업 : 특수기호, 조사, 공란..등 제거해주기.
    print('단어수:[%d]'%len(words))