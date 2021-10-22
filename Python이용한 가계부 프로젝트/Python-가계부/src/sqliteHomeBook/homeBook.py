'''
Created on 2021. 7. 22.
@author: pc374
'''
import sqlite3

def createTable():
    conn = sqlite3.connect('test.db')
    cs = conn.cursor()
    cs.execute('''
        CREATE TABLE IF NOT EXISTS HOMEBOOK
        (ID INTEGER PRIMARY KEY AUTOINCREMENT,
        DATE TEXT,
        SECTION TEXT,
        ACCOUNTTITLE TEXT,
        REVENUE INTEGER,
        EXPENSE INTEGER,
        REMARK TEXT)
    ''')
    conn.commit()
    cs.close()
    conn.close()
    pass

def insertData(date,section,accounttitle,revenue,expense,remark):
    conn=sqlite3.connect('test.db')
    cs=conn.cursor()
    cs.execute('''
        INSERT INTO HOMEBOOK(DATE,SECTION,ACCOUNTTITLE,REVENUE,EXPENSE,REMARK)
        VALUES(?,?,?,?,?,?)
    ''',(date,section,accounttitle,revenue,expense,remark))
    conn.commit()
    cs.close()
    conn.close()
    pass

def insertManyData(tupleData):
    conn = sqlite3.connect('test.db')
    cs = conn.cursor()
    cs.executemany('''
        INSERT INTO HOMEBOOK(ID,DATE,SECTION,ACCOUNTTITLE,REVENUE,EXPENSE,REMARK)
        VALUES(?,?,?,?,?,?,?)
    ''',tupleData)
    conn.commit()
    cs.close()
    conn.close()
    pass

def selectAll():
    conn = sqlite3.connect('test.db')
    cs = conn.cursor()
    cs.execute('SELECT * FROM HOMEBOOK')
    rows=cs.fetchall()
    conn.commit()
    cs.close()
    conn.close()
    return rows

def Select(key1,key2):
    conn = sqlite3.connect('test.db')
    cs = conn.cursor()
    cs.execute('''SELECT * FROM HOMEBOOK WHERE DATE BETWEEN ? AND ?
    ''',(key1,key2,))
    rows=cs.fetchall()
    conn.commit()
    cs.close()
    conn.close()
    return rows
    pass

def update(vo):
    conn = sqlite3.connect('test.db')
    cs = conn.cursor()
    cs.execute('''
        UPDATE HOMEBOOK SET DATE=?,SECTION=?,ACCOUNTTITLE=?,REVENUE=?,EXPENSE=?,REMARK=? WHERE ID=?
    ''',vo)
    conn.commit()
    cs.close()
    conn.close()
    pass

def delete(key):
    conn = sqlite3.connect('test.db')
    cs = conn.cursor()
    res = cs.execute('DELETE FROM HOMEBOOK WHERE ID=?',(key,))
    conn.commit()
    cs.close()
    conn.close()
    return res
