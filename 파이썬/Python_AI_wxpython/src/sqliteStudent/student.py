'''
Created on 2021. 7. 22.
@author: pc374
'''
import sqlite3

def createTable():
    conn = sqlite3.connect('test.db')
    cs = conn.cursor()
    cs.execute('''
        CREATE TABLE IF NOT EXISTS STUDENT
        (ID TEXT PRIMARY KEY,
        NAME TEXT,
        BIRTHDAY TEXT,
        PHONE TEXT)
    ''')
    conn.commit()
    cs.close()
    conn.close()
    pass

def insertData(id,name,birthday,phone):
    conn=sqlite3.connect('test.db')
    cs=conn.cursor()
    cs.execute('''
        INSERT INTO STUDENT(ID,NAME,BIRTHDAY,PHONE)
        VALUES(?,?,?,?)
    ''',(id,name,birthday,phone))
    conn.commit()
    cs.close()
    conn.close()
    pass

def insertManyData(tupleData):
    conn = sqlite3.connect('test.db')
    cs = conn.cursor()
    cs.executemany('''
        INSERT INTO STUDENT(ID,NAME,BIRTHDAY,PHONE)
        VALUES(?,?,?,?)
    ''',tupleData)
    conn.commit()
    cs.close()
    conn.close()
    pass

def selectAll():
    conn = sqlite3.connect('test.db')
    cs = conn.cursor()
    cs.execute('SELECT * FROM STUDENT')
    rows=cs.fetchall()
    conn.commit()
    cs.close()
    conn.close()
    return rows

def select(key):
    conn = sqlite3.connect('test.db')
    cs = conn.cursor()
    cs.execute('SELECT * FROM STUDENT WHERE ID=?',(key,))
    row = cs.fetchone()
    conn.commit()
    cs.close()
    conn.close()
    return row
    pass

def update(vo):
    conn = sqlite3.connect('test.db')
    cs = conn.cursor()
    cs.execute('''
        UPDATE STUDENT SET NAME=?,BIRTHDAY=?,PHONE=? WHERE ID=?
    ''',vo)
    conn.commit()
    cs.close()
    conn.close()
    pass

def delete(key):
    conn = sqlite3.connect('test.db')
    cs = conn.cursor()
    res = cs.execute('DELETE FROM STUDENT WHERE ID=?',(key,))
    conn.commit()
    cs.close()
    conn.close()
    return res
