'''
Created on 2021. 7. 16.
리스트의 모든 요소를 인덱스와 쌍으로 추출하기
@author: pc354
'''

list_data = ['갑자','을축','병인','정묘']

ret = list(enumerate(list_data))
print(ret)

for i,val in ret:
    print('60갑자의 %d 은 %s 입니다.'%(i,val))
    
tuple_data = ('가','나','다','라','마')
ret = list(enumerate(tuple_data))
print(ret)
for i,val in ret:
    print('한글의 제%d 단은 %s 입니다.' %(i,val))