'''
Created on 2021. 7. 26.
wx Graphics 기초 연습
@author: pc354
'''

import wx

class MyClass(wx.Frame):
    def __init__(self,parent,title):
        super(MyClass,self).__init__(parent,title=title,size=(500,300))
        self.initUI()
        
    def initUI(self):
        self.Bind(wx.EVT_PAINT,self.OnPaint)
        self.Centre()
        self.SetSize(wx.Size(800,550))
        self.Centre(wx.BOTH)
        self.Show(True)
        
    def OnPaint(self,e):
        dc = wx.PaintDC(self) # Draw Context
        brush = wx.Brush('yellow')
        dc.SetBackground(brush)
        dc.Clear() # 노란색을 깨끗이 지운다.
        pen = wx.Pen(wx.Colour(0,0,255))
        dc.SetPen(pen)
        # 가로로 바둑판 줄 긋기
        nums = list(range(10,390)) # 20씩 띄우면 총 19줄이 된다
        for y in nums[::20]:
            dc.DrawLine(390, y, 750, y)
        # 세로로 바둑판 줄 긋기    
        nums = list(range(390,770))
        for x in nums[::20]:
            dc.DrawLine(x, 10, x, 370)
        
        # 테두리는 펜으로 그려짐(청색)
        # 면은 붓으로 그려짐(녹색, 격자무늬)
        dc.SetBrush(wx.Brush(wx.Colour(0,255,0),wx.CROSS_HATCH)) # CROSS_HATCH => 사각 무늬 주는 것 (꼭 모눈종이같음)
        dc.DrawRectangle(10, 10, 370, 370) # 10 = 좌측 상단점, 370 = 우측 하단점
        # 글씨를 그리기
        font = wx.Font(18,wx.ROMAN,wx.ITALIC,wx.NORMAL)
        dc.SetFont(font)
        dc.DrawText(u'비젼직업전문학교 인공지능반', 50, 190)
        color = wx.Colour(255,0,0)
        b = wx.Brush(color)
        dc.SetBrush(b)
        dc.DrawCircle(400, 450, 50)
        dc.SetBrush(wx.Brush(wx.Colour(255,255,255)))
        dc.DrawCircle(400, 450, 30)
        
if __name__ == '__main__':
    ap = wx.App()
    MyClass(None, 'Drawing Demo')
    ap.MainLoop()