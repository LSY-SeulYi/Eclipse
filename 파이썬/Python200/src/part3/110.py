'''
Created on 2021. 7. 16.
리스트의 특정 위치에 삽입하기
@author: pc354
'''

solarsys = ['태양','수성','금성','지구','화성']
solarsys.insert(3, '달')
print(solarsys)

solarsys[2] = 'VENUS'
print(solarsys)

solarsys.remove('달')
print(solarsys)

del solarsys[2]
print(solarsys)

del solarsys[1:3]
print(solarsys)