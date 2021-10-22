'''
Created on 2021. 7. 19.
화면에서 사용자 입력을 받고 파일로 쓰기 (write)
@author: pc354
'''

text = input('파일에 저장할 내용을 입력하세요.')
with open('mydata.txt','w',encoding = 'utf-8') as f:
    f.write(text)
    pass
