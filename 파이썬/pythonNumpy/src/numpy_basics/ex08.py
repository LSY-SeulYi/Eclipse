'''
Created on 2021. 8. 2.
Basic array operations
@author: pc354
'''

import numpy as np

data = np.array([1, 2])
ones = np.ones(2, dtype=int)
print(data + ones)
print(data - ones)
print(data * data)
print(data / data)
a = np.array([1, 2, 3, 4])
print(a.sum())
print(a*7.8) # Broadcasting
b = np.array([[1, 1], [2, 2]])
print(b.sum(axis=0))
print(b.sum(axis=1))


a = np.array([[0.45053314, 0.17296777, 0.34376245, 0.5510652],
              [0.54627315, 0.05093587, 0.40067661, 0.55645993],
              [0.12697628, 0.82485143, 0.26590556, 0.56917101]])
print(a.max(axis=1))
print(a.min(axis=1))
print(a.sum(axis=1))