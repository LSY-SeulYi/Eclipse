'''
Created on 2021. 7. 19.
텍스트 파일을 한줄씩 읽고 출력하기 (readline)
@author: pc354
'''
f = open('stockcode.txt','r',encoding = 'utf-8')
line_num = 1
line = f.readline()
while line:
    print('%d %s'%(line_num,line),end='')
    line = f.readline()
    line_num += 1
f.close()

###########################################################

with open('stockcode.txt','r',encoding = 'utf-8') as f:
    line_num = 1
    line = f.readline()
    while line:
        print('%d %s'%(line_num,line),end='')
        line = f.readline()
        line_num += 1
    pass
