'''
Created on 2021. 8. 2.
Indexing and slicing
@author: pc354
'''

import numpy as np

data = np.array([1,2,3,4,5,6,7])
print(data[1]) # Indexing
print(data[0:2]) # slicing
print(data[3:])
print(data[-2:])

a = np.array([[1,2,3,4],[2,3,4,5],[6,7,8,9],[9,10,11,12]])
print(a.shape)
five_up = (a>=5)
print(five_up)
print(a[five_up])
b = a[a>=5]
print(b)

# 짝수만 추출하기
c = a[a%2==0]
print(c)

# 응용 5~9
d = a[(a>=5) & (a<=9)]
print('5~9사이의 값들 :',d)

a = np.array([[1,2,3,4],[5,6,7,8],[9,10,11,12]])
b = np.nonzero(a<5) # 결과의 첫번째 배열 이러한 값이 있는 행 인텍스, 두번째 배열
print(b)

c = list(zip(b[0],b[1]))
print(c)
for x in c:
    print(x)
print(a[b])
d = np.nonzero(a == 42)
print(d)
d2 = np.nonzero(a >= 12)
print(d2)