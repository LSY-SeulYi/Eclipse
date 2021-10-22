'''
Created on 2021. 7. 12.
튜플 이해하기
@author: pc354
'''

tupleData = (1,2,3,[4,5,6])
x = tupleData[3][1]
print(x)

# tupleData[3] = 55
tupleData[3][1] = 55
print(tupleData[3][1]) # 튜플 요소로 있는 리스트는 값을 변경할 수 있다.
# tupleData[3] = [7,8,9]
tupleData[3][1] = [7,8,9]
print(tupleData[3][1])