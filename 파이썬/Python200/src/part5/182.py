'''
Created on 2021. 7. 20.
데이터 처리하기 (연도별 성별 출생아 수 계산하기)
@author: pc354
'''

def countBirthsByGender():
    ret = []
    for x in range(1880,2016):
        count_f = 0
        count_m = 0
        fileName = 'names/yob%d.txt'%x
        with open(fileName,'r',encoding = 'utf-8') as f:
            data = f.readlines()
            for i in data:
                i = i.replace('\n','')
                # if i[-1] == '\n':
                #     i = i[:-1]
                temp = i.split(',')
                gender = temp[1]
                birth = temp[2]
                if gender == 'F':
                    count_f += int(birth)
                else:
                    count_m += int(birth)
        ret.append((x,count_f,count_m))
    return ret
result = countBirthsByGender()
with open('birth_by_gender.csv','w') as f:
    for x, bf, bm in result:
        data = '%s,%s,%s\n'%(x,bf,bm)
        print(data)
        f.write(data)