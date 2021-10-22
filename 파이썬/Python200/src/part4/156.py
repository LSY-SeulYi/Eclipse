'''
Created on 2021. 7. 19.
파일인지 디렉터리인지 확인하기 (os.path.isfile, os.path.isdir)
@author: pc354
'''
import os
from os.path import exists, isdir, isfile


files = os.listdir('C:\windows')
os.chdir('C:\windows') # 체인지 디렉토리 해야 isdir이 먹힘
for x in files:
    if isdir(x):
        print('DIR: %s'%x)
    else:
        print('FILE: %s'%x)
       
# for file in files:
#     if isfile(file):
#         print('FILE: %s'%file)