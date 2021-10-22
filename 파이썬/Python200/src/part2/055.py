'''
Created on 2021. 7. 14.
예외 처리
@author: pc354
'''
try:
    print('안녕하세요')
    print(param)
except:
    print('param변수를 선언한 적이 없어요!')
else:
    print('예외가 발생하지 않았어요.')
finally:
    print('예외 발생 여부와 관계없이 이 부분 출력!')