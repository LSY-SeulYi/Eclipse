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
from sqliteStudent import student

class MyFrame1 ( wx.Frame ):
    
    def __init__( self, parent ):
        wx.Frame.__init__ ( self, parent, id = wx.ID_ANY, title = u"학생관리시스템", pos = wx.DefaultPosition, size = wx.Size( 510,332 ), style = wx.DEFAULT_FRAME_STYLE|wx.TAB_TRAVERSAL )
        self.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_ACTIVECAPTION ) )
        
        self.SetSizeHintsSz( wx.DefaultSize, wx.DefaultSize )
        
        bSizer1 = wx.BoxSizer( wx.VERTICAL )

        bSizer2 = wx.BoxSizer( wx.HORIZONTAL )
        
        self.m_staticText1 = wx.StaticText( self, wx.ID_ANY, u"학생ID   ", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText1.SetBackgroundColour(wx.Colour(204,255,255))
        self.m_staticText1.Wrap( -1 )
        bSizer2.Add( self.m_staticText1, 0, wx.ALL, 5 )
        
        self.txt_id = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.Size( 180,-1 ), wx.NO_BORDER )
        bSizer2.Add( self.txt_id, 0, wx.ALL, 5 )
        
        self.m_staticText2 = wx.StaticText( self, wx.ID_ANY, u"학생이름", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText2.SetBackgroundColour(wx.Colour(204,255,255))
        self.m_staticText2.Wrap( -1 )
        bSizer2.Add( self.m_staticText2, 0, wx.ALL, 5 )
        
        self.txt_name = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.Size( 180,-1 ), wx.NO_BORDER )
        bSizer2.Add( self.txt_name, 0, wx.ALL, 5 )
        
        
        bSizer1.Add( bSizer2, 1, wx.EXPAND, 5 )
        
        bSizer3 = wx.BoxSizer( wx.HORIZONTAL )
        
        self.m_staticText3 = wx.StaticText( self, wx.ID_ANY, u"생년월일", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText3.SetBackgroundColour(wx.Colour(204,255,255))
        self.m_staticText3.Wrap( -1 )
        bSizer3.Add( self.m_staticText3, 0, wx.ALL, 5 )
        
        self.txt_birth = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.Size( 180,-1 ), wx.NO_BORDER )
        bSizer3.Add( self.txt_birth, 0, wx.ALL, 5 )
        
        self.m_staticText4 = wx.StaticText( self, wx.ID_ANY, u"전화번호", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText4.SetBackgroundColour(wx.Colour(204,255,255))
        self.m_staticText4.Wrap( -1 )
        bSizer3.Add( self.m_staticText4, 0, wx.ALL, 5 )
        
        self.txt_phone = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.Size( 180,-1 ), wx.NO_BORDER )
        bSizer3.Add( self.txt_phone, 0, wx.ALL, 5 )
        
        
        bSizer1.Add( bSizer3, 1, wx.EXPAND, 5 )
        
        bSizer4 = wx.BoxSizer( wx.HORIZONTAL )
        
        self.btn_insert = wx.Button( self, wx.ID_ANY, u"INSERT", wx.DefaultPosition, wx.DefaultSize, wx.NO_BORDER )
        bSizer4.Add( self.btn_insert, 0, wx.ALL, 5 )
        
        self.btn_update = wx.Button( self, wx.ID_ANY, u"UPDATE", wx.DefaultPosition, wx.DefaultSize, wx.NO_BORDER )
        bSizer4.Add( self.btn_update, 0, wx.ALL, 5 )
        
        self.btn_find = wx.Button( self, wx.ID_ANY, u"FIND", wx.DefaultPosition, wx.DefaultSize, wx.NO_BORDER )
        bSizer4.Add( self.btn_find, 0, wx.ALL, 5 )
        
        self.btn_delete = wx.Button( self, wx.ID_ANY, u"DELETE", wx.DefaultPosition, wx.DefaultSize, wx.NO_BORDER )
        bSizer4.Add( self.btn_delete, 0, wx.ALL, 5 )
        
        self.btn_alldata = wx.Button( self, wx.ID_ANY, u"ALLDATA", wx.DefaultPosition, wx.DefaultSize, wx.NO_BORDER )
        bSizer4.Add( self.btn_alldata, 0, wx.ALL, 5 )
        
        self.btn_clear = wx.Button( self, wx.ID_ANY, u"CLEAR", wx.DefaultPosition, wx.DefaultSize, wx.NO_BORDER )
        bSizer4.Add( self.btn_clear, 0, wx.ALL, 5 )
        
        
        bSizer1.Add( bSizer4, 1, wx.EXPAND, 5 )
        
        bSizer5 = wx.BoxSizer( wx.VERTICAL )
        
        self.txt_Area = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.Size( 500,200 ), wx.HSCROLL|wx.TE_MULTILINE )
        bSizer5.Add( self.txt_Area, 0, wx.ALL, 5 )
        
        
        bSizer1.Add( bSizer5, 1, wx.EXPAND, 5 )
        
        
        self.SetSizer( bSizer1 )
        self.Layout()
        
        self.Centre( wx.BOTH )
        
        # Connect Events
        self.btn_insert.Bind( wx.EVT_BUTTON, self.OnInsert )
        self.btn_insert.SetBackgroundColour(wx.Colour(255,255,204))
        self.btn_update.Bind( wx.EVT_BUTTON, self.OnUpdate )
        self.btn_update.SetBackgroundColour(wx.Colour(255,255,204))
        self.btn_find.Bind( wx.EVT_BUTTON, self.OnFind )
        self.btn_find.SetBackgroundColour(wx.Colour(255,255,204))
        self.btn_delete.Bind( wx.EVT_BUTTON, self.OnDelete )
        self.btn_delete.SetBackgroundColour(wx.Colour(255,255,204))
        self.btn_alldata.Bind( wx.EVT_BUTTON, self.OnAlldata )
        self.btn_alldata.SetBackgroundColour(wx.Colour(255,255,204))
        self.btn_clear.Bind( wx.EVT_BUTTON, self.OnClear )
        self.btn_clear.SetBackgroundColour(wx.Colour(255,255,204))
    
    def __del__( self ):
        pass
    
    
    # Virtual event handlers, overide them in your derived class
    def OnInsert( self, event ):
        id=self.txt_id.GetValue()
        name=self.txt_name.GetValue()
        birthday=self.txt_birth.GetValue()
        phone=self.txt_phone.GetValue()
        try:
            student.insertData(id, name, birthday, phone)
        except:
            print('예외발생!')
        finally:
            print('입력작업종료')
        event.Skip()
    
    def OnUpdate( self, event ):
        name=self.txt_name.GetValue()
        birthday=self.txt_birth.GetValue()
        phone=self.txt_phone.GetValue()
        id=self.txt_id.GetValue()
        try:
            student.update((name,birthday,phone,id))
        except:
            print('예외발생!')
        finally:
            print('수정작업종료')
        event.Skip()
    
    def OnFind( self, event ):
        key = self.txt_id.GetValue()
        row = student.select(key)
        self.txt_id.SetValue(row[0])
        self.txt_name.SetValue(row[1])
        self.txt_birth.SetValue(row[2])
        self.txt_phone.SetValue(row[3])
        event.Skip()
    
    def OnDelete( self, event ):
        id=self.txt_id.GetValue()
        try:
            student.delete(id)
        except:
            print('예외발생!')
        finally:
            print('삭제작업완료')
        event.Skip()
    
    def OnAlldata( self, event ):
        rows= student.selectAll()
        for row in rows:
            self.txt_Area.AppendText("{},{},{},{}\n"
                .format(row[0],row[1],row[2],row[3]))
        event.Skip()
    
    def OnClear( self, event ):
        self.txt_id.SetValue('')
        self.txt_name.SetValue('')
        self.txt_birth.SetValue('')
        self.txt_phone.SetValue('')
        self.txt_Area.SetValue('')
        event.Skip()

#######메인#########################################
if __name__ == '__main__':
    app=wx.App()
    frame = MyFrame1(parent=None)
    frame.Show()
    app.MainLoop()
