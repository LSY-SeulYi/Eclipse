'''
Created on 2021. 7. 15.
문자열에서 특정 문자(열) 위치 찾기
@author: pc354
'''

txt = '많은 것들이 매일 매일 일어난다.'
offset1 = txt.find('매') # find('찾으려는 문자 혹은 문자열', 찾기를 시작하는 위치 지정)
print(offset1)

# '매' 가 있는 위치 모두를 찾고 싶을 때
offset2 = txt.find('매',offset1+1)
print(offset2)

##########################################################

txt2 = '''
살어리 살어리 랏다 청산에 살어리 랏다
나마자기 구조개랑 먹고 청산에 살어리랏다
'''

# '살어리'가 있는 위치 모두 다 찾기 (없는 자료 찾을 때는 값이 -1이 나옴)
offset3 = txt2.find('살어리') 
print(offset3)
print()
      
start = 0
while True:
    pos = txt2.find('살어리',start)
    if pos == -1:
        break
    print(pos)
    start = pos+1 # +1을 넣어 줘야 그 다음을 찾아 줌 안그러면 무한 루프에 빠져서 찾은자리 계속 찾음