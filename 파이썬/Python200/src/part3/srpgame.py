'''
Created on 2021. 7. 16.
가위,바위,보 게임
@author: pc354
'''
from random import shuffle

list_data = ['가위','바위','보']
cnt = 1
success = 0
tie = 0

def panjung(com,me):
    global cnt,success,tie
    res = ''
    if com == me:
        tie += 1
        res = '비겼습니다~~~'
    elif ((com =='가위' and me == '바위') or (com == '바위' and me == '보') or (com == '보' and me == '가위')):
        success += 1
        res = '오~! 이기셨네요~??'
    else:
        res = '이런... 지셨어요...ㅜㅜ... 분발하셔야 겠어요~~ㅜㅜ;;'
    print(cnt,res)
    cnt += 1
    
while True:
    shuffle(list_data)
    com =list_data[0]
    me = input('가위바위보==>')
    if me not in ['가위','바위','보','그만']:
        continue
    if me == '그만':
        print('>>>>>>게임 종료<<<<<<<<')
        print('%d전 %d승 %d패 %d무승부 '%(cnt-1,success,cnt-1-success-tie,tie))
        break
    panjung(com,me)