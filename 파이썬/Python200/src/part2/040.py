'''
Created on 2021. 7. 13.
함수 인자 이해하기
@author: pc354
'''

def add_txt(t1,t2="물건너"):
    print(t1+';'+t2)
    
add_txt('강나루','건너서')
add_txt('강나루')
add_txt(t2='헤엄쳐',t1='낙동강')

def func1(*args):   # java에서는 void xxx(String...args)으로 볼수 있음
    for x in args:
        print(x)
func1('나의','살던','고향은','꽃피는','산골')

def sum1(*num):
    sum1 = ""
    for x in num:
        sum1 = str(sum1) + x
    print('가변형 인수의 합은 : %s'%sum1)
sum1('가','나','다','라','마','바','사')

def sum(*num):
    if str(type(num[0]))=="<class 'str'>":
        print("문자열이어서 합산되지 않습니다. 결합합니다.")
        line = ""
        for x in num:
            line = line + x
        print("문자열의 결합은 :", line)
    else:
        hab = 0
        for x in num:
            hab = hab + x
        print("숫자의 합은",hab,"입니다.")
sum(1,2,3,4,5,6,7,8,9,10)
sum('갑','을','병','정')

def func3(width,height,**etc):
    print(width,height)
    print(etc) # dic 로 바껴서 출력 됨
func3(10,20,depth=30,color='blue')

func3(height=100,width=200,depth=300,color='black')