############## HomeBook.py 
# VO 클래스 
class HomeBook():
    #클래스의 함수를 메소드
    #생성메소드  
    def __init__(self,serialno,day,section,account_title,remark,revenue,expense,user_id):
        self.serialno = serialno
        self.day=day
        self.section=section
        self.account_title=account_title
        self.remark=remark
        self.revenue=revenue
        self.expense=expense
        self.user_id=user_id 

    def getSerialno(self):
        return self.serialno; 
    def getDay(self):
        return self.day; 
    def getSection(self):
        return self.section; 
    def getAccount_title(self):
        return self.account_title;
    def getRemark(self):
        return self.remark;
    def getRevenue(self):
        return self.revenue;
    def getExpense(self):
        return self.expense
    def getUser_id(self):
        return self.user_id; 
    def setUser_id(self,id):
        self.user_id = id; 
    def toString(self):
        return "%d,%s,%s,%s,%s,%d,%d,%s"%(\
                self.serialno,self.day,self.section,\
                self.account_title,self.remark,self.revenue,\
                self.expense,self.user_id)
