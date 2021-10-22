'''
Created on 2021. 7. 26.
sin (사인) 파장곡선 합성
@author: pc354
'''

import math

import wx


class MyClass(wx.Frame):
    def __init__(self,parent,title):
        super(MyClass,self).__init__(parent,title=title,size=(800,500))
        self.initUI()
        
    def initUI(self):
        self.Bind(wx.EVT_PAINT,self.OnPaint)
        self.Centre()
        self.SetSize(wx.Size(800,500))
        self.Centre(wx.BOTH)
        self.Show(True)
        
    def OnPaint(self,e):
        dc = wx.PaintDC(self) # Draw Context
        brush = wx.Brush('white')
        dc.SetBackground(brush)
        dc.Clear() # 흰색을 깨끗이 지운다.
        pen = wx.Pen(wx.Colour(0,0,255))
        dc.SetPen(pen)
        
        # 사인 곡선 그리기
        dc.SetBrush(wx.Brush(wx.Colour('#D9E5FF'),wx.CROSS_HATCH))
        dc.DrawRectangle(10, 10, 720, 400)
        
        # 기준 축 그리기
        # dc.DrawLine(10, 10, 10, 411)
        dc.DrawLine(10, 210, 730, 211)
        for x in range(10,411,20):
            dc.DrawLine(0,x,15,x) # y축 눈금표시
        for x in range(10,731,90):
            dc.DrawLine(x,200,x,220) # x축 눈금표시
            dc.DrawText(u''+str(x-10), x, 210) # 각도 표시
            
        nums = list(range(0,721))
        data = []
        for x in nums[::1]:
            y1 = self.getSinValue(x)
            y2 = self.getSinValue2(x,0.7,5)
            y = y1+y2
            y = y+210
            data.append((x+10,y))
            dc.DrawPoint((x+10,y)) # 얇은 점선으로 그릴때
            # dc.DrawCircle(x+10, y, 2) # 굵직한 점선으로 그릴때
            
        # dc.DrawPolygon(data, xoffset=0, yoffset=0) # 선으로 그릴때
        
    def getSinValue(self,val):
        y = math.sin(val*math.pi/180) # radian값으로 바꿔줘야 함. -1~1사이의 값으로 나옴. 사인값은 시각화 하기가 어려움 그래서 200배 정도 뻥튀기 해줘야 함.
        y = y*200 # 뻥튀기
        y = -y # 좌표계 수정 = 실제 컴퓨터에서는 y값이 아래로 내려가기 때문에 반대로 -값으로 줘야함.
        # y = y+210
        return y
    
    def getSinValue2(self,val,amplitude,frequency): # val=sin값,각도, amplitude=진폭(세기), frequency=주파수(얼마나 자주 일어나는가)
        y = amplitude*math.sin((val*math.pi/180)*frequency)
        y = y*200 # 뻥튀기
        y = -y # 좌표계 수정 = 실제 컴퓨터에서는 y값이 아래로 내려가기 때문에 반대로 -값으로 줘야함.
        # y = y+210
        return y
        
if __name__ == '__main__':
    ap = wx.App()
    MyClass(None, 'Drawing Demo')
    ap.MainLoop()