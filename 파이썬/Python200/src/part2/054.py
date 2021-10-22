'''
Created on 2021. 7. 14.
클래스 상속 이해하기
@author: pc354
'''

class Add:
    def add(self,n1,n2):
        return n1+n2
    
class Subtract:
    def subtract(self,n1,n2):
        return n1-n2
    
class Calc(Add,Subtract):
    def multiply(self,n1,n2):
        return n1*n2
    def divide(self,n1,n2):
        return n1/n2
    def moduleless(self,n1,n2): # 몫과 나머지 리턴시켜 주려면?
        share = int(n1/n2)
        remain = n1-n2*share
        return share,remain

################################################

calc = Calc()
print('일년은',calc.divide(365, 7),'주 입니다.')
print('당신의 연봉은',calc.multiply(1900000, 12),'원 입니다.')
주,일 = calc.moduleless(365, 7)
print('일년은',주,'주',일,'일 입니다.')