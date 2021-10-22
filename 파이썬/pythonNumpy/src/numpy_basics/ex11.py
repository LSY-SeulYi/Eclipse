'''
Created on 2021. 8. 3.

@author: pc354
'''

import numpy as np

arr = np.array([1,2,3,4,5,6,7,8])

arrr = np.flip(arr)
print(arr)

arr_2d = np.array([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]])
reversed_arr = np.flip(arr_2d)
print(reversed_arr)
reversed_arr_rows = np.flip(arr_2d, axis=0)
print(reversed_arr_rows)
reversed_arr_columns = np.flip(arr_2d, axis=1)
print(reversed_arr_columns)
arr_2d[1] = np.flip(arr_2d[1])
print(arr_2d)
arr_2d[:,1] = np.flip(arr_2d[:,1])
print(arr_2d)

x = np.array([[1 , 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]])
x.flatten()
a1 = x.flatten()
a1[0] = 99
print(x)  # Original array
print(a1)  # New array
a2 = x.ravel()
a2[0] = 98
print(x)  # Original array
print(a2)  # New array

print(help(max))
