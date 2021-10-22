'''
Created on 2021. 7. 19.
디렉터리에 있는 파일목록 얻기 (os.listdir, glob.glob)
@author: pc354
'''
import glob
import os
from os.path import isdir


folder = 'C:/windows'
file_list = os.listdir(folder)
for x in file_list:
    print(x,end='')
    print()
    

print('--------------------------------------------')

files = '*.txt'
file_list = glob.glob(files)
for x in file_list:
    print(x)
    
print('--------------------------------------------')

file1 = 'C:/windows/*.exe'
file_list = glob.glob(file1)
for x in file_list:
    print(x)