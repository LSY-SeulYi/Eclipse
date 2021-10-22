'''
Created on 2021. 7. 26.

@author: pc354
'''
import wx


class BarChartPanel(wx.Panel):
    
    def __init__(self):
        wx.Panel.__init__(self,parent=None)
        
        
    def SetDate(self,data):
        self.data = data
        self.Bind(wx.EVT_PAINT, self.OnPaint)
        self.Refresh()
        
    def OnPaint(self, e):
        dc = wx.PaintDC(self)
        brush = wx.Brush('white')
        dc.SetBackground(brush)
        dc.Clear()
        pen = wx.Pen(wx.Colour(0,0,255))
        dc.SetPen(pen)
        dc.SetBrush(wx.Brush(wx.Colour(0,0,255)))
        size = len(self.data)
        for x in range(0,size):
            # 좌측 상단 x,y 사각형의 가로 넓이, 세로 높이
            dc.DrawRectangle((10+(x*40)), 200-self.data[x], 30, self.data[x])
            # 데이터의 값을 글씨로 나타냄 (좌측 상단점 기준)
            dc.DrawText(str(self.data[x]), (10+(x*40)), 210)
            
if __name__ == '__main__':
    ap = wx.App()
    BarChartPanel(None)
    ap.MainLoop()