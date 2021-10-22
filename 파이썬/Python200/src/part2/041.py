'''
Created on 2021. 7. 13.
지역변수와 전역변수의 이해
@author: pc354
'''
# function안에서만 쓰는것 : 지역변수
# 모듈 안에서만 쓰는것 : 전역변수

param = 10
strdata = '전역변수'

def func1():
    strdata = '지역변수'
    print(strdata)
func1()

def func2(param):
    param = 1
    print(param)
func2(param)
print(param)

def func3(x):
    global strdata
    strdata ='전역변수'
    print(strdata)
    strdata = '지역변수'

print(strdata)