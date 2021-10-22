'''
Created on 2021. 7. 13.
함수의 리턴값
@author: pc354
'''

def reverse(x,y,z):
    return z,y,x

print(reverse('산','토','끼')) # tuple 로 보낸건 여러개 return 가능

res = reverse('산','토','끼')
print(type(res))

for x in res:
    print(x)
    
def message(msg):
    제목 = '호주 여행'
    게시자 = '박한상'
    게시일 = '2021-5-7'
    return 제목,게시자,게시일,msg

res1 = message('아주 아름다운 초원이 있어요.')
for x in res1:
    print(x)
print(type(res1))