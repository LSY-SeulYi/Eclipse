'''
Created on 2021. 7. 21.
나의 두번째 wx 예제
@author: pc354
'''
import wx


class MyApp(wx.App):
    def OnInit(self):
        frame = wx.Frame(parent = None, title = 'Hello!')
        frame.Show(True)
        return True
    
if __name__ == '__main__' :
    app = MyApp()
    app.MainLoop()