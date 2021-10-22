'''
Created on 2021. 7. 23.
우리가 만든 Oracle2CSV2 를 테스트 해보자.
@author: pc354
'''
from dbNcsv import Oracle2CSV2

if __name__ == '__main__':
    Oracle2CSV2.db2csv('hr/hr@localhost:1521/xe','JOBS','jobs.csv')