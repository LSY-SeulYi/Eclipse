'''
Created on 2021. 8. 2.
Adding, removing, and sorting elements
@author: pc354
'''

import numpy as np

arr = np.array([2,1,5,3,7,4,6,8])
print(np.sort(arr))
print(arr)

# 합치기 (concatenate)
a = np.array([1, 2, 3, 4])
b = np.array([5, 6, 7, 8])
print(np.concatenate((a, b))) # 튜플로 받아야 하는것으로 설계되어 있어서 괄호가 한번더 들어감

x = np.array([[1, 2], [3, 4]])
y = np.array([[5, 6], [7, 8]])
print(np.concatenate((x, y), axis=0)) # axis => 0컬럼을 축으로 두겠다.
xy = np.concatenate((x,y), axis =0)
print(xy)
print(xy.shape)
xy = np.concatenate((x,y), axis =1)
print(xy)
print(xy.shape)

x = np.array([[1, 2], [3, 4]])
y = np.array([[5, 6]])
print(np.concatenate((x, y), axis=0)) # axis => 0컬럼을 축으로 두겠다.
xy = np.concatenate((x,y), axis =0)
print(xy)
print(xy.shape)
xy = np.concatenate((x,y.T), axis =1)
print(xy)
print(xy.shape)
xy = np.concatenate((x,y), axis =None)
print(xy)
print(xy.shape)