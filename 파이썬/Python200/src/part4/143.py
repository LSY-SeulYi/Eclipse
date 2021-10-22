'''
Created on 2021. 7. 19.
바이너리 화일의 복사
@author: pc354
'''
from matplotlib import pyplot
from matplotlib.image import imread


with open('5.jpg','rb') as origin:
    with open('5_copy.jpg','wb') as copy:
        data = origin.read(1024)
        while data:
            copy.write(data)
            data = origin.read(1024)
            pass
        pass
    pass

img = imread('5_copy.jpg','rb')
pyplot.imshow(img)
pyplot.show()