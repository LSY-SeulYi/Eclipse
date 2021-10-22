'''
Created on 2021. 7. 16.
사전에 새로운 요소 추가하기
@author: pc354
'''

dic_data = {'assa':'앗싸,감탄사','foo':'한숨쉬는소리'}
dic_data['boy'] = '소년'
print(list(dic_data.keys()),list(dic_data.values()))
dic_data['foo'] = '아무런의미없음'
print(list(dic_data.keys()),list(dic_data.values()))


요일 = ['일','월','화','수','목','금','토']
yoil = ['SUN','MON','TUE','WED','THR','FRI','SAT']
weekdic = dict({})
for y,x in list(enumerate(요일)):
    weekdic[x] = yoil[y]
print(weekdic)

############# del xxx, xxx.clear(), del xxx[y] #########################
요일 = ['일','월','화','수','목','금','토']
yoil = ['SUN','MON','TUE','WED','THR','FRI','SAT']

del 요일[:5]
print(요일,yoil)

yoil.clear()
print(요일,yoil)

############# key만 가져오기 ##############################################

ks = weekdic.keys()
print(list(ks))

############# values만 가져오기 ###########################################

ks = weekdic.values()
print(list(ks))

############# key 와 values 가져오기 ######################################

keyNval = weekdic.items()
print(tuple(keyNval)) # 아이템즈로 키와 밸류를 가져오면 튜플로 형변환 됨
print(weekdic) # 원래는 사전데이터로 되어있음






