'''
Created on 2021. 7. 19.
텍스트 파일을 한줄씩 읽고 출력하기 (readlines)
@author: pc354
'''

f = open('stockcode.txt','r',encoding = 'utf-8')
lines = f.readlines()
for line_num, line in enumerate(lines):
    print('%d %s'%(line_num+1,line),end='')
f.close()

###########################################################

with open('stockcode.txt','r',encoding = 'utf-8') as f:
    lines = f.readlines()
    for line_num, line in enumerate(lines):
        print('%d %s'%(line_num+1,line),end='')
        
###########################################################