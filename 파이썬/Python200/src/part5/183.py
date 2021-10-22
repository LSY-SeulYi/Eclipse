'''
Created on 2021. 7. 20.
연도별 인기 상위 10 성별 출생아 이름 구하기
@author: pc354
'''
from os.path import exists

def getTop10BabyName(year):
    nameF = {}
    nameM = {}
    fileName = 'names/yob%s.txt'%year
    if not exists(fileName):
        print('[%s]파일이 존재하지 않습니다.'%fileName)
        return None
    with open(fileName,'r') as f:
        data = f.readlines()
        for d in data:
            if d[-1] == '\n':
                d = d[:-1]
            temp = d.split(',')
            name = temp[0]
            gender = temp[1]
            birth = temp[2]
            if gender == 'F':
                ret = nameF
            else:
                ret = nameM
            if name in ret:
                ret[name] += int(birth)
            else:
                ret[name] = int(birth)
        retF = sorted(nameF.items(),key=lambda x:x[1], reverse = True)
        retM = sorted(nameM.items(),key=lambda x:x[1], reverse = True)
        for i, name in enumerate(retF):
            if i>9:
                break
            print('TOP_%d 여자아기이름: %s'%(i+1, name))
        for i, name in enumerate(retM):
            if i>9:
                break
            print('TOP_%d 남자아기이름: %s'%(i+1, name))
year=input('인기순 상위 10개 이름을 알고 싶은 출생년도를 입력하세요 (예:2001) : ')
getTop10BabyName(year)