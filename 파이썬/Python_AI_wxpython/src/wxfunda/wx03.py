'''
Created on 2021. 7. 21.

@author: pc354
'''
import wx


class MyFrame (wx.Frame):
    def __init__(self):
        wx.Frame.__init__(self,parent=None,title='안녕!')
if __name__ == '__main__':
    app = wx.App()
    frame = MyFrame()
    frame.Show()
    app.MainLoop()