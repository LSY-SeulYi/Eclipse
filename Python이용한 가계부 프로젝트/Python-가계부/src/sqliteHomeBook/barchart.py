import random 
import sqlite3
import pandas as pd

import matplotlib as plt
import pandas as pd


import wx 

from sqliteHomeBook import homeBook

        
class PieChartPanel(wx.Panel): 
    data ={}
    def __init__( self, parent ): 
        wx.Panel.__init__(self,parent)
        # wx.Panel.__init__ ( self, parent, id = wx.ID_ANY, pos = ( 20, 500 ), size = wx.Size( 550,250 ), style = wx.TAB_TRAVERSAL ) 
    
    def SetData(self,data):
        self.data = data
        rows = homeBook.selectAll()
        totalRe = 0
        totalEx = 0
        for row in rows:
            if row[2] == '수입':
                totalRe += int(row[4])
            elif row[2] == '지출':
                totalEx += int(row[5])
        data = [totalRe, totalEx]
        self.Bind(wx.EVT_PAINT,self.OnPaint) 
        # 중요 - 새로이 그린 내용으로 갱신  
        self.Refresh() #중요  
            
    def SetData2(self,data):
        self.data = data
        rows = homeBook.selectAll()
        급여=0
        기타수입=0
        주식비 = 0
        간식비 = 0
        외식비 = 0
        보험료 = 0
        기타지출 = 0
        for row in rows:
            if row[3] == '급여':
                급여 += row[4]
            elif row[3] == '기타수입':
                기타수입 += row[4]
            elif row[3] == '주식비':
                주식비 += row[5]
            elif row[3] == '간식비':
                간식비 += row[5]
            elif row[3] == '외식비':
                외식비 += row[5]
            elif row[3] == '보험료':
                보험료 += row[5]
            elif row[3] == '기타지출':
                기타지출 += row[5]
        data = [급여, 기타수입, 주식비, 간식비, 외식비, 보험료, 기타지출]
        self.Bind(wx.EVT_PAINT,self.OnPaint) 
        # 중요 - 새로이 그린 내용으로 갱신  
        self.Refresh() #중요 

    def OnPaint(self,event): 
        self.dc = wx.PaintDC(self) 
        self.brush = wx.Brush("#ffffff") #칠하는 용도  
        self.dc.SetBackground(self.brush) 
        self.dc.Clear() 
        font = wx.Font(13, wx.FONTFAMILY_DEFAULT, wx.FONTSTYLE_NORMAL, wx.FONTWEIGHT_BOLD, False) 
        self.dc.SetFont(font) 
        total =0 
        color = {} 
         
        # 데이타 총량 산정 
        for key in self.data: 
            total += self.data[key] 
         
        # 전체총량에 차지하는 각 데이타를 360도 각도로 환산하고, 파이챠트에 구분표시할 색상을 임의로 생성  
        for key in self.data: 
            r = random.randint(0,255) 
            g = random.randint(0,255) 
            b = random.randint(0,255) 
            color[key] = (r,g,b) 
            self.data[key] = int(self.data[key]/total*360) 
         
        # 아래 글씨를 쓰기 위한 색상 지정   
        self.brush.SetColour(wx.Colour(0,0,0,1)) 
        # 브러쉬 지정  
        self.dc.SetBrush(self.brush) 
        self.dc.DrawText("",500,5) 
         
        #DrawEllipticArc(X, Y, WX, WY, ST, LT) 
        # 원의 기준은 좌측 상단점(X,Y) 
        # 가로폭, 세로폭(WX,WY) 
        # 호의 시작 각도,끝나는 각도 (ST,LT) 
        sum = 0 
        step= 30 
        for key in self.data:
            if self.data[key] != 0:
                r = color.get(key)[0] 
                g = color.get(key)[1] 
                b = color.get(key)[2] 
                self.brush.SetColour(wx.Colour(r,g,b,1)) 
                self.dc.SetBrush(self.brush) 
                self.dc.DrawEllipticArc(100, 10, 250, 250, sum,sum+self.data[key]) 
                self.dc.DrawRectangle(490, step, 50, 50) 
                self.dc.DrawText(key,550,step) 
                sum += self.data[key] 
                step += 40 
            else:
                pass