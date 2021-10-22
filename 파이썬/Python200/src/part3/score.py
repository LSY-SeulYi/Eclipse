'''
Created on 2021. 7. 15.

@author: pc354
'''
class ScoreVO():
    name = None
    kor = None
    eng = None
    math = None
    total = None
    avg = None

    def __init__(self, name, kor, eng, math):
        self.name = name
        self.kor = kor
        self.eng = eng
        self.math = math
        self.total = kor+eng+math
        self.avg = int((self.total/3)*100)/100
        
    def getTotal(self):
        return self.total
    def getAvg(self):
        return self.avg

def sortByTotal():
    pass