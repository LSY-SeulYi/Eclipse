'''
Created on 2021. 7. 16.
요소 추가 (append) ~ 한 개씩 요소를 추가함
@author: pc354
'''

listData = []
cnt = 0
while True:
    if cnt>5:
        break
    listData.append(input('추가할 요소 입력: '))
    cnt += 1
print(listData)

listData1 = []
for x in range(6):
    listData1.append(input('추가할 요소 입력: '))
print(listData1)