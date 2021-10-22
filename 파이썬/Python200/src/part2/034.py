'''
Created on 2021. 7. 12.
문자열 포맷팅 이해하기
@author: pc354
'''

name = input('what your name?')
line = '당신의 이름은 %s 입니다.' %(name)
print(line)

ho = input('당신의 호는?')
asset = 32000000
line2 = '당신의 호는 %s 이고 이름은 %s 이며 재산은 %d$ 입니다.' %(ho,name,asset)
print(line2)

for x in range(10):
    print('%d * %d = %2d'%(9,x,(9*x)))
    
