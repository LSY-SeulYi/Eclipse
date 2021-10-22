'''
Created on 2021. 7. 27.
>>>>>>>>   파이썬과 wxPython을 이용한 가계부응용시스템  <<<<<<<<<<<< 

이 소스가 메인 프로그램 입니다. 초기 인터페이스 설계는 wxFormBuilder를 
활용하였으나 빌더로 생성된 소스를 가져온 많은 소스추가 및 수정이 이루어
진것입니다.
  
[소스 파일구성]
    4개의 아웃클래스(ChartFrame, BarChartPanel, MyFrame1, MyApp), 
    1개의 이너클래스(MyFrame1안의 MyDialog1),  
    외부모듈 2개(daoes.py, models.py), 
    sqlite3 디비 1개 가 협업함 
    homebook.db ==> 이 디비를 지우고 daoes모듈 HomeBookDAO 클래스의 createTable()
    메소드의 호출로 새로운 디비를 생성시킬 수 있음wxhomebook개수: 4개] 
    models.py는 굳이 사용하지는 않았으나 필요하면 사용할 수도 있음
    (왜냐하면 vo 클래스 대신 vo용 튜플을 사용했기 때문)  

'''
# -*- coding: utf-8 -*- 
import wx
import wx.xrc
import wx.dataview
from wxhomebook.daoes import HomeBookDAO  #자기 상황에 맞게 수정할 필요있음
import numpy as np 
import pandas as pd 
import matplotlib.pyplot as plt 
import sys

###########################################################################
## Class ChartFrame
###########################################################################

class ChartFrame( wx.Frame):
        def __init__(self,parent):
            #wx.Dialog.__init__ ( self, parent, id = wx.ID_ANY, title = "수지챠트", pos = wx.DefaultPosition, size = wx.Size(1024,768 ), style = wx.DEFAULT_DIALOG_STYLE )
            wx.Frame.__init__ ( self, parent, id = wx.ID_ANY, title = '수지챠트', pos = wx.DefaultPosition, size = wx.Size( 858,548 ), style = wx.DEFAULT_FRAME_STYLE|wx.TAB_TRAVERSAL )
            self.SetSizeHints( wx.DefaultSize, wx.DefaultSize )
            self.sbSizer1 = wx.BoxSizer( wx.VERTICAL )
       
        def  guiending(self,panel):   
            self.panel = panel
            #self.bSizer1.Add( panel, 1, wx.EXPAND|wx.LEFT|wx.RIGHT|wx.TOP, 5 )
            self.sbSizer1.Clear(delete_windows=False)
            self.sbSizer1.Add( self.panel, 1, wx.EXPAND |wx.ALL, 5 )
            self.SetSizer( self.sbSizer1 )
            self.Layout()
            self.Centre( wx.BOTH )
                
        def __del__( self ):
            pass
###########################################################################
## Class BarChartPanel
###########################################################################

class BarChartPanel ( wx.Panel ):
     
    def __init__( self, parent ):
        wx.Panel.__init__ ( self, parent, id = wx.ID_ANY, pos = wx.DefaultPosition, size = wx.Size( 500,300 ), style = wx.TAB_TRAVERSAL )
        #self.Bind(wx.EVT_PAINT,self.OnPaint)
    def SetData(self,data):
        self.data = data 
        self.Bind(wx.EVT_PAINT,self.OnPaint)
        # 중요 - 새로이 그린 내용으로 갱신 
        self.Refresh() #중요 
                
    def OnPaint(self,e):
        dc = wx.PaintDC(self)
        brush = wx.Brush("white")
        dc.SetBackground(brush)
        dc.Clear()
        pen = wx.Pen(wx.Colour(0,0,255))
        dc.SetPen(pen)
        #############################
        dc.SetBrush(wx.Brush(wx.Colour(0,0,255)))
        size = len(self.data) 
        cnt = 0
        for x in self.data:
            # 수입은 청색, 지출은 적색 
            if self.data[x]< 0:
                 dc.SetBrush(wx.Brush(wx.Colour(0,0,255)))
            else: 
                dc.SetBrush(wx.Brush(wx.Colour(255,0,0)))
                        
            # (좌측상단x,좌측상단y,사각형의가로,사각형의세로)
            dc.DrawRectangle((10+(cnt*40)),300, 30, int(self.data[x]/10000))
            # 데이터의 값을 글씨로 나타 냄 - (글씨, 좌측상단x, 좌측상단y)
            dc.DrawText(str(abs(self.data[x]/10000)), (10+(cnt*40)), 10)
            dc.DrawText(x, (10+(cnt*40)), 300)
            cnt += 1
        #############################
        pass
    
    def __del__( self ):
        pass  





