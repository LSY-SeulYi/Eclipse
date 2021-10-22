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
## Class MyFrame2
###########################################################################

class MyFrame2 ( wx.Frame ):
    
    def __init__( self, parent ):
        wx.Frame.__init__ ( self, parent, id = wx.ID_ANY, title = wx.EmptyString, pos = wx.DefaultPosition, size = wx.Size( 379,403 ), style = wx.DEFAULT_FRAME_STYLE|wx.TAB_TRAVERSAL )
        self.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_HIGHLIGHTTEXT ) )
        
        bSizer1 = wx.BoxSizer( wx.VERTICAL )
        
        self.txtCalc = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.Size( 370,100 ), wx.TE_MULTILINE|wx.TE_RIGHT )
        self.txtCalc.SetFont( wx.Font( 20, 70, 90, 90, False, "@HY궁서B" ) )
        
        bSizer1.Add( self.txtCalc, 0, wx.ALIGN_CENTER_HORIZONTAL|wx.ALL, 5 )
        
        gSizer2 = wx.GridSizer( 6, 4, 5, 0 )
        
        self.btnLBask = wx.Button( self, wx.ID_ANY, u"(", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btnLBask.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INACTIVECAPTION ) )
        
        gSizer2.Add( self.btnLBask, 0, wx.ALL, 5 )
        
        self.btnRBask = wx.Button( self, wx.ID_ANY, u")", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btnRBask.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INACTIVECAPTION ) )
        
        gSizer2.Add( self.btnRBask, 0, wx.ALL, 5 )
        
        self.btnC = wx.Button( self, wx.ID_ANY, u"C", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btnC.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INACTIVECAPTION ) )
        
        gSizer2.Add( self.btnC, 0, wx.ALL, 5 )
        
        self.btnDel = wx.Button( self, wx.ID_ANY, u"Del", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btnDel.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INACTIVECAPTION ) )
        
        gSizer2.Add( self.btnDel, 0, wx.ALL, 5 )
        
        self.btn1divix = wx.Button( self, wx.ID_ANY, u"¹/x", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btn1divix.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INACTIVECAPTION ) )
        
        gSizer2.Add( self.btn1divix, 0, wx.ALL, 5 )
        
        self.btnxzegob = wx.Button( self, wx.ID_ANY, u"x²", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btnxzegob.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INACTIVECAPTION ) )
        
        gSizer2.Add( self.btnxzegob, 0, wx.ALL, 5 )
        
        self.btn2rootx = wx.Button( self, wx.ID_ANY, u"²√x", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btn2rootx.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INACTIVECAPTION ) )
        
        gSizer2.Add( self.btn2rootx, 0, wx.ALL, 5 )
        
        self.btndivision = wx.Button( self, wx.ID_ANY, u"÷", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btndivision.SetFont( wx.Font( 13, 70, 90, 90, False, wx.EmptyString ) )
        self.btndivision.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INACTIVECAPTION ) )
        
        gSizer2.Add( self.btndivision, 0, wx.ALL, 5 )
        
        self.btn7 = wx.Button( self, wx.ID_ANY, u"7", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btn7.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INFOBK ) )
        
        gSizer2.Add( self.btn7, 0, wx.ALL, 5 )
        
        self.btn8 = wx.Button( self, wx.ID_ANY, u"8", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btn8.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INFOBK ) )
        
        gSizer2.Add( self.btn8, 0, wx.ALL, 5 )
        
        self.btn9 = wx.Button( self, wx.ID_ANY, u"9", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btn9.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INFOBK ) )
        
        gSizer2.Add( self.btn9, 0, wx.ALL, 5 )
        
        self.btnMul = wx.Button( self, wx.ID_ANY, u"X", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btnMul.SetFont( wx.Font( wx.NORMAL_FONT.GetPointSize(), 70, 90, 90, False, wx.EmptyString ) )
        self.btnMul.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INACTIVECAPTION ) )
        
        gSizer2.Add( self.btnMul, 0, wx.ALL, 5 )
        
        self.btn4 = wx.Button( self, wx.ID_ANY, u"4", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btn4.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INFOBK ) )
        
        gSizer2.Add( self.btn4, 0, wx.ALL, 5 )
        
        self.btn5 = wx.Button( self, wx.ID_ANY, u"5", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btn5.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INFOBK ) )
        
        gSizer2.Add( self.btn5, 0, wx.ALL, 5 )
        
        self.btn6 = wx.Button( self, wx.ID_ANY, u"6", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btn6.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INFOBK ) )
        
        gSizer2.Add( self.btn6, 0, wx.ALL, 5 )
        
        self.btnMinus = wx.Button( self, wx.ID_ANY, u"-", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btnMinus.SetFont( wx.Font( 12, 70, 90, 90, False, wx.EmptyString ) )
        self.btnMinus.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INACTIVECAPTION ) )
        
        gSizer2.Add( self.btnMinus, 0, wx.ALL, 5 )
        
        self.btn1 = wx.Button( self, wx.ID_ANY, u"1", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btn1.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INFOBK ) )
        
        gSizer2.Add( self.btn1, 0, wx.ALL, 5 )
        
        self.btn2 = wx.Button( self, wx.ID_ANY, u"2", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btn2.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INFOBK ) )
        
        gSizer2.Add( self.btn2, 0, wx.ALL, 5 )
        
        self.btn3 = wx.Button( self, wx.ID_ANY, u"3", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btn3.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INFOBK ) )
        
        gSizer2.Add( self.btn3, 0, wx.ALL, 5 )
        
        self.btnPlus = wx.Button( self, wx.ID_ANY, u"+", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btnPlus.SetFont( wx.Font( 12, 70, 90, 90, False, wx.EmptyString ) )
        self.btnPlus.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INACTIVECAPTION ) )
        
        gSizer2.Add( self.btnPlus, 0, wx.ALL, 5 )
        
        self.btnPlNMi = wx.Button( self, wx.ID_ANY, u"+/-", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btnPlNMi.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INACTIVECAPTION ) )
        
        gSizer2.Add( self.btnPlNMi, 0, wx.ALL, 5 )
        
        self.btn0 = wx.Button( self, wx.ID_ANY, u"0", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btn0.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INFOBK ) )
        
        gSizer2.Add( self.btn0, 0, wx.ALL, 5 )
        
        self.btnColon = wx.Button( self, wx.ID_ANY, u".", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btnColon.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INACTIVECAPTION ) )
        
        gSizer2.Add( self.btnColon, 0, wx.ALL, 5 )
        
        self.btnOK = wx.Button( self, wx.ID_ANY, u"=", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btnOK.SetFont( wx.Font( 12, 70, 90, 90, False, wx.EmptyString ) )
        self.btnOK.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INACTIVECAPTION ) )
        
        gSizer2.Add( self.btnOK, 0, wx.ALL, 5 )
        
        
        bSizer1.Add( gSizer2, 1, 0, 5 )
        
        
        self.SetSizer( bSizer1 )
        self.Layout()
        
        self.Centre( wx.BOTH )
        
        # Connect Events
        self.btnLBask.Bind( wx.EVT_BUTTON, self.btnLBasK )
        self.btnRBask.Bind( wx.EVT_BUTTON, self.btnRBasK )
        self.btnC.Bind( wx.EVT_BUTTON, self.btnc )
        self.btnDel.Bind( wx.EVT_BUTTON, self.btnDele )
        self.btn1divix.Bind( wx.EVT_BUTTON, self.btn1diviX )
        self.btnxzegob.Bind( wx.EVT_BUTTON, self.btnxzegoB )
        self.btn2rootx.Bind( wx.EVT_BUTTON, self.btn2rootX )
        self.btndivision.Bind( wx.EVT_BUTTON, self.btndivisioN )
        self.btn7.Bind( wx.EVT_BUTTON, self.btn07 )
        self.btn8.Bind( wx.EVT_BUTTON, self.btn08 )
        self.btn9.Bind( wx.EVT_BUTTON, self.btn09 )
        self.btnMul.Bind( wx.EVT_BUTTON, self.btnMuL )
        self.btn4.Bind( wx.EVT_BUTTON, self.btn04 )
        self.btn5.Bind( wx.EVT_BUTTON, self.btn05 )
        self.btn6.Bind( wx.EVT_BUTTON, self.btn06 )
        self.btnMinus.Bind( wx.EVT_BUTTON, self.btnMinuS )
        self.btn1.Bind( wx.EVT_BUTTON, self.btn01 )
        self.btn2.Bind( wx.EVT_BUTTON, self.btn02 )
        self.btn3.Bind( wx.EVT_BUTTON, self.btn03 )
        self.btnPlus.Bind( wx.EVT_BUTTON, self.btnPluS )
        self.btnPlNMi.Bind( wx.EVT_BUTTON, self.btnPlNMI )
        self.btn0.Bind( wx.EVT_BUTTON, self.btn00 )
        self.btnColon.Bind( wx.EVT_BUTTON, self.btnColoN )
        self.btnOK.Bind( wx.EVT_BUTTON, self.btnOk )
        self.btnPlNMi.Bind( wx.EVT_RIGHT_DOWN, self.btnPlNMI1 )
    
    def __del__( self ):
        pass
    
    
    # Virtual event handlers, overide them in your derived class
    def disp(self,event):
        if self.txtCalc.GetLineText(0) == '0':
            self.txtCalc.SetValue('')
        self.txtCalc.AppendText(event.GetEventObject().GetLabel())
        
    def btnLBasK( self, event ):
        self.txtCalc.AppendText('(')
        event.Skip()
    
    def btnRBasK( self, event ):
        self.txtCalc.AppendText(')')
        event.Skip()
    
    def btnc( self, event ):
        self.txtCalc.Clear()
        event.Skip()
    
    def btnDele( self, event ):
        num = self.txtCalc.GetValue()
        self.txtCalc.Clear()
        self.txtCalc.SetValue(num[:-1])
        event.Skip()
    
    def btn1diviX( self, event ):
        num = eval('1/'+self.txtCalc.GetValue())
        self.txtCalc.SetValue(str(num))
        event.Skip()
    
    def btnxzegoB( self, event ):
        num = eval(self.txtCalc.GetValue()+'*'+self.txtCalc.GetValue())
        self.txtCalc.SetValue(str(num))
        event.Skip()
    
    def btn2rootX( self, event ):
        num = eval(self.txtCalc.GetValue()+'**0.5')
        self.txtCalc.SetValue(str(num))
        event.Skip()
    
    def btndivisioN( self, event ):
        self.txtCalc.AppendText('/')
        event.Skip()
    
    def btn07( self, event ):
        self.txtCalc.AppendText('7')
        event.Skip()

    def btn08( self, event ):
        self.txtCalc.AppendText('8')
        event.Skip()
    
    def btn09( self, event ):
        self.txtCalc.AppendText('9')
        event.Skip()
    
    def btnMuL( self, event ):
        self.txtCalc.AppendText('*')
        event.Skip()
    
    def btn04( self, event ):
        self.txtCalc.AppendText('4')
        event.Skip()
    
    def btn05( self, event ):
        self.txtCalc.AppendText('5')
        event.Skip()
    
    def btn06( self, event ):
        self.txtCalc.AppendText('6')
        event.Skip()
    
    def btnMinuS( self, event ):
        self.txtCalc.AppendText('-')
        event.Skip()
    
    def btn01( self, event ):
        self.txtCalc.AppendText('1')
        event.Skip()
    
    def btn02( self, event ):
        self.txtCalc.AppendText('2')
        event.Skip()
    
    def btn03( self, event ):
        self.txtCalc.AppendText('3')
        event.Skip()
    
    def btnPluS( self, event ):
        self.txtCalc.AppendText('+')
        event.Skip()
    
    def btnPlNMI( self, event ):
        try:        
            num = -((int)(self.txtCalc.GetValue()))
            self.txtCalc.SetValue(str(num))
            
        except:
            res = 'error!'
            self.txtCalc.SetValue(num)
        
    def btnPlNMI1( self, event ):
        self.txtCalc.AppendText('-')
        event.Skip()
    
    def btn00( self, event ):
        self.txtCalc.AppendText('0')
        event.Skip()
    
    def btnColoN( self, event ):
        self.txtCalc.AppendText('.')
        event.Skip()
    
    def btnOk( self, event ):
        try:
            num = eval(self.txtCalc.GetLineText(0))
            self.txtCalc.SetValue(str(num))
        except:
            num = 'error!'
            self.txtCalc.SetValue(num)
        event.Skip()
    

if __name__ == '__main__' :
    app = wx.App(False)
    frame = MyFrame2(None)
    frame.Show(True)
    app.MainLoop()