'''
Created on 2021. 7. 14.
예외 처리 이해하기
@author: pc354
'''
import time


try:
    print(param)
except Exception as e:
    print(e)
    
count = 1
try:
    while True:
        print(count)
        count += 1
        time.sleep(0.5)
except Exception as e: # Ctrl + C 가 입력되면 발생하는 오류
    print('사용자에 의해 프로그램이 중단되었습니다.',e)
    print('사용자에 의해 프로그램이 중단되었습니다.')