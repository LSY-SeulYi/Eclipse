'''
Created on 2021. 7. 13.
클래스 연습
@author: pc354
'''
from Cython.Shadow import address
from _pytest.outcomes import skip
from astropy.io.misc.yaml import name

class MyMember:
    name = None
    age= None
    phone = None
    address = None
    def __init__(self,name,age,phone,address):
        self.name = name
        self.age = age
        self.phone = phone
        self.address = address
        
    def __toString__(self):
        return self.name + '/'+str(self.age)+'/'+self.phone+'/'+self.address
    
m1 = MyMember('홍길동',23,'010-2222-3333','경기도 연천')
print(m1.__toString__())

class Bundle:
    name = None
    age = None
    def init(self,**args):
        if len(args)>0:
            print(args)
            
class Bundle2:
    def init(self,*args):
        if len(args)>0:
            print(args)