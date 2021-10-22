# -*- coding: utf-8 -*- 

###########################################################################
## Python code generated with wxFormBuilder (version Jun 17 2015)
## http://www.wxformbuilder.org/
##
## PLEASE DO "NOT" EDIT THIS FILE!
###########################################################################

import wx
import wx.xrc
from sqliteLogisticsSystem import logisticsSystem

###########################################################################
## Class MyFrame1
###########################################################################

class MyFrame1 ( wx.Frame ):
    
    def __init__( self, parent ):
        wx.Frame.__init__ ( self, parent, id = wx.ID_ANY, title = wx.EmptyString, pos = wx.DefaultPosition, size = wx.Size( 597,438 ), style = wx.DEFAULT_FRAME_STYLE|wx.TAB_TRAVERSAL )

        self.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_ACTIVECAPTION ) )
        
        bSizer1 = wx.BoxSizer( wx.VERTICAL )
        
        bSizer6 = wx.BoxSizer( wx.HORIZONTAL )
        
        self.m_staticText1 = wx.StaticText( self, wx.ID_ANY, u"물류번호", wx.DefaultPosition, wx.DefaultSize, wx.ALIGN_CENTRE )
        self.m_staticText1.Wrap( -1 )
        self.m_staticText1.SetMinSize( wx.Size( 60,-1 ) )
        
        bSizer6.Add( self.m_staticText1, 0, wx.ALL, 5 )
        
        self.txtID = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        self.txtID.SetMinSize( wx.Size( 200,-1 ) )
        
        bSizer6.Add( self.txtID, 0, wx.ALL, 5 )
        
        self.m_staticText2 = wx.StaticText( self, wx.ID_ANY, u"제품명", wx.DefaultPosition, wx.DefaultSize, wx.ALIGN_CENTRE )
        self.m_staticText2.Wrap( -1 )
        self.m_staticText2.SetMinSize( wx.Size( 60,-1 ) )
        
        bSizer6.Add( self.m_staticText2, 0, wx.ALL, 5 )
        
        self.txtNAME = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        self.txtNAME.SetMinSize( wx.Size( 200,-1 ) )
        
        bSizer6.Add( self.txtNAME, 0, wx.ALL, 5 )
        
        
        bSizer1.Add( bSizer6, 1, wx.ALL|wx.EXPAND, 5 )
        
        bSizer5 = wx.BoxSizer( wx.HORIZONTAL )
        
        self.m_staticText5 = wx.StaticText( self, wx.ID_ANY, u"입고시간", wx.DefaultPosition, wx.DefaultSize, wx.ALIGN_CENTRE )
        self.m_staticText5.Wrap( -1 )
        self.m_staticText5.SetMinSize( wx.Size( 60,-1 ) )
        
        bSizer5.Add( self.m_staticText5, 0, wx.ALL, 5 )
        
        self.txtWEAR = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        self.txtWEAR.SetMinSize( wx.Size( 200,-1 ) )
        
        bSizer5.Add( self.txtWEAR, 0, wx.ALL, 5 )
        
        self.m_staticText6 = wx.StaticText( self, wx.ID_ANY, u"출고시간", wx.DefaultPosition, wx.DefaultSize, wx.ALIGN_CENTRE )
        self.m_staticText6.Wrap( -1 )
        self.m_staticText6.SetMinSize( wx.Size( 60,-1 ) )
        
        bSizer5.Add( self.m_staticText6, 0, wx.ALL, 5 )
        
        self.txtDELIVERY = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        self.txtDELIVERY.SetMinSize( wx.Size( 200,-1 ) )
        
        bSizer5.Add( self.txtDELIVERY, 0, wx.ALL, 5 )
        
        
        bSizer1.Add( bSizer5, 1, wx.ALL|wx.EXPAND, 5 )
        
        bSizer3 = wx.BoxSizer( wx.HORIZONTAL )
        
        self.btnUpdate = wx.Button( self, wx.ID_ANY, u"UPDATE", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btnUpdate.SetMinSize( wx.Size( 90,-1 ) )
        
        bSizer3.Add( self.btnUpdate, 0, wx.ALL, 5 )
        
        self.btnInsert = wx.Button( self, wx.ID_ANY, u"INSERT", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btnInsert.SetMinSize( wx.Size( 90,-1 ) )
        
        bSizer3.Add( self.btnInsert, 0, wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.btnSelect = wx.Button( self, wx.ID_ANY, u"SELECT", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btnSelect.SetMinSize( wx.Size( 90,-1 ) )
        
        bSizer3.Add( self.btnSelect, 0, wx.ALL, 5 )
        
        self.btnDelete = wx.Button( self, wx.ID_ANY, u"DELETE", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btnDelete.SetMinSize( wx.Size( 90,-1 ) )
        
        bSizer3.Add( self.btnDelete, 0, wx.ALL, 5 )
        
        self.btnSelectall = wx.Button( self, wx.ID_ANY, u"SELECTALL", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btnSelectall.SetMinSize( wx.Size( 90,-1 ) )
        
        bSizer3.Add( self.btnSelectall, 0, wx.ALL, 5 )
        
        self.btnClear = wx.Button( self, wx.ID_ANY, u"CLEAR", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.btnClear.SetMinSize( wx.Size( 90,-1 ) )
        
        bSizer3.Add( self.btnClear, 0, wx.ALL, 5 )
        
        
        bSizer1.Add( bSizer3, 1, wx.EXPAND, 5 )
        
        bSizer4 = wx.BoxSizer( wx.VERTICAL )
        
        self.txtAREA = wx.TextCtrl( self, wx.ID_ANY, u" ", wx.DefaultPosition, wx.DefaultSize, wx.TE_DONTWRAP|wx.TE_MULTILINE )
        self.txtAREA.SetMinSize( wx.Size( 600,500 ) )
        
        bSizer4.Add( self.txtAREA, 0, wx.ALL, 5 )
        
        
        bSizer1.Add( bSizer4, 1, wx.EXPAND, 5 )
        
        
        self.SetSizer( bSizer1 )
        self.Layout()
        
        self.Centre( wx.BOTH )
        
        # Connect Events
        self.btnUpdate.Bind( wx.EVT_BUTTON, self.btnUPDATE )
        self.btnInsert.Bind( wx.EVT_BUTTON, self.btnINSERT )
        self.btnSelect.Bind( wx.EVT_BUTTON, self.btnSELECT )
        self.btnDelete.Bind( wx.EVT_BUTTON, self.btnDELETE )
        self.btnSelectall.Bind( wx.EVT_BUTTON, self.btnSELECTALL )
        self.btnClear.Bind( wx.EVT_BUTTON, self.btnCLEAR )
    
    def __del__( self ):
        pass
    
    
    # Virtual event handlers, overide them in your derived class
    def btnUPDATE( self, event ):
        name=self.txtNAME.GetValue()
        wear_time=self.txtWEAR.GetValue()
        delivery_time=self.txtDELIVERY.GetValue()
        id=self.txtID.GetValue()
        try:
            logisticsSystem.update((name,wear_time,delivery_time,id))
        except:
            print('예외발생!')
        finally:
            print('수정작업종료')
        event.Skip()
    
    def btnINSERT( self, event ):
        id=self.txtID.GetValue()
        name=self.txtNAME.GetValue()
        wear_time=self.txtWEAR.GetValue()
        delivery_time=self.txtDELIVERY.GetValue()
        try:
            logisticsSystem.insertData(id, name, wear_time, delivery_time)
        except:
            print('예외발생!')
        finally:
            print('입력작업종료')
        event.Skip()
    
    def btnSELECT( self, event ):
        key = self.txtID.GetValue()
        row = logisticsSystem.select(key)
        self.txtID.SetValue(row[0])
        self.txtNAME.SetValue(row[1])
        self.txtWEAR.SetValue(row[2])
        self.txtDELIVERY.SetValue(row[3])
        event.Skip()
    
    def btnDELETE( self, event ):
        id=self.txtID.GetValue()
        try:
            logisticsSystem.delete(id)
        except:
            print('예외발생!')
        finally:
            print('삭제작업완료')
        event.Skip()
    
    def btnSELECTALL( self, event ):
        rows= logisticsSystem.selectAll()
        for row in rows:
            self.txtAREA.AppendText("{},{},{},{}\n"
                .format(row[0],row[1],row[2],row[3]))
        event.Skip()
    
    def btnCLEAR( self, event ):
        self.txtID.SetValue('')
        self.txtNAME.SetValue('')
        self.txtWEAR.SetValue('')
        self.txtDELIVERY.SetValue('')
        self.txtAREA.SetValue('')
        event.Skip()


if __name__ == '__main__':
    app=wx.App()
    frame = MyFrame1(parent=None)
    frame.Show()
    app.MainLoop()
