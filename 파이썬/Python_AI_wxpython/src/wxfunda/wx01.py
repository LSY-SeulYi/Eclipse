'''
Created on 2021. 7. 21.
wx 첫작업
@author: pc354
'''

import wx

# wxPython체계를 구동하는 역할로
app = wx.App() # 먼저 이와 같이 인스턴스 app을 생성해야 함

frame = wx.Frame(parent=None,title = '나의 첫 wx ui') # 프레임을 만드는 생성 메소드를 만들기
frame.Show()
app.MainLoop(); # 화면을 대기시키기 위해 이벤트 루프를 돌림