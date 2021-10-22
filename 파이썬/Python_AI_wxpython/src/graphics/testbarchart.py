# -*- coding: utf-8 -*- 

###########################################################################
## Python code generated with wxFormBuilder (version Jun 17 2015)
## http://www.wxformbuilder.org/
##
## PLEASE DO "NOT" EDIT THIS FILE!
###########################################################################

import wx
import wx.xrc

from graphics.barchartpanel import BarChartPanel


###########################################################################
## Class MyFrame2
###########################################################################
class MyFrame2 ( wx.Frame ):
    
    def __init__( self, parent ):
        wx.Frame.__init__ ( self, parent, id = wx.ID_ANY, title = wx.EmptyString, pos = wx.DefaultPosition, size = wx.Size( 500,300 ), style = wx.DEFAULT_FRAME_STYLE|wx.TAB_TRAVERSAL )

        bSizer9 = wx.BoxSizer( wx.VERTICAL )
        
        self.m_panel2 = wx.Panel( self, wx.ID_ANY, wx.DefaultPosition, wx.DefaultSize, wx.TAB_TRAVERSAL )
        bSizer11 = wx.BoxSizer( wx.HORIZONTAL )
        
        self.m_staticText9 = wx.StaticText( self.m_panel2, wx.ID_ANY, u"성적입력", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText9.Wrap( -1 )
        bSizer11.Add( self.m_staticText9, 0, wx.ALL, 5 )
        
        self.txtscore = wx.TextCtrl( self.m_panel2, wx.ID_ANY, u"홍길동,42,유관순,57,김영남,66,박금자,94", wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer11.Add( self.txtscore, 0, wx.ALL, 5 )
        
        self.btnOn = wx.Button( self.m_panel2, wx.ID_ANY, u"그래프그리기", wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer11.Add( self.btnOn, 0, wx.ALL, 5 )
        
        self.m_panel8 = wx.Panel( self.m_panel2, wx.ID_ANY, wx.DefaultPosition, wx.DefaultSize, wx.TAB_TRAVERSAL )
        bSizer11.Add( self.m_panel8, 1, wx.EXPAND |wx.ALL, 5 )
        
        
        self.m_panel2.SetSizer( bSizer11 )
        self.m_panel2.Layout()
        bSizer11.Fit( self.m_panel2 )
        bSizer9.Add( self.m_panel2, 1, wx.EXPAND |wx.ALL, 5 )
        
        
        self.SetSizer( bSizer9 )
        self.Layout()
        
        self.Centre( wx.BOTH )
        
        # Connect Events
        self.btnOn.Bind( wx.EVT_BUTTON, self.btnon )
    
    def __del__( self ):
        pass
    
    
    # Virtual event handlers, overide them in your derived class
    def btnon( self, event ):
        self.panel = BarChartPanel()
        scores = self.txtscore.GetValue().split(',')
        data = scores[1::2]
        self.panel.SetDate(data)
        event.Skip()
    


    

if __name__ == '__main__':
    app = wx.App()
    frame = MyFrame2(None)
    frame.Show()
    app.MainLoop()