'''
Created on 2021. 7. 15.

@author: pc354
'''
from part3.score import ScoreVO

scores = [
    ScoreVO('홍길동',88,70,86),
    ScoreVO('윤성찬',76,98,36),
    ScoreVO('박찬동',98,87,68),
    ScoreVO('고영탁',69,79,49),
    ScoreVO('성담수',76,48,93),
    ScoreVO('유관순',78,69,36)
    ]

# 성적순
scores.sort(key=lambda obj:-obj.total)
for x in scores:
    print(x.name, x.kor, x.eng, x.math, x.getTotal(),x.getAvg())
    
# 이름순
scores.sort(key=lambda obj:obj.name)
for x in scores:
    print(x.name, x.kor, x.eng, x.math, x.getTotal(),x.getAvg())
    
## 총점의 오름차순으로 원본에 영향을 주지 않고 새로운 자료로 정렬하기
sortedData = sorted(scores, key=lambda obj:-obj.total)
for x in sortedData:
    print('이름: %s 총점: %d 평균:%5.2f'%(x.name,x.total,x.avg))