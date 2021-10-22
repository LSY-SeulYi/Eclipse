'''
Created on 2021. 7. 14.
필터링 연습
@author: pc354
'''

# 필터 적용할 함수
def isPass(score): # 주어진 점수로 합격 여부 판단
    if score >= 60:
        return score
    else:
        return
    

data = [60,44,67,78,90,99,35,77,12]

res = filter(isPass,data)
print(list(res))