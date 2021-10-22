'''
Created on 2021. 7. 12.
시퀀스 자료 슬라이싱 이해하기
@author: pc354
'''

poem = '청산리 벽개수야 수이감을 자랑마라'
print(poem)
print(poem[0:3]) # 0에서 3직전까지
print(poem[:8]) # 처음부터 8직전까지
print(poem[9:]) # 9부터 끝까지
print(poem[1:5])
print(poem[:7])
print(poem[:9])
print(poem[:-3])
print(poem[-3:])
print(poem[:]) # 모두다를 의미
print(poem[::2]) # 모두다를 1칸씩 건너띄기 (2칸마다 출력됨)
print(poem[::3]) # 모두다를 2칸씩 건너띄기 (3칸마다 출력됨)