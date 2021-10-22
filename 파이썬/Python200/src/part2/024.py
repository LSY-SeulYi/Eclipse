'''
Created on 2021. 7. 12.
논리 연산자 이해하기 (and, or, not)
@author: pc354
'''
bool1 = True; bool2 = False; bool3 = True; bool4 = False
print(bool1 and bool2)
print(bool1 and bool3)
print(bool2 or bool3)
print(bool2 or bool4)
print(not bool1)
print(not bool2)

a = 5
b = 11
if a>0 and a<10:
    print('a는 0과 10사이의 정수입니다.')
else:
    print('범위밖')
if not a>=10:
    print('a는 10이상이 아닙니다.')
if b>0 and b<10:
    print('b는 0과 10사이의 정수입니다.')
else:
    print('b는 범위밖입니다.')
if not b>=10:
    print('b는 10이상이 아닙니다.')
else:
    print('b는 10이상입니다.')