'''
Created on 2021. 7. 8.
if문 활용 - if 문, if ~ else, if else ~ else~... else
@author: pc354
'''
################################ 성적처리 #########################################
# input되는 모든 것은 일단 문자열로 취급
score = int(input('성적을 입력하세요')) # 문자를 숫자로 바꾸는 법
print('당신이 입력한 점수',score)

if score>60:
    print('일단 당신은 통~ 이요.')
else:
    print('당신은 불통~ 이요!')
    
################# 학점 출력
print(score)

tail = ''
grade = 'F'

if score>=60 and score%10>=5:
    tail= '+'
elif score>=60:
    tail= '0'
if score>=90:
    grade='A'+tail
elif score>=80:
    grade='B'+tail
elif score>=70:
    grade='C'+tail
elif score>=60:
    grade='D'+tail
    
print('당신은 '+grade+'등급입니다.')