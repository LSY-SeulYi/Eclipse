'''
Created on 2021. 7. 19.
사용자로 부터 입력받은 내용을 파일에 추가하기
@author: pc354
'''

with open('mypoem.txt','a',encoding = 'utf-8') as f:
    while True:
        line = input('시를 쓰세요.')
        if(line == '그만'):
            break
        f.write(line+'\n')
        pass # while 문의 끝 의미
    pass # with 문의 끝 의미

with open('mypoem.txt','r',encoding = 'utf-8') as f:
    poem = f.read()
    print(poem)
    
