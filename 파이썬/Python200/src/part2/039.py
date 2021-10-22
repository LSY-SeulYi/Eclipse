'''
Created on 2021. 7. 12.
함수의 이해- 모듈 내에서 사용자 정의 함수를 사용할 때에는 사용전 먼저 정의 되어있어야 한다.
@author: pc354
'''
def add_number(n1,n2):
    ret = n1+n2
    return ret

def add_txt(t1,t2):
    print(t1+t2)
    
    ans=add_number(10, 15)
    print(ans)
    text1 = '대한민국'
    text2 = '만세!!'
    add_txt(text1,text2)
    
def foo():
    print('foo~')
    
foo()
# 자바와 다르게 미리 선언단에서 반환 타입을 표기하지 않는다.

def someFunc():
    return 10000
def someFunc2():
    print('함수가 처리한 것')
print(someFunc())
print(someFunc2())
def someFunc3(a,b):
    return '%2d * %2d = %4d' %(a,b,(a*b))

print(someFunc())
someFunc2()
print(someFunc3(8,9))

# 중첩 for문
for x in range(10):
    for y in range(2,10):
        print(someFunc3(y, x),end='\t')
    print()