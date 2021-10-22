'''
Created on 2021. 7. 14.
빈도 계산
@author: pc354
'''
import collections


poem = '''
강나루 건너서 밀 밭길을 구름에 달 가듯이 가는
나그네 길은 외줄기 남도 삼백리 나그네 나그네
술익는 마을마다 타는 저녁놀 저녁놀 저녁놀
가도 가도 왕십리 비가 오네
'''

# cnt = poem.count('나그네')
# print(cnt)
# cnt1 = poem.count('')
# print(cnt1)

cnt1 = poem.count('나그네')
cnt3 = poem.count('저녁놀')
cnt4 = poem.count('가도')
print(cnt1)
cnt = poem.count(' ')
print(cnt-cnt1)
print(cnt-cnt1-cnt3-cnt4)

cnt2 = poem.split()
# 총단어
print(cnt2)
print(len(cnt2))
counts = collections.Counter(cnt2)
print(counts)
wordSet = set(cnt2)
print('%d'%len(wordSet))
print(wordSet)