###########################################################################
## Class MyFrame1
###########################################################################
class MyFrame1 ( wx.Frame ):
    sessionId = ""
    # 이너 클래스 
    class MyDialog1 ( wx.Dialog ):
        
        def __init__( self, parent,title ):

            wx.Dialog.__init__ ( self, parent, id = wx.ID_ANY, title = title, pos = wx.DefaultPosition, size = wx.Size( 519,194 ), style = wx.DEFAULT_DIALOG_STYLE )
            self.SetSizeHints( wx.DefaultSize, wx.DefaultSize )
            bSizer2 = wx.BoxSizer( wx.VERTICAL )
            self.m_staticText2 = wx.StaticText( self, wx.ID_ANY, u"로그인", wx.DefaultPosition, wx.DefaultSize, 0 )
            self.m_staticText2.Wrap( -1 )
            bSizer2.Add( self.m_staticText2, 0, wx.ALIGN_CENTER|wx.ALL, 5 )
            bSizer3 = wx.BoxSizer( wx.HORIZONTAL )
            self.m_button1 = wx.Button( self, wx.ID_ANY, u"아이디", wx.DefaultPosition, wx.DefaultSize, 0 )
            bSizer3.Add( self.m_button1, 0, wx.ALL, 5 )
            self.txtID = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
            bSizer3.Add( self.txtID, 0, wx.ALL, 5 )
            bSizer2.Add( bSizer3, 0, wx.ALIGN_CENTER|wx.EXPAND|wx.SHAPED, 5 )
            bSizer4 = wx.BoxSizer( wx.HORIZONTAL )
            self.m_button2 = wx.Button( self, wx.ID_ANY, u"패스워드", wx.DefaultPosition, wx.DefaultSize, 0 )
            bSizer4.Add( self.m_button2, 0, wx.ALL, 5 )
            
            self.txtPWD = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
            bSizer4.Add( self.txtPWD, 0, wx.ALL, 5 )
            
            
            bSizer2.Add( bSizer4, 1, wx.ALIGN_CENTER, 5 )
            
            self.m_toolBar1 = wx.ToolBar( self, wx.ID_ANY, wx.DefaultPosition, wx.DefaultSize, wx.TB_HORIZONTAL ) 
            self.m_button3 = wx.Button( self.m_toolBar1, wx.ID_ANY, u"로그인", wx.DefaultPosition, wx.DefaultSize, 0 )
            self.m_toolBar1.AddControl( self.m_button3 )
            self.m_button4 = wx.Button( self.m_toolBar1, wx.ID_ANY, u"취소", wx.DefaultPosition, wx.DefaultSize, 0 )
            self.m_toolBar1.AddControl( self.m_button4 )
            self.m_toolBar1.Realize() 
            
            bSizer2.Add( self.m_toolBar1, 0, wx.EXPAND|wx.FIXED_MINSIZE, 5 )
            
            
            self.SetSizer( bSizer2 )
            self.Layout()
            
            self.Centre( wx.BOTH )
            
            # Connect Events
            self.m_button3.Bind( wx.EVT_BUTTON, self.OnLoginConfirm )
            self.m_button4.Bind( wx.EVT_BUTTON, self.OnLoginCancel )
        
        def __del__( self ):
            pass
        
        
        # Virtual event handlers, overide them in your derived class
        def OnLoginConfirm( self, event ):
            MyFrame1.sessionId = self.txtID.GetValue()
            self.Close(force=True)
            event.Skip()
        
        def OnLoginCancel( self, event ):
            sys.exit()
            event.Skip()
    ######################################### > 이너 클래스 종료라인 
    
    
    
       
    
    
    # 아웃 클래스의 생성메소드 
    def __init__( self, parent ):
        
        
        wx.Frame.__init__ ( self, parent, id = wx.ID_ANY, title = '비져니의 가계부 시스템', pos = wx.DefaultPosition, size = wx.Size( 858,548 ), style = wx.DEFAULT_FRAME_STYLE|wx.TAB_TRAVERSAL )
        dlg = self.MyDialog1(self,"LOG IN")
        dlg.ShowModal()
        
        self.SetSizeHints( wx.DefaultSize, wx.DefaultSize )
        self.dao = HomeBookDAO()
        self.m_menubar1 = wx.MenuBar( 0 )
        self.m_menu1 = wx.Menu()
        self.m_menuItem1 = wx.MenuItem( self.m_menu1, wx.ID_ANY, u"Login", wx.EmptyString, wx.ITEM_NORMAL )
        self.m_menu1.Append( self.m_menuItem1 )
        
        self.m_menuItem2 = wx.MenuItem( self.m_menu1, wx.ID_ANY, u"Logout", wx.EmptyString, wx.ITEM_NORMAL )
        self.m_menu1.Append( self.m_menuItem2 )
        
        self.m_menubar1.Append( self.m_menu1, u"Login" ) 
        self.m_menu3 = wx.Menu()
        self.m_menuItem4 = wx.MenuItem( self.m_menu3, wx.ID_ANY, u"수지통계", wx.EmptyString, wx.ITEM_NORMAL )
        self.m_menu3.Append( self.m_menuItem4 )
        
        self.m_menubar1.Append( self.m_menu3, u"Charts" ) 
        
        self.m_menu21 = wx.Menu()
        self.m_menuItem3 = wx.MenuItem( self.m_menu21, wx.ID_ANY, u"This is..", wx.EmptyString, wx.ITEM_NORMAL )
        self.m_menu21.Append( self.m_menuItem3 )
        
        self.m_menubar1.Append( self.m_menu21, u"About" ) 
        
            
        self.SetMenuBar( self.m_menubar1 )
        
        bSizer1 = wx.BoxSizer( wx.VERTICAL )
        
        bSizer2 = wx.BoxSizer( wx.HORIZONTAL )
        
        self.listViewCtrl = wx.dataview.DataViewListCtrl( self, wx.ID_ANY, wx.DefaultPosition, wx.DefaultSize, wx.dataview.DV_HORIZ_RULES|wx.dataview.DV_VERT_RULES|wx.ALWAYS_SHOW_SB|wx.RAISED_BORDER )
        self.listViewCtrl.SetForegroundColour( wx.Colour( 0, 128, 0 ) )
        self.listViewCtrl.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INFOBK ) )
        self.listViewCtrl.SetToolTipString( u"조건에 맞는 가계부 내역 출력" )
        #
        self.colSerialno = self.listViewCtrl.AppendTextColumn( u"Serialno",align=wx.ALIGN_RIGHT )
        self.colDay = self.listViewCtrl.AppendTextColumn(u"Day" )
        self.colSection = self.listViewCtrl.AppendTextColumn( u"Section" ,align=wx.ALIGN_CENTER)
        self.colAccount_title = self.listViewCtrl.AppendTextColumn( u"Acc_title" )
        self.colRemark = self.listViewCtrl.AppendTextColumn( u"Remark" )
        #
        self.colRevenue = self.listViewCtrl.AppendTextColumn( u"Revenue" ,align=wx.ALIGN_RIGHT )
        #
        self.colExpense = self.listViewCtrl.AppendTextColumn( u"Expense" ,align=wx.ALIGN_RIGHT)
        self.colUser_id = self.listViewCtrl.AppendTextColumn( u"User_id" ,align=wx.ALIGN_CENTER)
        
        #
        bSizer2.Add( self.listViewCtrl, 0, wx.ALL|wx.EXPAND|wx.SHAPED, 5 )
        
        
        self.refresh() # 리스트뷰컨트롤에 읽은 데이타 반영하는 루틴 호출 
    
        gbSizer1 = wx.GridBagSizer( 0, 0 )
        gbSizer1.SetFlexibleDirection( wx.BOTH )
        gbSizer1.SetNonFlexibleGrowMode( wx.FLEX_GROWMODE_SPECIFIED )
        
        self.m_button15 = wx.Button( self, wx.ID_ANY, u"serialno", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.m_button15, wx.GBPosition( 0, 0 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        self.txtSerialno = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        self.txtSerialno.Disable()
        gbSizer1.Add( self.txtSerialno, wx.GBPosition( 0, 1 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        self.m_button16 = wx.Button( self, wx.ID_ANY, u"day", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.m_button16, wx.GBPosition( 1, 0 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        self.txtDay = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.txtDay, wx.GBPosition( 1, 1 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        self.m_button17 = wx.Button( self, wx.ID_ANY, u"section", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.m_button17, wx.GBPosition( 2, 0 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        self.txtSection = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.txtSection, wx.GBPosition( 2, 1 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        self.m_button18 = wx.Button( self, wx.ID_ANY, u"ac_title", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.m_button18, wx.GBPosition( 3, 0 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        self.txtAccount_title = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.txtAccount_title, wx.GBPosition( 3, 1 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        self.m_button19 = wx.Button( self, wx.ID_ANY, u"remark", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.m_button19, wx.GBPosition( 4, 0 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        self.txtRemark = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.txtRemark, wx.GBPosition( 4, 1 ), wx.GBSpan( 1, 3 ), wx.ALL|wx.EXPAND, 5 )
        
        comboAccount_titleChoices = []
        self.comboAccount_title = wx.ComboBox( self, wx.ID_ANY, u"Combo!", wx.DefaultPosition, wx.DefaultSize, comboAccount_titleChoices, 0 )
        items = ['월급', '상여금', '잡수입', \
                '피복비', '외식비', '식재료비', '공과금', '자산매입', \
                '소모품비', '차량유지비', '접대비', '모임회비', '기타잡비'
                ];
        self.comboAccount_title.AppendItems(items);

        gbSizer1.Add( self.comboAccount_title, wx.GBPosition( 3, 2 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        

        
        self.m_button20 = wx.Button( self, wx.ID_ANY, u"revenue", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.m_button20, wx.GBPosition( 5, 0 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        self.txtRevenue = wx.TextCtrl( self, wx.ID_ANY, u"0", wx.DefaultPosition, wx.DefaultSize, wx.TE_RIGHT )
        gbSizer1.Add( self.txtRevenue, wx.GBPosition( 5, 1 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        self.m_button21 = wx.Button( self, wx.ID_ANY, u"expense", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.m_button21, wx.GBPosition( 6, 0 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )

        self.txtExpense = wx.TextCtrl( self, wx.ID_ANY, u"0", wx.DefaultPosition, wx.DefaultSize, wx.TE_RIGHT )
        gbSizer1.Add( self.txtExpense, wx.GBPosition( 6, 1 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        self.m_button22 = wx.Button( self, wx.ID_ANY, u"user_id", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.m_button22, wx.GBPosition( 7, 0 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        self.m_button23 = wx.Button( self, wx.ID_ANY, u"clear", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.m_button23, wx.GBPosition( 8, 0 ), wx.GBSpan( 1, 4 ), wx.ALL|wx.EXPAND, 5 )
        
        self.m_radioBtn1 = wx.RadioButton( self, wx.ID_ANY, u"수입", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.m_radioBtn1, wx.GBPosition( 2, 2 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        self.m_radioBtn2 = wx.RadioButton( self, wx.ID_ANY, u"지출", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.m_radioBtn2, wx.GBPosition( 2, 3 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        self.txtUser_id = wx.TextCtrl( self, wx.ID_ANY, u"", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.txtUser_id, wx.GBPosition( 7, 1 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        ############################################
        self.txtUser_id.SetValue(self.sessionId)
        self.txtUser_id.Disable()
        ############################################
        
        self.m_button161 = wx.Button( self, wx.ID_ANY, u"ShowPlot", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.m_button161, wx.GBPosition( 7, 2 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        
        self.txtFindCondition = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, wx.TE_MULTILINE )
        gbSizer1.Add( self.txtFindCondition, wx.GBPosition( 9, 0 ), wx.GBSpan( 1, 4 ), wx.ALL|wx.EXPAND, 5 )
        
        
        
        
        bSizer2.Add( gbSizer1, 1, wx.EXPAND, 5 )
        
        
        bSizer1.Add( bSizer2, 1, wx.EXPAND|wx.LEFT|wx.RIGHT|wx.TOP, 5 )
        
        self.m_toolBar1 = wx.ToolBar( self, wx.ID_ANY, wx.DefaultPosition, wx.Size( -1,-1 ), wx.TB_HORIZONTAL ) 
        self.m_toolBar1.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_ACTIVECAPTION ) )
        
        self.m_button1 = wx.Button( self.m_toolBar1, wx.ID_ANY, u"Insert", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_toolBar1.AddControl( self.m_button1 )
        self.m_button2 = wx.Button( self.m_toolBar1, wx.ID_ANY, u"Delete", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_toolBar1.AddControl( self.m_button2 )
        self.m_button3 = wx.Button( self.m_toolBar1, wx.ID_ANY, u"Update", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_toolBar1.AddControl( self.m_button3 )
        self.m_button4 = wx.Button( self.m_toolBar1, wx.ID_ANY, u"Find", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_toolBar1.AddControl( self.m_button4 )
        self.m_button5 = wx.Button( self.m_toolBar1, wx.ID_ANY, u"SelectAll", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_toolBar1.AddControl( self.m_button5 )
        self.m_button6 = wx.Button( self.m_toolBar1, wx.ID_ANY, u"TermList", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_toolBar1.AddControl( self.m_button6 )
        self.txtStartday = wx.TextCtrl( self.m_toolBar1, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_toolBar1.AddControl( self.txtStartday )
        self.m_staticText1 = wx.StaticText( self.m_toolBar1, wx.ID_ANY, u"~", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText1.Wrap( -1 )
        self.m_toolBar1.AddControl( self.m_staticText1 )
        self.txtEndday = wx.TextCtrl( self.m_toolBar1, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_toolBar1.AddControl( self.txtEndday )
        self.m_toolBar1.Realize() 
        
        bSizer1.Add( self.m_toolBar1, 0, wx.ALL|wx.EXPAND, 5 )
        
        self.txtHistory = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, wx.HSCROLL|wx.TE_MULTILINE )
        self.txtHistory.SetMinSize( wx.Size( -1,100 ) )
        
        bSizer1.Add( self.txtHistory, 0, wx.ALL|wx.EXPAND, 5 )
        
        
        self.SetSizer( bSizer1 )
        self.Layout()
        
        self.Centre( wx.BOTH )
        
        # Connect Events
        self.Bind( wx.EVT_MENU, self.OnLogin, id = self.m_menuItem1.GetId() )
        self.Bind( wx.EVT_MENU, self.OnLogout, id = self.m_menuItem2.GetId() )
        self.Bind( wx.EVT_MENU, self.OnAbout, id = self.m_menuItem3.GetId() )
        self.Bind( wx.dataview.EVT_DATAVIEW_SELECTION_CHANGED, self.dispInfor, id = wx.ID_ANY )
        self.txtSection.Bind( wx.EVT_TEXT, self.OnSectionText )
        self.comboAccount_title.Bind( wx.EVT_COMBOBOX, self.OnCombo )
        #self.comboAccount_title.Bind( wx.EVT_TEXT, self.OnCombo_OnText )
        #self.comboAccount_title.Bind( wx.EVT_TEXT_ENTER, self.OnCombo_OnTextEnter )
        self.m_button23.Bind( wx.EVT_LEFT_DOWN, self.OnClear )
        self.m_button1.Bind( wx.EVT_LEFT_DOWN, self.OnInsert )
        self.m_button2.Bind( wx.EVT_LEFT_DOWN, self.OnDelete )
        self.m_button3.Bind( wx.EVT_LEFT_DOWN, self.OnUpdate )
        self.m_button4.Bind( wx.EVT_LEFT_DOWN, self.OnFind )
        self.m_button5.Bind( wx.EVT_LEFT_DOWN, self.OnSelectAll )
        self.m_button6.Bind( wx.EVT_LEFT_DOWN, self.OnTermList )
        self.m_radioBtn1.Bind( wx.EVT_LEFT_DOWN, self.OnRadio )
        self.m_radioBtn2.Bind( wx.EVT_LEFT_DOWN, self.OnRadio )
        self.m_button161.Bind( wx.EVT_BUTTON, self.OnShowPlot )
        self.Bind( wx.EVT_MENU, self.OnChart, id = self.m_menuItem4.GetId() )
    
    def __del__( self ):
        pass
    
    
    # Virtual event handlers, overide them in your derived class
    def OnLogin( self, event ):
        dlg = self.MyDialog1(self,"LOG IN")
        dlg.ShowModal()
        self.refresh()
        self.txtHistory.AppendText(self.sessionId+"님이 로그인하셨습니다.\n")
        event.Skip()
    
    def OnLogout( self, event ):
        #########################################################################################
        # 시스템을 종료하지 않을려면 아래 3줄을 고려할 수 있다.
        #self.listViewCtrl.DeleteAllItems()
        #self.sessionId = ""
        #self.OnClear(event)
        sys.exit(0) # 시스템 종료 
        event.Skip()
    
    def OnAbout( self, event ):
        self.txtHistory.AppendText("비져니들의 가계부 1.0 버젼 입니다.\n")
        event.Skip()
    
    def OnCombo( self, event ):
        self.txtAccount_title.SetValue(self.comboAccount_title.GetValue())
        
        event.Skip()
    
    def OnCombo_OnText( self, event ):
        event.Skip()
    
    def OnCombo_OnTextEnter( self, event ):
        event.Skip()
    
    def OnClear( self, event ):
        self.txtSerialno.SetValue("")
        self.txtDay.SetValue("") 
        self.m_radioBtn1.SetValue(False)
        self.m_radioBtn2.SetValue(False)
        self.txtSection.SetValue("")
        self.txtAccount_title.SetValue("")
        self.comboAccount_title.SetValue("")
        self.txtRemark.SetValue("");
        self.txtRevenue.SetValue(str(0));
        self.txtExpense.SetValue(str(0));
        self.txtUser_id.SetValue(self.sessionId);
        event.Skip()

    
    def OnInsert( self, event ):
        vo = (#self.txtSerialno.GetValue(),
              self.txtDay.GetValue(),
              self.txtSection.GetValue(),
              self.txtAccount_title.GetValue(),
              self.txtRemark.GetValue(),
              self.txtRevenue.GetValue(),
              self.txtExpense.GetValue(),
              self.txtUser_id.GetValue()
              )
        ok = self.dao.insert(vo)
        if ok==True:
            msg =  "자료입력: Ok"
            self.refresh()
        else: 
            msg =  "자료입력: Fail" 
        self.txtHistory.AppendText(msg+"\n")
        
        event.Skip()
    
    def OnDelete( self, event ):
        self.listViewCtrl.SetFocus();
        selNum = self.listViewCtrl.SelectedRow
        serialNo = int(self.listViewCtrl.GetValue(selNum, 0))
        ok = self.dao.delete(serialNo)
        if ok==True:
            msg =  "자료삭제: Ok" +str(serialNo)
            self.refresh()
        else: 
            msg =  "자료삭제: Fail" +str(serialNo)
        self.txtHistory.AppendText(msg+"\n")
        event.Skip()
    
    def OnUpdate( self, event ):
        vo = (
              self.txtDay.GetValue(),
              self.txtSection.GetValue(),
              self.txtAccount_title.GetValue(),
              self.txtRemark.GetValue(),
              self.txtRevenue.GetValue(),
              self.txtExpense.GetValue(),
              self.txtUser_id.GetValue(),
              self.txtSerialno.GetValue()
              )
        ok = self.dao.update(vo)
        if ok==True:
            msg =  "자료수정: Ok" 
            self.refresh()
        else: 
            msg =  "자료수정: Fail" 
        self.txtHistory.AppendText(msg+"\n")
        event.Skip()
    
    def OnFind( self, event ):
                
        condition = self.txtFindCondition.GetValue() 
        if condition == '':
            rows = self.dao.select(condition="WHERE USER_ID = '"+self.sessionId+"' ")
        else: 
            rows = self.dao.select(condition="WHERE  USER_ID='%s' and "%self.sessionId + self.txtFindCondition.GetValue())
            
        self.listViewCtrl.DeleteAllItems()
        
        for row in rows:
            rowl = []
            for x in row:
                rowl.append(x)
                    
            rowl[0] = str(rowl[0])
            rowl[5] = str(rowl[5])
            rowl[6] = str(rowl[6])
            print(rowl)
            self.listViewCtrl.AppendItem(rowl)
                
        self.txtHistory.AppendText("조건 색인 완료\n")
        event.Skip()
    
    def OnSelectAll( self, event ):
        user =  self.sessionId
        rows = self.dao.select(condition="WHERE USER_ID = '"+user+"' ")
        self.listViewCtrl.DeleteAllItems()
        
        for row in rows:
            rowl = []
            for x in row:
                rowl.append(x)
                    
            rowl[0] = str(rowl[0])
            rowl[5] = str(rowl[5])
            rowl[6] = str(rowl[6])
            print(rowl)
            self.listViewCtrl.AppendItem(rowl)
                
        self.txtHistory.AppendText(user+"님 모든 자료 출력\n")
        event.Skip()
    
        event.Skip()
    
    def OnTermList( self, event ):
        ######################## 질의 구성
        # ex) SELECT * FROM HOMEBOOK WHERE USER_ID='sjw' and DAY BETWEEN '2021-1-1' and '2021-7-31'
        ########################
        u = self.sessionId
        a = self.txtStartday.GetValue() 
        b = self.txtEndday.GetValue()
        if a=='' or b=='':
            self.txtHistory.AppendText("기간 입력이 되어있지 않음!\n")
            return
                
        
        rows = self.dao.select(condition="WHERE USER_ID='%s' and DAY BETWEEN '%s' AND '%s' "%(u,a,b))
        self.listViewCtrl.DeleteAllItems()
        
        for row in rows:
            rowl = []
            for x in row:
                rowl.append(x)
                    
            rowl[0] = str(rowl[0])
            rowl[5] = str(rowl[5])
            rowl[6] = str(rowl[6])
            print(rowl)
            self.listViewCtrl.AppendItem(rowl)
                
        self.txtHistory.AppendText("기간검색 완료\n")
        event.Skip()
    
    def OnRadio( self, event ):
        if(self.m_radioBtn1.GetValue()==True):
            self.txtSection.SetValue("지출")
        else: 
            self.txtSection.SetValue("수입")
        event.Skip()
                
    def OnSectionText( self, event ):
        if self.txtSection.GetValue()=="수입" :
            self.txtExpense.Disable()
            self.txtRevenue.Enable(enable=True)
        else: 
            self.txtRevenue.Disable()
            self.txtExpense.Enable(enable=True)
        event.Skip()
    
    
    def OnShowPlot( self, event ):
        # 출력되는 화면과 본 가계부 시트템 데이터 간의 연계는 없음 
        # 다만, 응용프로그램에서 plot화면 사용예를 보인것임 
        fig = plt.figure()
        ax = fig.add_subplot(projection='3d')
        X = np.arange(-5, 5, 0.15)
        Y = np.arange(-5, 5, 0.15)
        X, Y = np.meshgrid(X, Y)
        R = np.sqrt(X**2 + Y**2)
        Z = np.sin(R)
        ax.plot_surface(X, Y, Z, rstride=1, cstride=1, cmap='viridis')

        plt.show()
        
        event.Skip()
    
    
    
    
    
    
    def dispInfor(self, event):
        # listviewCtrl에서 한 라인을 선택했을 때 해당라인 정보를 입력 영역에 표시해주는 기능 
        self.listViewCtrl.SetFocus();
        selNum = self.listViewCtrl.SelectedRow
        serialNo = self.listViewCtrl.GetValue(selNum, 0);
        self.txtSerialno.SetValue(serialNo)
        
        xday = self.listViewCtrl.GetValue(selNum, 1);
        self.txtDay.SetValue(xday) 
        section = self.listViewCtrl.GetValue(selNum, 2);
        self.m_radioBtn1.SetValue(False)
        self.m_radioBtn2.SetValue(False)
        self.txtSection.SetValue(section)
        
        accountTitle =self.listViewCtrl.GetValue(selNum, 3)
        self.txtAccount_title.SetValue(accountTitle)
        self.comboAccount_title.SetValue("")
       
        remark = self.listViewCtrl.GetValue(selNum, 4)
        self.txtRemark.SetValue(remark);
        
        revenue = self.listViewCtrl.GetValue(selNum, 5)
        self.txtRevenue.SetValue(str(revenue));
        
        expense = self.listViewCtrl.GetValue(selNum, 6)
        self.txtExpense.SetValue(str(expense));
        
        user_id = self.listViewCtrl.GetValue(selNum, 7)
        self.txtUser_id.SetValue(user_id);

        event.Skip()
   
    def refresh(self):
        # 디비에 반영된 데이타를 다시 읽어 리스트뷰컨트롤에 갱신 시킴 
        self.listViewCtrl.DeleteAllItems()
        rows = self.dao.select(condition="WHERE USER_ID = '"+self.sessionId+"' ")
        self.rows = rows
        for row in rows:
            rowl = []
            for x in row:
                rowl.append(x)
                    
            rowl[0] = str(rowl[0])
            rowl[5] = str(rowl[5])
            rowl[6] = str(rowl[6])
            print(rowl)
            self.listViewCtrl.AppendItem(rowl)
    
 
    
    def OnChart( self, event ):
        self.chartframe = ChartFrame(self) # 새로운 프레임을 먼저 만듦 : 계정 집계 챠트를 그릴 프레임
        panel = BarChartPanel(self.chartframe) # 위의 프레임 소속 패널을 만들고
        
        rows = self.rows # 디비정보를 화면에 뿌려준 결과 
        accList  = [] # 사용된 계정과목리스트
        for row in rows:
            accList.append(row[3]) #계정과목리스트에 추가
        accSet = set(accList) #계정과목리스트를 계정과목 집합으로 바꿈(중복배제)
        sums = {} #계정과목별 집계를 저장할 딕셔너리 선언
        for x in accSet: #계정과목별 집계 초기화 작업 
            sums[x] = 0 
        for row in rows: # 계정과목별 집계작업
            #print(row[3],sums(row[5]),sums(row[6])) 
            if row[2] == '수입':
                sums[row[3]] = sums[row[3]] - int(row[5]) - int(row[6])
            else:
                sums[row[3]] = sums[row[3]] + int(row[5]) + int(row[6])
        print(sums)        
        
        # 패널에 챠트를 그릴 데이타를 적절하게 세팅 
        panel.SetData(sums)
        
        panel.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INACTIVECAPTION ) )
        #먼저만든 프레임에 완성된 패널을 붙여 넣었다.(순서가 중요) 
        self.chartframe.guiending(panel)
        self.refresh()
        self.chartframe.Show() 
        self.txtHistory.AppendText(self.sessionId+"님의 수지챠트를 조회했습니다.\n")
        event.Skip()
    



#########################  프로그램실행시 main 부분에서 하는일을 MyApp class와 main() 함수로 분할 시켜 본 것임 
class MyApp(wx.App):
    def OnInit(self):
        frame = MyFrame1(None)
        frame.Show(True)
        self.SetTopWindow(frame)
        return True
               
def main():
    app = MyApp(0)
    app.MainLoop()

if __name__ == "__main__": 
    main()
##############################################################################################################    
    