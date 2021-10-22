'''
Created on 2021. 7. 15.
문자열을 특정문자(열)로 결합하기(join)
@author: pc354
'''

data = ['가지','오이','토마토','호박','고추']
res = ','.join(data)
print(res)
res1 = ''.join(data)
print(res1)
res2 = ';'.join(data)
print(res2)