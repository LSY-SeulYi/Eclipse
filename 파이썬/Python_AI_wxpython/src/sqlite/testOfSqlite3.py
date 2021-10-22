'''
Created on 2021. 7. 22.
sqlite3의 사용 기초
@author: pc374
'''
import sqlite3
print(sqlite3.version)
#1단계 - connection 획득단계
#isolation_level=None을 지정하는 이유 : 데이터베이스에 자동커밋
conn = sqlite3.connect('test.db',isolation_level=None)
#2단계 - cursor 획득단계
cursor = conn.cursor()
#3단계 - 테이블 만들기 : 이미 만들어진 테이블을 사용할 때는 생략가능
#타입 - TEXT, NUMERIC, INTEGER, REAL(실수), BLOB(대용량 바이너리정보) 등등
cursor.execute('''
    CREATE TABLE IF NOT EXISTS T1
    (ID TEXT PRIMARY KEY,
    NAME TEXT,
    PASSWORD TEXT,
    REMARK TEXT) 
    ''')
# conn.commit() -> 생략하기 위해서 'isolation_level=None'을 넣어줌
cursor.close()
conn.close()

