'''
Created on 2021. 7. 14.
소수의 정의 : 자신보다 작은 두개의 자연수를 곱하여 만들 수 없는 1보다 큰 자연수
@author: pc354
'''

def getPrime(x):
    if x%2 == 0:
        return
    for i in range(3, int(x/2),2):
        if x%i == 0:
            break
    else: # for 루프문이 정상적으로 수행되었으면 마지막 할일
        return x
    
#############################################

listdata = [3,5,17,57,117,119,1113,23423,11113,11119,1212123,1111111111119]
list_data = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30]
ret = filter(getPrime,listdata)
ret1 = filter(getPrime,list_data)
print(list(ret))
print(list(ret1))