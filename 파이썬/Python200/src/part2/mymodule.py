'''
Created on 2021. 7. 13.
사용자 정의 모듈
@author: pc354
'''

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

#####################################################################

def reverse(x,y,z):
    return z,y,x

#####################################################################

def message(msg):
    제목 = '호주 여행'
    게시자 = '박한상'
    게시일 = '2021-5-7'
    return 제목,게시자,게시일,msg

#####################################################################

def someFunc3(a,b):
    return '%2d * %2d = %4d' %(a,b,(a*b))

