'''
Created on 2021. 8. 3.
평균 제곱 오차 계산하기
@author: pc354
'''


import numpy as np

predictions = np.array([77,88,90,45,89])
labels = np.array([67,89,95,60,70])

error = (1/np.size(predictions))*np.sum(np.square(predictions-labels))
print(error)
print(np.sqrt(error)) # 편차값 (sqrt => 루트씌움)

a = np.array([1,2,3,4,5,6])
np.save('fileArray01.arr')

b = np.load('fileArray01.npy')
print(b)

np.savetxt('dataTxt.csv')