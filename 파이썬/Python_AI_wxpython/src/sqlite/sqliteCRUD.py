'''
Created on 2021. 7. 22.
SQLite의 CRUD(C:Create,Insert / R:Select / U:Update / D:Delete)
@author: pc374
'''
 #결과가 여러줄일때는 fetchall() / 한줄일때는 fetchone()
import sqlite3
#C기능 => Create,Insert######################################
def createTable():
    conn = sqlite3.connect('test.db')
    cs = conn.cursor()
    cs.execute('''
        CREATE TABLE IF NOT EXISTS MYMEMBER
        (ID TEXT PRIMARY KEY,
        NAME TEXT,
        PASSWORD TEXT,
        REMARK TEXT)
    ''')
    conn.commit()
    cs.close()
    conn.close()
    pass

def insertData(id,name,password,remark):
    conn=sqlite3.connect('test.db')
    cs=conn.cursor()
    cs.execute('''
        INSERT INTO MYMEMBER(ID,NAME,PASSWORD,REMARK)
        VALUES(?,?,?,?)
    ''',(id,name,password,remark))
    conn.commit()
    cs.close()
    conn.close()
    pass

def insertManyData(tupleData):
    conn = sqlite3.connect('test.db')
    cs = conn.cursor()
    cs.executemany('''
        INSERT INTO MYMEMBER(ID,NAME,PASSWORD,REMARK)
        VALUES(?,?,?,?)
    ''',tupleData)
    conn.commit()
    cs.close()
    conn.close()
    pass

#R기능 : READ => SELECT ######################################
def selectAll():
    conn = sqlite3.connect('test.db')
    cs = conn.cursor()
    cs.execute('SELECT * FROM MYMEMBER')
    rows=cs.fetchall()
    conn.commit()
    cs.close()
    conn.close()
    return rows

    #연습
    # #첫번째 방식 : 세번째방식과 동일한데 한줄씩 출력
    # print('방식1로 출력')
    # readData = cs.fetchall()
    # for row in readData:
    #     print(row)
    # print()
    # #두번째 방식
    # print('방식2로 출력')
    # for row in cs.execute('SELECT * FROM MYMEMBER'):
    #     print(row)
    # #세번째 방식 : 한줄에 다 출력
    # print('방식3로 출력')
    # cs.execute('SELECT * FROM MYMEMBER')
    # print(cs.fetchall())

def select(key):
    conn = sqlite3.connect('test.db')
    cs = conn.cursor()
    cs.execute('SELECT * FROM MYMEMBER WHERE ID=?',(key,)) #유의!
    row = cs.fetchone()
    conn.commit()
    cs.close()
    conn.close()
    return row
    pass

#U기능 => Update######################################
def update(vo):
    conn = sqlite3.connect('test.db')
    cs = conn.cursor()
    cs.execute('''
        UPDATE MYMEMBER SET NAME=?,PASSWORD=?,REMARK=? WHERE ID=?
    ''',vo)
    conn.commit()
    cs.close()
    conn.close()
    pass

#D기능 => Delete######################################
def delete(key):
    conn = sqlite3.connect('test.db')
    cs = conn.cursor()
    res = cs.execute('DELETE FROM MYMEMBER WHERE ID=?',(key,))
    conn.commit()
    cs.close()
    conn.close()
    return res
    
    