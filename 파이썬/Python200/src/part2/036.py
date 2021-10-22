'''
Created on 2021. 7. 12.
리스트 이해하기 ([])
@author: pc354
'''

def myfunc():
    print('안녕하세요')
    
list1 = [1,2,3,4,5]
list2 = ['a','b','c','d']
list3 = [1, 'a', 'boy', [1,2,3,4,5],['a','b','c'],['갑','을'],myfunc]

def func1():
    print('함수1을 호출했습니다.')
def func2():
    print('함수2을 호출했습니다.')
def func3():
    print('함수3을 호출했습니다.')
def func4():
    print('함수4을 호출했습니다.')
def func5():
    print('함수5을 호출했습니다.')
funcList = [func1,func2,func3,func4,func5]

for x in funcList:
    x()