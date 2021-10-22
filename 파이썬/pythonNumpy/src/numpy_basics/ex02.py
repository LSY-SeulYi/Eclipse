'''
Created on 2021. 8. 2.
Numpy의 기초 배열 만드는 법
@author: pc354
'''

import numpy as np


a = np.array([1, 2, 3])
b = np.zeros(5)
c = np.ones(5)
d = np.empty(5) # 빈 array 만들기
e = np.arange(2,9,2) # 2에서 9까지 2씩 증가시켜라
f = np.linspace(0, 10, num=5) # 0에서 10까지 5등분으로 나눠라
print(a)
print(b) # 0.0 ==> 0. (실수 0을 5개 만드는 것)
print(c)
print(d)
print(e) # 2에서 9까지 2씩 증가시킨 값
print(f) # 0에서 10까지 5등분으로 나눈 값
print(np.array([np.zeros(2),np.zeros(2),np.zeros(2)]))
print(np.array([np.ones(2),np.ones(2),np.ones(2)]))
print(np.linspace(0, 25, num=5))
x = np.ones(10,dtype=np.int64)
print(x)