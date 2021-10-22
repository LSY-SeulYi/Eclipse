'''
Created on 2021. 7. 14.

@author: pc354
'''

list_data = [1,2,3,4]
tuple_data = (3,4,5,6)
dic_data = {1:'일본놈',2:'이발소',3:'삼학도',4:'사공',5:'오리발',6:'육군',7:'칠판'}
str_data = '청산에 살으리랏다'
int_data = 365
pi = 3.141592
set_data = set([45,78,90])

print(type(list_data) == "<class 'list'>")
print(str(type(list_data)) == "<class 'list'>") # 비교 할때는 꼭 형변환 넣어줘야 함!!

print(type(tuple_data))
print(type(dic_data))
print(type(str_data))
print(type(int_data))
print(type(pi))
print(type(set_data))