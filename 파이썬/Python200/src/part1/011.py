'''
Created on 2021. 7. 8.
For문
@author: pc354
'''
scope = [1,3,5,7,9]
for x in scope:
    print(x,end=',')
print() # 줄바꿈
tuple = [23,56,78,99,100]
for x in tuple:
    print(x,end='/')
print() # 줄바꿈
dict = {'a':'abandon','b':'boy','c':'cry','d':'dog'}
for x in dict:
    print(x,dict[x])
#####################################################################
# 1~100까지 합 구하기
sum = 1
for x in range(1,101):
    sum += x
print(sum)
#####################################################################
# 1~10까지 곱하기
a = 1
for x in range(1,11):
    a *= x
print(a)
#####################################################################
# 1~100까지 빼기
a = 1
for x in range(1,101):
    a -= x
print(a)
#####################################################################
# 1~10까지 나누기
a = 1
for x in range(1,11):
    a /= x
print(a)
#####################################################################
poem = '''
이화에 월백하고 은한이 삼경인제
일지춘심을 자규야 알랴만은
다정도 병인양하여 잠못들어 하노라
'''
for x in poem:
    print(x,end='/')