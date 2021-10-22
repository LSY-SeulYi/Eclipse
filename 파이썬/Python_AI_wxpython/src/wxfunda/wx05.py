'''
Created on 2021. 7. 21.
Frame의 속성 조정하기
@author: pc354
'''
import wx
from wx import *

class MyFrame(wx.Frame):
    def __init__(self):
        wx.Frame.__init__(self,parent=None,title='WindowReSize')
        self.Bind(wx.EVT_LEFT_DOWN, self.OnMouseLButtonDown)
        self.Bind(wx.EVT_RIGHT_DOWN, self.OnMouseRButtonDown)
        self.Bind(wx.EVT_CLOSE, self.OnClose)
    # 이벤트 핸들러 메소드
    def OnMouseLButtonDown(self,event):
        frame.SetSize(wx.Size(400,300))
        
    def OnMouseRButtonDown(self,event):
        frame.SetSize(wx.Size(200,400))
        
    def OnClose(self,event):
        if wx.MessageBox('윈도우를 닫을까요??','확인', wx.YES_NO) != wx.YES:
            event.Skip(False)
        else:
            self.Destroy()
        
if __name__ == '__main__':
    app = wx.App()
    frame = MyFrame()
    frame.Show()
    app.MainLoop()
    