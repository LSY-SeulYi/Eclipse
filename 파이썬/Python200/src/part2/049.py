'''
Created on 2021. 7. 13.
클래스의 이해
@author: pc354
'''
from part2.mymodule2 import MyMember, Bundle, Bundle2


class MyClass: # 클래스
    name = '홍길동' # 멤버필드
    age = 19 # 멤버필드
    def sayHello(self): # 메소드 (self 가 기본적으로 무조건 들어감, self는 java 에서 this 라고 볼수 있음) 
        print(self.name+'님 안녕하세요.')
        
def disp(): # 함수
    print('그냥출력합니다.')
    
obj = MyClass()
obj.sayHello();

disp()

mem = MyMember('박순창',56,'010-3333-4444','충청북도 단양')
print(mem.__toString__())

bd = Bundle(name = '홍길동', age = 18)
print(bd.name,bd.age)

bd2 = Bundle2('홍길동','단양','동에번쩍','서에번쩍')
print(bd2)