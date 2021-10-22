'''
Created on 2021. 7. 21.
이벤트 처리하기
@author: pc354
'''
import wx


class MyFrame (wx.Frame):
    def __init__(self):
        wx.Frame.__init__(self,parent=None,title='Close Event Test')
        self.Bind(wx.EVT_CLOSE, self.OnClose) # 이벤트 처리를 위한 바인딩
    def OnClose(self,event):
        if wx.MessageBox('윈도우를 닫을까요??','확인', wx.YES_NO) != wx.YES:
            event.Skip(False) # 이벤트가 없었던 걸로
        else:
            self.Destroy() # 자신의 객체를 제거
if __name__ == '__main__':
    app = wx.App()
    frame = MyFrame()
    frame.Show()
    app.MainLoop()
    
