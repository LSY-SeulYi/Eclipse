'''
Created on 2021. 7. 23.
오라클 테이블 정보를 읽어 CSV 파일로 만들기
@author: pc354
'''

import csv
import os
import sys
import cx_Oracle

db = cx_Oracle.connect('hr/hr@localhost:1521/xe')
sql = 'SELECT * FROM JOBS'
c = db.cursor()
with open('jobs.csv','w',encoding = 'utf-8') as f:
    writer = csv.writer(f,lineterminator='\n',quoting=csv.QUOTE_NONNUMERIC)
    r = c.execute(sql)
###################################################################################
    col_names = [row[0] for row in c.description]
    writer.writerow(col_names) # CSV 파일의 첫줄 (컬럼 이름 라인)
    for row in c:
        writer.writerow(row)