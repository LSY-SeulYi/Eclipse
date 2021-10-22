'''
Created on 2021. 7. 14.
클래스와 소멸자 이해
@author: pc354
'''

class MyClass(object):
    def __del__(self): # 소멸자
        # 객체가 메모리에서 릴리즈 될 때에 수행하는 부분
        print('MyClass 인스턴스 객체가 메모리에서 제거될 때 자동으로 호출됩니다.')
        
    def __init__(self): # 생성자
        print('MyClass 인스턴스가 생성되었습니다.')
        
    def toString(self):
        return '소멸자 확인 클래스입니다.'
    
##################
#  위 클래스 테스트  #
##################
obj = MyClass() # 객체생성
print(obj.toString) # 생성된 객체의 기본 정보 출력
print(obj.toString()) # 생성된 객체의 활용
obj.__del__() # 생성된 객체의 소멸자 호출 (주의 ~ 소멸자를 임의로 호출하였다고 하여 메모리에서 객체가 제거?)
print(obj.toString()) # 객체의 재활용 ~ 문제없음 (소환)
# del obj # 객체의 완전 제거
# # 아래줄은 에러가 발생됨 (객체가 제거된 상태이기 때문)
print(obj.toString())