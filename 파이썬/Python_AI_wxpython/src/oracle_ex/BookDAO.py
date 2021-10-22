'''
Created on 2021. 7. 23.

@author: pc354
'''
import time

import cx_Oracle


class BookDAO(): #BOOKID, BOOKNAME, PUBLISHER, PRICE

    def __init__(self):
        pass

    def insert(self,vo,conn):
        cur = conn.cursor()
        sql = '''
            INSERT INTO BOOK VALUES(:1,:2,:3,:4)
        '''
        cur.execute(sql,vo)
        conn.commit()
        cur.close()
        conn.close()
        print('1건의 자료 입력 완료')
        
    def select(self,key,conn):
        cur = conn.cursor()
        sql = '''
            SELECT * FROM BOOK WHERE BOOKID = :1 
        '''
        cur.execute(sql,key)
        data = cur.fetchone()
        conn.commit()
        cur.close()
        conn.close()
        print('1건의 자료 색인 완료')
        return data
    
    def selectAll(self,conn):
        cur = conn.cursor()
        sql = '''
            SELECT * FROM BOOK
            '''
        cur.execute(sql)
        data = cur.fetchall()
        conn.commit()
        cur.close()
        conn.close()
        return data
    
    def delete(self,key,conn):
        cur = conn.cursor()
        sql = '''
            DELETE FROM BOOK WHERE BOOKID = :1 
            '''
        cur.execute(sql,key)
        conn.commit()
        cur.close()
        conn.close()
        return data
    
    # def update(self,vo,conn):
    #     cur = conn.cursor()
    #     sql = '''
    #         UPDATE BOOK SET BOOKNAME = :2, PUBLISHER = :3, PRICE = :4 WHERE BOOKID = :1
    #     '''
    #     cur.execute(sql,vo)
    #     conn.commit()
    #     cur.close()
    #     conn.close()
    #     print('자료 수정 완료')
        
    def update(self,vo,conn):
        cur = conn.cursor() 
        sql = '''
             UPDATE BOOK SET BOOKNAME = '%s', PUBLISHER = '%s' , PRICE =%d 
             WHERE BOOKID = %d
        '''%(vo[1],vo[2],vo[3],vo[0])
        print(vo)
        cur.execute(sql)
        conn.commit()
        
        cur.close() 
        conn.close()
        print("자료 수정 완료")   
    
if __name__ == '__main__':
    obj = BookDAO()
    # conn = cx_Oracle.connect('madang/madang@localhost:1521/xe')
    # obj.insert((16,'돌아와요부산항','용필출판',80000),conn)
    
    # conn = cx_Oracle.connect('madang/madang@localhost:1521/xe')
    # data = obj.select((16,),conn)
    # print(data) 
    
    # conn = cx_Oracle.connect('madang/madang@localhost:1521/xe')
    # data = obj.delete((16,), conn)
    # print('데이터 삭제 완료~!')
          
    # vo = (1,'축구의 역사','굿스포츠',7000)
    # conn = cx_Oracle.connect('madang/madang@localhost:1521/xe')
    # obj.update(vo, conn)
    # time.sleep(0.5)

    
    
    conn = cx_Oracle.connect('madang/madang@localhost:1521/xe')
    data = obj.selectAll(conn)
    for row in data:
        print(row)