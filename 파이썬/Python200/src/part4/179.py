'''
Created on 2021. 7. 20.
로또 번호 추출기 만들기
@author: pc354
'''
from random import shuffle
from time import sleep


gamenum = input('로또 게임 회수를 입력하세요: ')

for i in range(int(gamenum)):
    # balls = [x+1 for x in range[45]]
    balls = list(range(1,46))
    ret = []
    for j in range(6):
        shuffle(balls)
        number = balls.pop()
        ret.append(number)
    ret.sort()
    print('로또번호[%d]: '%(i+1),end='')
    print(ret)
    sleep(1)