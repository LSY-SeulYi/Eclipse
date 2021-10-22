'''
Created on 2021. 7. 21.
이벤트 핸들링 - 윈도우 색상 바꾸기
@author: pc354
'''

import wx

class MyFrame(wx.Frame):
    def __init__(self):
        wx.Frame.__init__(self,parent=None,title='Change Window Color')
        self.Bind(wx.EVT_LEFT_DOWN,self.OnMouseLButton)
        self.Bind(wx.EVT_RIGHT_DOWN,self.OnMouseRButton)
        self.Bind(wx.EVT_CLOSE, self.OnClose)
    def OnMouseLButton(self,event):
        self.SetBackgroundColour(wx.Colour(100,190,100,0)) # RGB채도
        self.SetWindowStyle(wx.RESIZE_BORDER|wx.CAPTION)
        self.Refresh()
    def OnMouseRButton(self,event):
        self.SetBackgroundColour(wx.Colour(200,100,100,0)) # RGB채도
        self.SetWindowStyle(wx.DEFAULT_FRAME_STYLE)
        self.Refresh()
    def OnClose(self,event):
        if wx.MessageBox('윈도우를 닫을까요??','확인', wx.YES_NO) != wx.YES:
            event.Skip(False)
        else:
            self.Destroy()
        
if __name__ == '__main__' :
    app = wx.App()
    frame = MyFrame()
    frame.Show()
    app.MainLoop()