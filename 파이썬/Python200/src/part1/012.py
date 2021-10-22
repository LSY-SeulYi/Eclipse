'''
Created on 2021. 7. 8.
for~(continue,break)
@author: pc354
'''
for x in range(46):
    if(x%2==0):
        continue
    else:
        print(x,end=' ')

sum = 0        
for x in range(99999):
    if(x>100):
        break; # 루프문 탈출
    sum+=x
else:
    print('for문을 탈출했어요! 그래서 else 문이 실행되지 않아서 출력 되지 않습니다.')
print('\nsum',sum);