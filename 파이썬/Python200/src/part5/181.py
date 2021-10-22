'''
Created on 2021. 7. 20.
데이터 처리하기 (연도별 출생아 수 계산하기)
@author: pc354
'''

def countBirths():
    ret = []
    for i in range(1880,2016):
        count = 0
        fileName = 'names/yob%d.txt'%i
        with open(fileName,'r',encoding = 'utf-8') as f:
            data = f.readlines()
            for j in data:
                if j[-1] == '\n':
                    j = j[:-1]
                birth = j.split(',')[2]
                count += int(birth)
        ret.append((i,count)) # 리스트의 아이템으로 튜플을 만들어 저장
    return ret
result = countBirths()
# 연산 결과를 파일로 출력하기
with open('birth_by_year.csv','w') as h: # csv 포맷 (콤마로 분리된 포맷)
    for year, birth in result:
        data = '%s, %s\n' %(year,birth)
        print(data)
        h.write(data)
        
with open('stockcode.txt','r') as f:
    data = f.read()
    print(data)