# -*- coding: utf-8 -*- 

###########################################################################
## Python code generated with wxFormBuilder (version Jun 17 2015)
## http://www.wxformbuilder.org/
##
## PLEASE DO "NOT" EDIT THIS FILE!
###########################################################################

import wx
import wx.xrc

from graphics.MySinPanel import MySinePanel


###########################################################################
## Class MyFrame1
###########################################################################
class MyFrame1 ( wx.Frame ):
    
    def __init__( self, parent):
        wx.Frame.__init__ ( self, parent, id = wx.ID_ANY, title = wx.EmptyString, pos = wx.DefaultPosition, size = wx.Size( 1500,460 ), style = wx.DEFAULT_FRAME_STYLE|wx.TAB_TRAVERSAL )

        bSizer2 = wx.BoxSizer( wx.VERTICAL )
        
        bSizer3 = wx.BoxSizer( wx.HORIZONTAL )
        
        self.m_staticText1 = wx.StaticText( self, wx.ID_ANY, u"진폭 : ", wx.DefaultPosition, wx.Size( -1,-1 ), wx.ALIGN_CENTRE )
        self.m_staticText1.Wrap( -1 )
        self.m_staticText1.SetForegroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_BTNHIGHLIGHT ) )
        self.m_staticText1.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_BTNTEXT ) )
        
        bSizer3.Add( self.m_staticText1, 0, wx.ALL, 5 )
        
        self.txtemp = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.Size( -1,-1 ), 0 )
        bSizer3.Add( self.txtemp, 0, wx.ALL, 5 )
        
        self.m_staticText2 = wx.StaticText( self, wx.ID_ANY, u"주파수 : ", wx.DefaultPosition, wx.Size( -1,-1 ), wx.ALIGN_CENTRE )
        self.m_staticText2.Wrap( -1 )
        self.m_staticText2.SetForegroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_BTNHIGHLIGHT ) )
        self.m_staticText2.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_CAPTIONTEXT ) )
        
        bSizer3.Add( self.m_staticText2, 0, wx.ALL, 5 )
        
        self.txtfeq = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.Size( -1,-1 ), 0 )
        bSizer3.Add( self.txtfeq, 0, wx.ALL, 5 )
        
        self.btnOn = wx.Button( self, wx.ID_ANY, u"곡선그리기", wx.DefaultPosition, wx.Size( -1,-1 ), 0 )
        self.btnOn.SetForegroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_BTNHIGHLIGHT ) )
        self.btnOn.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_CAPTIONTEXT ) )
        
        bSizer3.Add( self.btnOn, 0,wx.ALIGN_TOP| wx.ALL, 5 )
        
        self.sinepanel = MySinePanel(self,parent)
        bSizer2.Add( bSizer3, 1, wx.ALIGN_TOP|wx.TOP , 5 )
        bSizer2.Add(self.sinepanel,1, wx.ALIGN_TOP|wx.EXPAND, 5)
        
        
        self.SetSizer( bSizer2 )
        self.Layout()
        
        self.Centre( wx.BOTH )
        
        # Connect Events
        self.btnOn.Bind( wx.EVT_BUTTON, self.btnOnDraw )
    
    def __del__( self ):
        pass
    
    
    # Virtual event handlers, overide them in your derived class
    def btnOnDraw( self, event ):
        amplitude = float(self.txtemp.GetValue())
        frequency = float(self.txtfeq.GetValue())
        self.sinepanel.setData(amplitude, frequency)
        self.sinepanel.Refresh()
        event.Skip()
    

if __name__ == '__main__':
    app = wx.App()
    frame = MyFrame1(None)
    frame.Show()
    app.MainLoop()