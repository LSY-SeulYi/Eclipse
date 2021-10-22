'''
Created on 2021. 7. 16.
리스트의 요소가 모두 참인가 확인
@author: pc354
'''

list_a = [-1,0,1,2,3,4,6.78,'a',True,False,'',[1],{},None]

for x in list_a:
    if x==True:
        print(True,end=' ')
    else:
        print(False,end=' ')

print() 

while 1: # True
    break
    pass

print(all(list_a)) # list_a 에 있는 것이 전부 True 인가?

print(not all(list_a)) # list_a 에 있는 것이 전부 False 인가?

print(any(list_a)) # list_a 에 있는 것 중 True가 있는가?