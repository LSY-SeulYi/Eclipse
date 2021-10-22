'''
Created on 2021. 8. 2.
How 
This section convers slicing and indexing, np.vstack(), np.hstack(), np.hsplit(), .view(), copy()
@author: pc354
'''

import numpy as np

# indexing
a = np.array([1,  2,  3,  4,  5,  6,  7,  8,  9, 10])
arr1 = a[3:8]
print(arr1)

# np.vstack(), np.hstack()
a1 = np.array([[1, 1],
               [2, 2]])
a2 = np.array([[3, 3],
               [4, 4]])
print(np.vstack((a1, a2)))
print(np.hstack((a1, a2)))

# np.hsplit()
x = np.arange(1, 25).reshape(2, 12) # 어레인지의 숫자와 리쉐이프의 숫자가 동일해야 함.
print(x)
print(np.hsplit(x, 3)) # 자료를 3등분 하고, 행이 여러개 일 경우 나누어진 같은 컬럼의 데이터를 묶는다.
print(np.hsplit(x, (3, 4)))

# .view() ==> 이 view메서드를 사용하여 원본 배열과 동일한 데이터를 보는 새 배열 객체를 만들 수 있습니다 ( 얕은 복사 ), copy()
a = np.array([[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]])
b1 = a[0, :]
print(b1)
b1[0] = 99 # 원본을 수정하게 되기 때문에 주의해야함!
print(b1)
print(a)
b2 = a.copy()
print(b2)