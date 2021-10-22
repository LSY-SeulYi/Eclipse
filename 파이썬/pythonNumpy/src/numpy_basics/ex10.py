'''
Created on 2021. 8. 3.

@author: pc354
'''

import numpy as np

data = np.array([[1,2,3],[4,5,6]])
print(data)
print(data.shape)

data2 = data.reshape(3,2)
print(data2)
print(data2.shape)

data0 = np.array([1,2,3,4,5,6,7,8,9])
data01 = data0.reshape(3,3)
print(data01)
print(data01.shape)

arr = np.arange(6).reshape((2,3)) # 유의 ~ 튜플 형태로 매개변수 전달
arr2 = arr.transpose()
arr3 = arr.T
print(arr2)
print(arr3)