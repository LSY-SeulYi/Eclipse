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
from sqlite import sqliteCRUD

class MyFrame1 ( wx.Frame ):
    
    def __init__( self, parent ):
        wx.Frame.__init__ ( self, parent, id = wx.ID_ANY, title = u"MyMemberCRUDsystem", pos = wx.DefaultPosition, size = wx.Size( 500,318 ), style = wx.DEFAULT_FRAME_STYLE|wx.TAB_TRAVERSAL )
        
        self.SetSizeHintsSz( wx.DefaultSize, wx.DefaultSize )
        
        bSizer1 = wx.BoxSizer( wx.VERTICAL )
        
        bSizer2 = wx.BoxSizer( wx.VERTICAL )
        
        bSizer4 = wx.BoxSizer( wx.HORIZONTAL )
        
        self.m_staticText1 = wx.StaticText( self, wx.ID_ANY, u"회원ID   ", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText1.Wrap( -1 )
        bSizer4.Add( self.m_staticText1, 0, wx.ALL, 5 )
        
        self.txt_Id = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer4.Add( self.txt_Id, 0, wx.ALL, 5 )
        
        
        bSizer2.Add( bSizer4, 1, wx.EXPAND, 5 )
        
        bSizer7 = wx.BoxSizer( wx.HORIZONTAL )
        
        self.m_staticText2 = wx.StaticText( self, wx.ID_ANY, u"회원이름", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText2.Wrap( -1 )
        bSizer7.Add( self.m_staticText2, 0, wx.ALL, 5 )
        
        self.txt_name = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer7.Add( self.txt_name, 0, wx.ALL, 5 )
        
        
        bSizer2.Add( bSizer7, 1, wx.EXPAND, 5 )
        
        bSizer8 = wx.BoxSizer( wx.HORIZONTAL )
        
        self.m_staticText3 = wx.StaticText( self, wx.ID_ANY, u"패스워드", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText3.Wrap( -1 )
        bSizer8.Add( self.m_staticText3, 0, wx.ALL, 5 )
        
        self.txt_password = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer8.Add( self.txt_password, 0, wx.ALL, 5 )
        
        
        bSizer2.Add( bSizer8, 1, wx.EXPAND, 5 )
        
        bSizer71 = wx.BoxSizer( wx.HORIZONTAL )
        
        self.m_staticText4 = wx.StaticText( self, wx.ID_ANY, u"회원특징", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText4.Wrap( -1 )
        bSizer71.Add( self.m_staticText4, 0, wx.ALL, 5 )
        
        self.txt_remark = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.Size( 450,-1 ), 0 )
        bSizer71.Add( self.txt_remark, 0, wx.ALL, 5 )
        
        
        bSizer2.Add( bSizer71, 1, wx.EXPAND, 5 )
        
        
        bSizer1.Add( bSizer2, 1, wx.EXPAND, 5 )
        
        bSizer3 = wx.BoxSizer( wx.HORIZONTAL )
        
        self.btn_insert = wx.Button( self, wx.ID_ANY, u"INSERT", wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer3.Add( self.btn_insert, 0, wx.ALL, 5 )
        
        self.btn_delete = wx.Button( self, wx.ID_ANY, u"DELETE", wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer3.Add( self.btn_delete, 0, wx.ALL, 5 )
        
        self.btn_update = wx.Button( self, wx.ID_ANY, u"UPDATE", wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer3.Add( self.btn_update, 0, wx.ALL, 5 )
        
        self.btn_find = wx.Button( self, wx.ID_ANY, u"FIND", wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer3.Add( self.btn_find, 0, wx.ALL, 5 )
        
        self.btn_alldata = wx.Button( self, wx.ID_ANY, u"ALLDATA", wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer3.Add( self.btn_alldata, 0, wx.ALL, 5 )
        
        
        bSizer1.Add( bSizer3, 1, wx.EXPAND, 5 )
        
        self.resultArea = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.Size( 500,100 ), wx.HSCROLL|wx.TE_MULTILINE )
        bSizer1.Add( self.resultArea, 0, wx.ALL, 5 )
        
        
        self.SetSizer( bSizer1 )
        self.Layout()
        
        self.Centre( wx.BOTH )
        
        # Connect Events
        self.btn_insert.Bind( wx.EVT_BUTTON, self.OnInsert )
        self.btn_delete.Bind( wx.EVT_BUTTON, self.OnDelete )
        self.btn_update.Bind( wx.EVT_BUTTON, self.OnUpdate )
        self.btn_find.Bind( wx.EVT_BUTTON, self.OnFind )
        self.btn_alldata.Bind( wx.EVT_BUTTON, self.OnAlldata )
    
    def __del__( self ):
        pass
    
    
    # Virtual event handlers, overide them in your derived class
    def OnInsert( self, event ):
        id=self.txt_Id.GetValue()
        name=self.txt_name.GetValue()
        password=self.txt_password.GetValue()
        remark=self.txt_remark.GetValue()
        try:
            sqliteCRUD.insertData(id, name, password, remark)
        except:
            print('예외발생!')
        finally:
            print('입력작업종료')
        event.Skip()
    
    def OnDelete( self, event ):
        id=self.txt_Id.GetValue()
        try:
            sqliteCRUD.delete(id)
        except:
            print('예외발생!')
        finally:
            print('삭제작업완료')
        event.Skip()
    
    def OnUpdate( self, event ):
        name=self.txt_name.GetValue()
        password=self.txt_password.GetValue()
        remark=self.txt_remark.GetValue()
        id=self.txt_Id.GetValue()
        try:
            sqliteCRUD.update((name,password,remark,id))
        except:
            print('예외발생!')
        finally:
            print('수정작업종료')
        event.Skip()
    
    def OnFind( self, event ):
        key = self.txt_Id.GetValue()
        row = sqliteCRUD.select(key)
        self.txt_Id.SetValue(row[0])
        self.txt_name.SetValue(row[1])
        self.txt_password.SetValue(row[2])
        self.txt_remark.SetValue(row[3])
        event.Skip()
    
    def OnAlldata( self, event ):
        rows= sqliteCRUD.selectAll()
        for row in rows:
            self.resultArea.AppendText("{},{},{},{}\n"
                .format(row[0],row[1],row[2],row[3]))
        event.Skip()
    
#######메인#########################################
if __name__ == '__main__':
    app=wx.App()
    frame = MyFrame1(parent=None)
    frame.Show()
    app.MainLoop()
