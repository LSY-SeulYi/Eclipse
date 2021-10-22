'''
Created on 2021. 7. 16.
사전 정렬하기 (sorted)
@author: pc354
'''

dic_data = {
    '정아':34500,'윤아':45000,'희야':7700,'경희':4522,'미정':8900,'정미':1200
    }
ret1 = sorted(dic_data)
print(ret1)


def f1(x):
    return x[0]
def f2(x):
    return x[1]
ret2 = sorted(dic_data.items(), key=f1)
print(ret2)
ret3 = sorted(dic_data.items(), key=f2)
print(ret3)
ret4 = sorted(dic_data.items(), key=f2, reverse=True)
print(ret4)

ret2 = sorted(dic_data.items(), key = lambda x:x[0])
print(ret2)
ret3 = sorted(dic_data.items(), key = lambda x:x[1])
print(ret3)
ret4 = sorted(dic_data.items(), key = lambda x:x[1], reverse=True)
print(ret4)
