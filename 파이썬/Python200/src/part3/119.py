'''
Created on 2021. 7. 16.
shuffle을 이용한 로또 번호 생성기
@author: pc354
'''
from random import shuffle


lottoes = list(range(46))
shuffle(lottoes)
lotto = lottoes[0:6]
lotto.sort()
print(lotto)

