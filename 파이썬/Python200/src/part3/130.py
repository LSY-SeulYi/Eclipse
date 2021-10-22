'''
Created on 2021. 7. 16.
사전에 특정 키가 존재하는 지 확인하기(in)
@author: pc354
'''

dic_data = {
    '정아':34500,'윤아':45000,'희야':7700,'미정':8900,'정미':1200
    }
while 1:
    key = input('이름을 입력 하세요: ')
    if(key == '그만'):
        break
    if key in dic_data:
        print('이름이 %s인 아이의 수는 %d명입니다.'%(key,dic_data[key]))
    else:
        print('자료에 %s인 이름이 존재하지 않습니다.'%key)
print('작업 종료')