############################################  testSinePanel.py

# -*- coding: utf-8 -*- 
import wx
import wx.xrc

from graphics.SinePanel import SinePanel

class MyFrame1 ( wx.Frame ):
    def __init__( self ):
        wx.Frame.__init__ ( self, parent=None, id = wx.ID_ANY, title = wx.EmptyString, pos = wx.DefaultPosition, size = wx.Size( 775,510 ), style = wx.DEFAULT_FRAME_STYLE|wx.TAB_TRAVERSAL )
        self.SetSizeHints( wx.DefaultSize, wx.DefaultSize )
        bSizer1 = wx.BoxSizer( wx.VERTICAL )
        bSizer2 = wx.BoxSizer( wx.HORIZONTAL )
        self.m_staticText1 = wx.StaticText( self, wx.ID_ANY, u"진폭", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText1.Wrap( -1 )
        bSizer2.Add( self.m_staticText1, 0, wx.ALL, 5 )
        
        self.m_textCtrl1 = wx.TextCtrl( self, wx.ID_ANY,u"1", wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer2.Add( self.m_textCtrl1, 0, wx.ALL, 5 )
        self.m_staticText2 = wx.StaticText( self, wx.ID_ANY, u"주파수", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText2.Wrap( -1 )
        bSizer2.Add( self.m_staticText2, 0, wx.ALL, 5 )
        self.m_textCtrl2 = wx.TextCtrl( self, wx.ID_ANY, u"1", wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer2.Add( self.m_textCtrl2, 0, wx.ALL, 5 )
        self.m_button1 = wx.Button( self, wx.ID_ANY, u"SineCurve", wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer2.Add( self.m_button1, 0, wx.ALL, 5 )
        bSizer1.Add( bSizer2, 0, wx.EXPAND, 5 )
        self.panel = SinePanel(self)
        bSizer1.Add( self.panel, 1, wx.EXPAND |wx.ALL, 5 )
        self.SetSizer( bSizer1 )
        self.Layout()
        self.Centre( wx.BOTH )
        # Connect Events
        self.m_button1.Bind( wx.EVT_BUTTON, self.OnDraw )
    
    def __del__( self ):
        pass
 

    # Virtual event handlers, overide them in your derived class
    def OnDraw( self, event ):
        amplitude = float(self.m_textCtrl1.GetValue()) 
        frequency = float(self.m_textCtrl2.GetValue()) 
        self.panel.SetData(amplitude, frequency)
        self.panel.Refresh()
        event.Skip()
    
if __name__ == '__main__':
    app = wx.App();  # 가장먼저 
    frame = MyFrame1(); 
    frame.Show(); 
    app.MainLoop(); 