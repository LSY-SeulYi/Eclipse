'''
Created on 2021. 7. 8.
들여쓰기 (강제조항) - 자바와 틀림, 파이썬은 {} 를 사용하지 않고 들여쓰기로 해결함
@author: pc354
'''
age = 19
if age>=19: # () 보통 생략함
    print('당신은 성인 입니다.')
else:
    print('당신은 아이 입니다.')
    
list_data = ['a','b','c']
if 'a' in list_data:
    print('a가 있습니다.')
    print('a가 있다니까요.') # 블럭 첫줄의 시작 위치와 같아야 함.
else:
    print('a가 없습니다.')