'''
Created on 2021. 7. 15.
리스트에서 특정 요소의 위치 구하기 (index)
@author: pc354
'''

str = '구름에 달 가듯이 가는 달'
pos = str.find('달')
pos2 = str.find('달',pos+1)
print(pos,pos2)

################# find 대신 index 함수를 이용하면 list 에서 색인이 가능하다.

태양계 = ['수성','금성','달','지구','화성','목성','토성','달','달','달','달','천왕성','달','달','달','해왕성','명왕성']
spos = 태양계.index('달')
spos1 = 태양계.index('달',spos+1)
spos2 = 태양계.index('달',spos1+1)
print(spos,spos1,spos2)

s = ''.join(태양계)
print(s)
start = 0
while True:
    poss = s.find('달',start) 
    if poss == -1:
        break
    print(poss)
    start = poss+1
    
태양계[3] = 'Earth'
print(태양계)
print(태양계[3:7])

## 원본에 직접 영향을 줌
print(태양계.reverse())
print(태양계)

## 원위치
태양계.reverse()
print(태양계)

data = list(range(16))
data.reverse()
print(data)

## 원본에 영향 안주고 reverse 시키기
태양계2 = reversed(태양계)
print(태양계)
print(list(태양계2))

## 정렬도 이와 유사한 점이 있다.
list_data = ['객','천','윤','마']
## 원본에 영향을 주지 않는 정렬
list_data2 = sorted(list_data)
print(list_data)
print(list_data2)