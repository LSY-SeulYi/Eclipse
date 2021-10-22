'''
Created on 2021. 7. 19.
파일 크기 구하기 (os.path.getsize)
@author: pc354
'''
from os.path import getsize


file1 = 'stockcode.txt'
file2 = 'E:/javaworkspace/Python200/src/part4/5.jpg'
file_size1 = getsize(file1)
file_size2 = getsize(file2)

print('File Name: %s \tFile Size: %d'%(file1,file_size1))
print('File Name: %s \tFile Size: %d'%(file2,file_size2))