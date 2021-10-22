'''
Created on 2021. 7. 19.
137/138 응용
@author: pc354
'''

#### [(000020,동화약품),(000040,S&T모터스),....]

data = []
with open('stockcode.txt','r',encoding = 'UTF-8') as f:
    lines = f.readlines()
    print(lines)
    for x in lines:
        items = x.split()
        temp = []
        temp.append(items[0])
        temp.append(items[1])
        data.append(tuple(temp))
    pass
print(data)
