'''
Created on 2021. 7. 23.

@author: pc354
'''
import sqlite3

conn = sqlite3.connect('test.db',isolation_level = None)
with conn:
    with open('testdb_backup.sql','w',encoding = 'utf-8') as f:
        for row in conn.iterdump():
            f.write('%s\n'%row)
        print('Completed')