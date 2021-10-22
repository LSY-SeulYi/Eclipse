'''
Created on 2021. 7. 15.
문자열을 바이트 객체로 바꾸기 (encode)
@author: pc354
'''

u_txt = 'I Love Python'
b_txt = u_txt.encode()
print(u_txt,end='==>')
print(b_txt) # 바이너리 표시 b가 붙어서 출력 됨

for x in b_txt:
    print(x,end=' ')
    
print()

u_txt1 = '안녕하세요~~!!!'
b_txt1 = u_txt1.encode()
print(u_txt1,end='==>')
print(b_txt1) # 바이너리 표시 b가 붙어서 출력 됨


## 바이트 객체를 문자열로 바꾸기 (decode)

a_txt = b'I Love Python'
d_txt = a_txt.decode()
print(d_txt)
for x in a_txt:
    print(x,end=' ')