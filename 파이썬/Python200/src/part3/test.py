'''
Created on 2021. 7. 15.
리스트를 set으로 만들기
@author: pc354
'''

list_data = ['홍길동','윤시네','홍길동','이수만','강금보','홍찬호','홍길동']
print(list_data)
print(set(list_data))

set_data = set({})
for x in list_data:
    set_data.add(x)
print(set_data)

set_data2 = set(list_data)
print(set_data2)
