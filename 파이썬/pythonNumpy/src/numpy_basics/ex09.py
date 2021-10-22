'''
Created on 2021. 8. 2.
Creating Matrix
@author: pc354
'''

import numpy as np

data = np.array([[1, 2], [3, 4], [5, 6]])
print(data[0,1])
print(data[1:3])
print(data[0:2,0])

rng = np.random.default_rng(0)
print(rng.random(3))
rng = np.random.default_rng()
print(rng.random(3))

# 난수를 정수로 발생
rnd = np.random.default_rng()
print(rnd.random((5,3)))
nums = rnd.integers(46,size=(10,6)) # 0~45 사이의 정수로 10행 6열 만들어라
print(np.sort(nums,axis=1))

# 유니크한 값 추출하기 (중복배제)
a = np.array([11,11,23,12,34,12,33,12,41,12,56,32,33])
uv = np.unique(a)
print(uv)