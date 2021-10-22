# -*- coding: utf-8 -*- 

###########################################################################
## Python code generated with wxFormBuilder (version Jun 17 2015)
## http://www.wxformbuilder.org/
##
## PLEASE DO "NOT" EDIT THIS FILE!
###########################################################################

import wx
import wx.xrc


###########################################################################
## Class MyFrame1
###########################################################################
class MyFrame1 ( wx.Frame ):
    
    def __init__( self, parent ):
        wx.Frame.__init__ ( self, parent, id = wx.ID_ANY, title = u"빌드를 이용함", pos = wx.DefaultPosition, size = wx.Size( 563,214 ), style = wx.DEFAULT_FRAME_STYLE|wx.TAB_TRAVERSAL )
 
        bSizer3 = wx.BoxSizer( wx.HORIZONTAL )
        
        self.m_staticText1 = wx.StaticText( self, wx.ID_ANY, u"이름 : ", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText1.Wrap( -1 )
        bSizer3.Add( self.m_staticText1, 0, wx.ALL, 5 )
        
        self.txtName = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer3.Add( self.txtName, 0, wx.ALL, 5 )
        
        self.m_button1 = wx.Button( self, wx.ID_ANY, u"확인", wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer3.Add( self.m_button1, 0, wx.ALL, 5 )
        
        bSizer4 = wx.BoxSizer( wx.HORIZONTAL )
        
        self.m_staticText2 = wx.StaticText( self, wx.ID_ANY, u"나이 : ", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText2.Wrap( -1 )
        bSizer4.Add( self.m_staticText2, 0, wx.ALL, 5 )
        
        self.txtAge = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer4.Add( self.txtAge, 0, wx.ALL, 5 )
        
        self.m_button2 = wx.Button( self, wx.ID_ANY, u"확인", wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer4.Add( self.m_button2, 0, wx.ALL, 5 )
        
        
        bSizer3.Add( bSizer4, 1, wx.EXPAND, 5 )
        
        
        self.SetSizer( bSizer3 )
        self.Layout()
        
        self.Centre( wx.BOTH )
        
        # Connect Events
        self.m_button1.Bind( wx.EVT_BUTTON, self.buttonName )
        self.m_button2.Bind( wx.EVT_BUTTON, self.buttonAge )
    
    def __del__( self ):
        pass
    
    
    # Virtual event handlers, overide them in your derived class
    def buttonName( self, event ):
        # event.Skip()
        for dan in range(2,10):
            for x in range(1,9):
                print('%d*%d=%2d\t'%(dan,x,(dan*x)),end='')
    
    def buttonAge( self, event ):
        event.Skip()
    



if __name__ == '__main__' :
    app = wx.App()
    frame = MyFrame1(parent=None)
    frame.Show()
    app.MainLoop()