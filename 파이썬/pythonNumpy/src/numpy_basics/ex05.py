'''
Created on 2021. 8. 2.
Can you reshape an array?
@author: pc354
'''

import numpy

import numpy as np


a = np.arange(6)
print(a)
b = a.reshape(3, 2)
print(b)
numpy.reshape(a, newshape=(1, 6), order='C')
print(a.shape)
print(b.shape)

a = np.array([1,2,3,4,5,6])
print(a.shape) # 1행 6열 짜리 배열이 아님
a2 = a[np.newaxis,:]
print(a2.shape) # 1행 6열
print(a2)
a3 = a[:,np.newaxis]
print(a3.shape) # 6행 1열
print(a3)
b = np.expand_dims(a,axis = 0) # 1행 6열
print(b.shape)
b2 = np.expand_dims(a,axis = 1) # 6행 1열
print(b2.shape)