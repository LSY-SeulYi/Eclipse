'''
Created on 2021. 7. 20.
파일에서 특정 문자열 교체하기
@author: pc354
'''

def changeWord(fileName,old,new):
    with open(fileName,'r',encoding = 'utf-8') as f:
        with open('new'+fileName,'w',encoding = 'utf-8') as h:
            data = f.read()
            cnt = data.split().count(old)
            data = data.replace(old,new)
            h.write(data)
            print('[%s]를 [%d]번 [%s]로 변경하였습니다.'%(old,cnt,new))

changeWord('mydata.txt','얄리','사랑')
with open('mydata.txt','r',encoding = 'utf-8') as f:
    print(f.read())