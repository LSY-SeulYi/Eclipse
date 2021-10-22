'''
Created on 2021. 7. 8.

@author: pc354
'''
int_data = 1
int_data2 = 3.14
float_data = 3.14
complex_data = 1+5j # 복소수
str_data = 'ICH LABE DICH'
str_data2 = "I LOVE YOU"

print(int_data,int_data2,float_data,complex_data,str_data,str_data2)

list_data = [1,2,3] # 배열이 리스트이고 리스트가 배열임
tuple_data = (1,2,3) # 튜플이 리스트와 다른점(값을 변경할 수 없음)
dict_data = {0: 'false', 1: 'True',2:'True'} # java의 MAP과 유사
dict_data2 = {'papa':'아빠','boy':'소년','girl':'소녀'}

print(list_data)
print(tuple_data)
print(dict_data)
print(dict_data2)
print(list_data[0],list_data[1],list_data[2])
list_data[1] = 22
print(list_data[0],list_data[1],list_data[2])
print(tuple_data[0],tuple_data[1],tuple_data[2])