'''
Created on 2021. 7. 15.
문자열을 정렬하기 (sorted, join)
@author: pc354
'''

str = input('정렬할 문자열을 입력하세요')
ret1 = sorted(str)
print(ret1)
ret2 = ''.join(ret1)
print(ret2)
print(str)


## reverse 하면 내림차순으로 됨
ret3 = sorted(str,reverse=True)
print(ret3)