'''
Created on 2021. 7. 13.
파일 열고 닫기
@author: pc354
'''
from matplotlib import pyplot
from matplotlib.image import imread

f1 = open('이조년.txt','r',encoding='UTF-8')
x = f1.read()
f1.close()
print(x)

################## 105페이지 열기 모드 - r(t), w(t), a(t) / rb, wb, ab

f2 = open('5.jpg','rb')
img = imread('5.jpg','rb')
pyplot.imshow(img)
pyplot.show()

f3 = open('2.jfif','rb')
img = imread('2.jfif','rb')
pyplot.imshow(img)
pyplot.show()