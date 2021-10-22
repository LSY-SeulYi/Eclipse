'''
Created on 2021. 7. 26.
사인 패널
@author: pc354
'''

########################## sinepanel.py 

##################################  sinepanel.py 
import wx
import math  

class SinePanel ( wx.Panel ):
    def __init__( self,parent,amplitude=1,frequency=1 ):
        wx.Panel.__init__ ( self, parent, id = wx.ID_ANY, pos = wx.DefaultPosition, size = wx.Size( 500,300 ), style = wx.TAB_TRAVERSAL )
        self.amplitude = amplitude
        self.frequency = frequency 
        self.Bind(wx.EVT_PAINT,self.OnPaint)
        
    def SetData(self,amplitude,frequency):
        self.amplitude = amplitude
        self.frequency = frequency
        self.Bind(wx.EVT_PAINT,self.OnPaint)
 
    
    def OnPaint(self,event):
        dc = wx.PaintDC(self)
        brush = wx.Brush("white")
        dc.SetBackground(brush)
        dc.Clear()
        pen = wx.Pen(wx.Colour(0,0,255))
        dc.SetPen(pen)
        # sine curve drawing
        dc.SetBrush(wx.Brush(wx.Colour("#D9E5FF"),wx.CROSS_HATCH))
        dc.DrawRectangle(10,10, 730, 400)
         
        # 기준 축 그리기 
        dc.DrawLine(10,10,10,411)
        dc.DrawLine(10,210,730,211)
        for x in range(10,411,20):
            dc.DrawLine(0,x,15,x)
        for x in range(10,731,90):
            dc.DrawLine(x,200,x,220)
            dc.DrawText(u""+str(x-10),x,210)
        
        dc.DrawText(u"+1",10,10)
        dc.DrawText(u"-1",10,410)
        brush = wx.Brush("red")
        dc.SetBrush(brush)
        #brush.SetColour(wx.Colour(255,0,0))        
        pen = wx.Pen(wx.Colour(255,0,0))
        dc.SetPen(pen)
        nums = list(range(0,721))
        data=[]
        for x in nums[::1]:
            y = self.amplitude * math.sin((x*math.pi/180)*self.frequency) # -1 ~ +1
            y = y*200 #뻥튀기
            y = -y + 210 #쉬프트  
            #y = -1*y #좌표계수정 
            data.append((x+10,y))
              
            dc.DrawCircle(x+10, y, 1) #일정규모의 원으로 그리기   
            #dc.DrawPoint(x+10, y) #가는 점을 찍어 그리기 
        # 한꺼번에 폴리곤으로 그리는 법 
        #dc.DrawPolygon(data, xoffset=0, yoffset=0)
        wx.Font()
        font = wx.Font(10,wx.ROMAN,wx.FONTSTYLE_NORMAL,wx.FONTWEIGHT_NORMAL) 
        dc.SetFont(font)
        dc.DrawText(u"비젼직업전문학교 인공지능과정",530,413)
          
    def __del__( self ):
        pass

 

 

