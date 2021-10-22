'''
Created on 2021. 7. 26.
사인 패널
@author: pc354
'''
import math

import wx


class MySinePanel(wx.Panel):
    def __init__(self,parent,amplitude=1,frequency=1):
        wx.Panel.__init__(self,parent)
        self.amplitude = amplitude
        self.frequency = frequency
        self.Bind(wx.EVT_PAINT, self.OnPaint)
        
    def setData(self,amplitude,frequency):
        self.amplitude = amplitude
        self.frequency = frequency
        self.Bind(wx.EVT_PAINT, self.OnPaint)
        
    def OnPaint(self,e):
        dc = wx.PaintDC(self)
        brush = wx.Brush('white')
        dc.SetBackground(brush)
        dc.Clear()
        pen = wx.Pen(wx.Colour(0,0,255))
        dc.SetPen(pen)
        
        # 사인 곡선 그리기
        dc.SetBrush(wx.Brush(wx.Colour('#D9E5FF'),wx.CROSS_HATCH))
        dc.DrawRectangle(10, 10, 720, 400)
        
        # 기준 축 그리기
        dc.DrawLine(10, 210, 730, 211)
        for y in range(10,411,20):
            dc.DrawLine(0,y,15,y) # y축 눈금표시
        for x in range(10,731,90):
            dc.DrawLine(x,200,x,220) # x축 눈금표시
            dc.DrawText(u''+str(x-10), x, 210) # 각도 표시
        brush = wx.Brush('red')
        dc.SetBrush(brush)
        pen = wx.Pen(wx.Colour(255,0,0))
        dc.SetPen(pen)
        
        nums = list(range(0,721))
        data = []
        for x in nums[::1]:
            y = self.amplitude*math.sin((x*math.pi/180)*self.frequency)
            y = y * 210 # 시각화를 위한 뻥튀기
            y = -y + 210 # 좌표계 조정 및 쉬프트
            data.append((x+10,y))
            # dc.DrawPoint((x+10,y)) # 얇은 점선으로 그릴때
            dc.DrawCircle(x+10, y, 1) # 굵직한 점선으로 그릴때
        # dc.DrawPolygon(data, xoffset=0, yoffset=0) # 선으로 그릴때
        
        font = wx.Font(10,wx.ROMAN,wx.FONTSTYLE_NORMAL,wx.FONTWEIGHT_NORMAL)
        dc.SetFont(font)
        dc.DrawText(u'비젼AI과정', 530, 413)


    
    
if __name__ == '__main__':
    ap = wx.App()
    MySinePanel(None)
    ap.MainLoop()