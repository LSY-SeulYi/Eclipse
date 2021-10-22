'''
Created on 2021. 8. 2.

@author: pc354
'''

import numpy as np

a = np.arange(6)
print(a)

a2 = a[np.newaxis, :] # 몇행 몇열 인가?
print(a2)
print(a2.shape) # 몇행 몇열 인가?

# Numpy의 Array와 Python의 list 비교
aa = np.array([0, 1, 2, 3, 4, 5]) # 1차원
print(aa[0])
print(aa==a)
a = np.array([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]) # 2차원
print(a[0])
print(a.shape)

# Numpy의 Array는 1차원 배열, 2차원 배열, 다차원 배열(ndarray), vector, matrix가 있다.
