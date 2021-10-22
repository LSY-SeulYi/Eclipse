'''
Created on 2021. 7. 16.

@author: pc354
'''
from random import shuffle


list_data = ['가위','바위','보']
a = 1
b = 0
c = 0

def panjung(com,me):
    global a,b,c

    if com == me:
        c += 1
        pan = '비겼어요~~'
    elif ((com == '가위' and me == '바위') or (com == '바위' and me == '보') or (com == '보' and me == '가위')):
        b += 1
        pan = '이겼어요~~'
    else:
        pan = '지셨네요~~'
    print(a,pan)
    a += 1

while True:
    shuffle(list_data)
    com =list_data[0]
    me = input('가위바위보==>')
    if me not in ['가위','바위','보','그만']:
        continue
    if me == '그만':
        print('게임 종료')
        print('%d전 %d승 %d패 %d무승부 '%(a-1,b,a-1-b-c,c))
        break
    panjung(com,me)