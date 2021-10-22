'''
Created on 2021. 7. 21.
컨테이너에 위젯넣기
@author: pc354
'''
import wx


class MyFrame(wx.Frame):
    def __init__(self):
        wx.Frame.__init__(self,parent=None,title='Button on Pannel')
        self.panel = wx.Panel(self) # 패널의 parent가 self 이다
        self.panel.SetBackgroundColour(wx.RED)
        self.btn1 = wx.Button(self.panel,label='(50,50)')
        self.btn1.SetPosition((50,50))
        self.btn2 = wx.Button(self.panel,label='(250,100)')
        self.btn2.SetPosition((250,100))
        
if __name__ == '__main__' :
    app = wx.App()
    frame = MyFrame()
    frame.Show()
    app.MainLoop()