'''
Created on 2021. 7. 14.
문자열이 숫자인지 검사하기
@author: pc354
'''

data = input('자료를 입력하세요: ')
if(data.isdigit()):
    print(int(data)*int(data))
else:
    print('제곱을 구할 수 없는 값이 입력되었습니다...')
    
# 문자열의 대소문자 변환
my_maxim = 'Boys, Be ambitious !'

print(my_maxim.upper())
print(my_maxim.lower())
