'''
Created on 2021. 7. 15.
순차적인 정수 리스트 만들기 (range)
@author: pc354
'''

list_data = [0,1,2,3,4,5,6,7,8,9,10]
list_data2 = range(11)
print(list_data)
print(list(list_data2))
print(list_data == list(list_data2))

for x in list_data:
    print(x,end=' ')
print()

print()

for x in range(11):
    print(x,end=' ')
print()