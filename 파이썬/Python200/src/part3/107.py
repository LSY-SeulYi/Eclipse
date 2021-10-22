'''
Created on 2021. 7. 16.
리스트 합치기
@author: pc354
'''

list_a = [1,2,3,4]
list_b = [5,6,7,8]
print(list_a+list_b)
list_c = list_a.__add__(list_b)
print(list_c)

########################################

list_e = list_a.append(list_b)
print(list_e)
print(list_a) # append 의 리턴값은 따로 존재하지 않고 원본을 변경시킴