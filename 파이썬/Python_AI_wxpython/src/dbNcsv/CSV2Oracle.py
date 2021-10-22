'''
Created on 2021. 7. 23.
csv파일을 읽어 오라클 데이터베이스에 테이블을 만들고 데이터를 넣어주는 인공지능 클래스 만들기
csv파일은 반드시 첫줄에 컬럼 이름이 나열되어 있어야 함
@author: pc354
'''
import cx_Oracle

class CSV2Oracle(object):
    # csvPath ==> 'c:/csvs/xxxx.csv'
    csvPath = None
    tableName = None
    def __init__(self, csvPath, tableName):
        self.csvPath = csvPath
        self.tableName = tableName
        pass
    
    def getColumn(self):
        with open(self.csvPath,'r',encoding='utf-8') as f:
            columns = f.readline().split(',')
            n = len(columns)
            if '\ufeff' in columns[0]:
                columns[0] = columns[0][1:]
            columns[n-1].replace('\n','')
            colStr = ''
            num = 1
            for colName in columns:
                colStr += '\t:'+str(num)+',\n'
                num += 1
            colStr = colStr[:-2]+'\n)'
        return colStr
            
    def createTable(self):
        with open(self.csvPath,'r',encoding='utf-8') as f:
            columns = (f.readline()).split(',') # id, name, password, remark
            n = len(columns)
            if '\ufeff' in columns[0]:
                columns[0] = columns[0][1:] # 특수문자+id ==> id 만 갖고 오겠다.
            columns[n-1].replace('\n','') # 라인 끝부분 개행 문자 제거
    
            createSql = 'CREATE TABLE '+self.tableName + '(\n'
    
            colStr = ''
            for colName in columns:
                colStr += '\t '+colName + ' VARCHAR2(500),\n'
            colStr = colStr[:-2] + '\n)'
    
            createSql = createSql + colStr # 테이블만드는 질의 문장 완성
            with cx_Oracle.connect('madang/madang@localhost:1521/xe') as conn:
                c = conn.cursor()
                c.execute(createSql)
                conn.commit()
                
#############################################################################################
            ## 테이블 완성 후 데이터 덤프
            
                line = f.readline()
                insertSql = 'INSERT INTO '+ self.tableName + ' VALUES (\n' + self.getColumn()
                while  line:
                    data = line.split(',')
                    n = len(data)
                    data[n-1] = data[n-1].replace('\n','')
                    c.execute(insertSql,data)
                    line = f.readline()
                conn.commit()
            print('Created Table and Dumped Data to Oracle')


if __name__ == '__main__':
    obj = CSV2Oracle('jobs.csv','AUTOGENTEST')
    obj.createTable()
