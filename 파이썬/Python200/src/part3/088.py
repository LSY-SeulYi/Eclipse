'''
Created on 2021. 7. 14.
문자열에 포함된 공백제거 - 빅데이터 전처리시 많이 사용
@author: pc354
'''

big_data = '''
정부가 전국 각 지역에 적용될 사회적 거리두기 단계와 지방자치단체가 개별적으로 시행할 방역조치를 14일 발표합니다.

손영래 중앙사고수습본부 사회전략반장은 13일 백브리핑에서 "내일은 새로운 거리두기 체계의 '이행기간'이 완료되는 시점"이라며 "지역별 거리두기 단계와 방역조치, 사적모임 규제를 일괄 취합해 
내일 중앙재난안전 대책본부(중대본)브리핑에서 안내할 예정"이라고 밝혔습니다.

비수도권 지자체들은 지난 1일부터 시행된 새로운 거리두기 도입 후 14일까지 2주간 지역상황에 맞게
방역을 강화하는 이행기간을 가졌습니다.

수도권은 코로나19 확산세로 새 거리두기 시행을 미루다 지난 12일부터 7월 거리두기 개편 4단계를 적용하고 있습니다.

손반장은 '비수도권의 거리두기를 모두 3단계로 격상하는 방안도 검토하고 있느냐'는 질문에
"지역별로 확진자 편차가 큰 편"이라며 "전국적으로 획일적 조치를 하는 것은 타당하지 않다"고 대답했습니다.

전파력이 강한 '델타형' 변이 바이러스 확산 상황에 대해선 "6월 중순만 해도 전체 확진자 가운데 델타 감염이 2∼4% 정도로 낮았으나, 최근에는 25%가 넘게 검출되는 등 빠른 속도로 번지고 있다"며 "현재로서는 델타형 확산 속도를 상당히 경계해야 한다"고 강조했습니다.
'''

big_data = big_data.replace('?',' ')
big_data = big_data.replace('"',' ')
big_data = big_data.replace('"',' ')
big_data = big_data.replace("'",' ')
big_data = big_data.replace("'",' ')
big_data = big_data.replace("\n",' ')
big_data = big_data.replace("%",' ')

words = big_data.split(sep=' ')
for x in words:
    x=x.strip()
print(words)
words2 = []

# 전처리 작업 - 특수문자가 포함된 단어를 특수문자 부분을 스페이스로 대체
for x in words:
    if x == '':
        continue
    else:
        words2.append(x)
print(words2)

# 숫자를 포함한 단어를 제거
words3 = []
for x in words2:
    isOk = True
    for y in x:
        if y.isdigit():
            isOk = False
            break
    if isOk:
         words3.append(x)
print(words3)