'''
Created on 2021. 7. 12.
시퀀스 자료 인덱싱 이해하기
@author: pc354
'''
maxim = 'Time is gold!'
list_data = [1,2,[1,2,3]]
print(maxim[5])
print(maxim[-2])
print(list_data[0])
print(list_data[-1]) # 뒤에서 첫번째, -0은 없음.
print(list_data[2][-1])
print(list_data[2][2]) # 2차원 배열 접근
