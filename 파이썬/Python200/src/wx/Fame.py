'''
Created on 2021. 7. 20.

@author: pc354
'''
import wx

from wx.wx_gul_test import MyFrame1


if __name__ == '__main__': 
    app = wx.App() 
    frame = MyFrame1(parent=None) # MyFrame1은 생성된 코드의 class 명임 
    frame.Show() 
    app.MainLoop(); 