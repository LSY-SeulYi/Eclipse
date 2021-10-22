'''
Created on 2021. 7. 16.
람다함수
@author: pc354
'''

def sum(a,b):
    return  a+b
print(sum(10,20))


lb = lambda a,b : a+b
lb1 = lambda a,b : a-b
lb2 = lambda a,b : a/b
lb3 = lambda a,b : a*b
print(lb(10,20))
print(lb1(10,20))
print(lb2(10,20))
print(lb3(10,20))

########################################################

cp = lambda a,b: (a*10)+(b/33)*a

calc = [
    lambda a,b : a+b,
    lambda a,b : a-b,
    lambda a,b : a/b,
    lambda a,b : a*b,
    cp
]
a = int (input('수a: '))
b = int (input('수b: '))
for x in calc:
    print(x(a,b))
    
    
########################################################

cp = lambda a,b: (a*10)+(b/33)*a






















