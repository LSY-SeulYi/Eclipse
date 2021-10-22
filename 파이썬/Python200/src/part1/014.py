'''
Created on 2021. 7. 12.
while 문 개념 배우기 while ~ continue ~ break
@author: pc354
'''
import math


x=0
while (x<10): # () 생략 가능
    x = x+1
    if x<3:
        continue
    print(x)
    if x>7:
        break
    
while True:
    x += 1
    if x>30:
        break
    print(x)
    
################### 현재 지구 인구 (약 70억) 만큼의 조상수를 가질려면 몇 대를 거슬러 올라가야 할까요?

pop = 0
cnt = 0
while True:
    pop += math.pow(2,cnt) # math.pow => 곱승(2에 cnt승-> 2에 0승, 2에1승, 2에2승, 2에3승, 2에4승...pop에서 말한 70억이 될때까지 계산함.)
    print(cnt,pop)
    if pop > 7000000000:
        break
    cnt+=1
    
print(pop,end=";")
print()
print(cnt)