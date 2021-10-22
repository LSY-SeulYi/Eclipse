'''
테스트란 ~ 소프트웨어 요구사항에 의해 개발된 산출물이 요구사항과 부합하는지 여부를 검증하는 작업

단위테스트란 ~ 모듈 또는 응용 프로그램 내의 개념 코드 단위가 예상대로 작동하는지 확인 하는 [반복 가능한 활동!!]

TestCase ~ 유닛테스트 프레임 워크의 테스트 조직의 기본단위 (class단위)
Fixture ~ 테스트 함수의 전 혹은 후에 설정하는 것으로 
    전 : 테스트 환경을 만들기 위함 (예: 디비 테이블 형성, 초기 값 부여)
    후 : 사용한 리소스의 정리 혹은 삭제 (예: 디비 삭제 등)
assertion ~ 테스트 결과 성공인지 실패인지를 확인하는 용도로 사용

'''

import unittest

def custfunc():
    print("custom test success ~~~~")
    pass

class MyTestCase(unittest.TestCase):
    # 테스트 함수 만들기 (파이썬은 테스트를 앞에 꼭 붙여줘야 함)
    def test_runs(self):
        custfunc() # 테스트 대상이 되는 함수
        pass
    
if __name__ == '__main__':
    unittest.main()