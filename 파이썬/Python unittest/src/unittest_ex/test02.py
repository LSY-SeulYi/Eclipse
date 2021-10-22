'''
Fixture(픽스츄어) 활용

'''

import unittest
import os

# 테스트 대상 함수 만들기 (파일이 몇 줄짜리 인지 테스트 해보기)
def custfunc(fileName):
    with open(fileName,'rt',encoding='utf-8') as f:
        return sum(1 for _ in f) # f를 한줄씩 읽고 1씩 더해간다는 뜻
    
# 테스트케이스 만들기
class MyTestCase(unittest.TestCase):
    # 사전 Fixture 준비
    def setUp(self): # 사전 Fixture 준비 작업인데 setUp으로 정해져 있음
        # 테스트 시작하기 전 해야할 작업 : 여기선 파일 생성 작업을 해봄
        self.fileName = 'text_file.txt'
        with open(self.fileName,'wt',encoding='utf-8') as f:
            f.write('''
                파이썬은
                단위 테스트 모듈(프레임 워크)이
                기본으로 포함 되어 있음.
                오호~ 라~
                머쮠뒈~?
                굿~쨥~
            '''.strip())
    
    # 사후 Fixture 준비
    def tearDown(self):
        # 테스트 종료 후에 수행할 작업 : 여기서는 테스트 한 파일 제거
        try:
            os.remove(self.fileName)
        except:
            pass
        
    # 테스트 함수들
    def test_runs(self):
        custfunc(self.fileName)
    
    def test_line_count(self):
        self.assertEqual(custfunc(self.fileName),6)
        
    # 실패 테스트 ~ 없는 파일을 열려고 할 때에 IOError가 발생하는 지 테스트
    def test_no_file(self):
        with self.assertRaises(IOError):
            custfunc('abcd.txt')
        
if __name__=='__main__':
    unittest.main()