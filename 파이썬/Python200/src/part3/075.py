'''
Created on 2021. 7. 14.
특정 위치의 문자 얻기
@author: pc354
'''

txt1 = '강나루 건너서 밀밭길을 구름에 달 가듯이 가는 나그네'
print(txt1[10])
print(txt1[-3])
print(txt1[13:22])

txt2 = 'PYTHONISAMYFRIEND!'
for x in range(len(txt2)):
    print(txt2[:x+1])
    
# 문자열에서 홀수 번째 문자들만 추출하기
res = txt2[::2]
print(res)

# 문자열을 리버스 (거꾸로)
res = txt2[::-1]
print(res)
res1 = txt1[::-1]
print(res1)

# 문자열 합치기
print(txt2+txt1)
print(txt2+str(365))

# 문자열의 반복
print(txt2*2)

# 수집 정보에 '선거' 라는 단어가 있는지 알아보기
수집정보 = '선거는 정치인에게 국민이 권한을 부여하는 것이므로 신중해야 한다.'
if '선거' in 수집정보:
    print('정치에 관심이 많으시네요~~')
else:
    print('정치에 무관심한 자네요;;')
    
# 문자열이 알파벳으로 구성되어 있는 지 확인
if 수집정보.isalpha():
    print('이 정보 발생지는 영문 문화권입니다~~')
else:
    print('이 정보 발생지는 영문 문화권이 아닙니다..')
    
