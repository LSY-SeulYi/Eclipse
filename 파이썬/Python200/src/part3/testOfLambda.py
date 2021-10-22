'''
Created on 2021. 7. 16.
람다를 사용하는 함수들
map(), reduce(), filter(), sort()
람다 양식 => lambda 인자 : 표현식
@author: pc354
'''
from _functools import reduce


a = (lambda x,y: x+y)(10,20)
print(a)

list_res = map(lambda x:x**3,range(10))
print(list(list_res))

# reduce = 수식을 줄였다. 연산식 줄이기.
print(reduce(lambda x,y:x+y,range(101))) # 0~100까지 더하기

list_a = list(filter(lambda x: x%2 == 0,[12,3,4,54,65,342,54,76,34,23,12,11])) # x를 2로 나누어서 0인 것은? => 짝수
list_b = list(filter(lambda x: x%2,[12,3,4,54,65,342,54,76,34,23,12,11])) # x%2==1 이나 마찬가이 (x를 2로 나누어서 0이 아닌것은?) => 홀수
print(list_a)
print(list_b)