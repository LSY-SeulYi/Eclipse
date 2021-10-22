import sqlite3

import cx_Oracle
import wx

from wxhomebook.models import HomeBook 

class HomeBookDAO():
    
    def createTable(self):
        conn = sqlite3.connect("wxhomebook.db")
        c = conn.cursor() 
        c.execute(''' 
            CREATE TABLE IF NOT EXISTS HOMEBOOK
            (SERIALNO integer PRIMARY KEY autoincrement,
             DAY  TEXT,
             SECTION TEXT,
             ACCOUNT_TITLE TEXT,
             REMARK TEXT,
             REVENUE INTEGER,
             EXPENSE INTEGER,
             USER_ID TEXT 
             )
        ''')
        conn.commit()
        c.close()
        conn.close()
        pass
    
    
    # 객체 생성자 
    def __init__(self):
        self.conn = sqlite3.connect("homewxhomebook")
        #self.conn = cx_Oracle.connect("web/java@localhost:1521/xe")
        pass
    # 객체소멸자 
    def __del__(self):
        # 객체가 사라질 때에 컨넥션 자원을 반납 
        self.conn.close() 
    
    def insert(self,vo):
        cur = self.conn.cursor(); 
        try:
            sql ='''INSERT INTO HOMEBOOK (DAY,SECTION,ACCOUNT_TITLE,REMARK,REVENUE,EXPENSE,USER_ID)
             VALUES (:1,:2,:3,:4,:5,:6,:7)
            '''
            cur.execute(sql,vo)
            # 커밋을 생략하지 말것 
            self.conn.commit()
            
        except Exception as e:
            print(e)
            self.conn.rollback();
            return False
        else: 
            return True 
        finally: 
            cur.close()
            #self.conn.close();
            
    def delete(self,key):
        cur = self.conn.cursor(); 
        try:
            sql ="DELETE FROM HOMEBOOK WHERE SERIALNO = %d"%key
            print(sql)
            cur.execute(sql)
            self.conn.commit();
        except Exception as e:
            self.conn.rollback();
            return False
        else: 
            return True 
        finally: 
            cur.close()
        
        
        pass
    
    def update(self,vo):
        cur = self.conn.cursor();
               
        sql ='''UPDATE HOMEBOOK SET DAY=:1,SECTION=:2,ACCOUNT_TITLE=:3,
            REMARK=:4,REVENUE=:5,EXPENSE=:6,USER_ID=:7 
            WHERE SERIALNO=:8'''
        try:
            cur.execute(sql,vo)
            # 커밋을 생략하지 말것 
            self.conn.commit()
           
        except Exception as e:
            print(e)
            self.conn.rollback();
            return False
        else: 
            return True 
        finally: 
            cur.close() 
    
    # SELECT 질의 수행 메소드 
    def select(self, sql='SELECT * FROM HOMEBOOK ',condition = ''):
        print(sql+condition);
        sql += condition
        cur = self.conn.cursor();
        try:
            cur.execute(sql)
            rows = cur.fetchall()
            
            columnNames = [d[0] for d in cur.description]
            return rows #,columnNames
    
        except Exception as e:
            print(e)
            return None
        finally: 
            cur.close() 
    
    def selectOne(self,key):
        cur = self.conn.cursor();
        sql ="SELECT * FROM HOMEBOOK WHERE SERIALNO = %d"%key
        try:
            cur.execute(sql)
            row = cur.fetchone();
            vo = HomeBook(row[0],row[1],row[2],row[3],row[4],row[5],row[6],row[7]); 
 
        except Exception as e:
            print("올래?",e)
            wx.MessageBox(str(e)+"\n"+"색인할 자료 없는경우 등", "얼러러~~", wx.OK | wx.ICON_INFORMATION)
            return None
        else: 
            return vo 
        finally: 
            cur.close() 
  
  


# 아래 부분은 dao 테스트를 위한 부분으로 배포시 제거하여도 됨
if __name__ == '__main__':
    obj = HomeBookDAO()
    obj.createTable()
    #xday,section,account_title,remark,revenue,expense,user_id
    vo = ('2021-7-27','수입','급료','7월 급여 수령',7800000,0,'sjw')
    obj.insert(vo)
    
    