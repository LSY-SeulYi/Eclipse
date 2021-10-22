'''
Created on 2021. 7. 19.
스택구현
@author: pc354
'''

mystack = []
def push(data):
    mystack.append(data)
    
def pop():
    try:
        res = mystack.pop()
        return res
    except:
        print('더이상 자료가 존재하지 않습니다.')

push('500')
push('100')
push('50')

print(pop())
print(pop())
print(pop())
print(pop())