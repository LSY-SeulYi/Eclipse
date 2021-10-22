'''
Created on 2021. 7. 12.
시쿼스 자료 연결 이해하기 (결합 + )
@author: pc354
'''
a = '청산리 벽개수야 '
b = '수이감을 자랑마라'
print(a+b)

list1 = [1,2,3,4,5]
list2 = [6,7,8,9,10]
print(list1+list2) # java = list1.add(listb)

후렴 = '얄리 얄리 얄랑셩 얄라리 얄라 \n'
tuple_data = (1,2,3)
list_data = [4,5,6]
# print(list_data+tuple_data)
print(tuple(list_data)+tuple_data) # 다른형의 시퀀스 결합시 자료형을 하나로 통일시킬 것
print(list(tuple_data)+list_data)
print(str(list_data)+후렴)
print(list_data+list(후렴))