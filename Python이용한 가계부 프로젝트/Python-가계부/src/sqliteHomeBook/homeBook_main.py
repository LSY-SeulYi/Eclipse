# -*- coding: utf-8 -*- 

###########################################################################
## Python code generated with wxFormBuilder (version Jun 17 2015)
## http://www.wxformbuilder.org/
##
## PLEASE DO "NOT" EDIT THIS FILE!
###########################################################################

import sqlite3

import wx
import wx.xrc

import matplotlib.pyplot as plt
from sqliteHomeBook import homeBook
from sqliteHomeBook.barchart import PieChartPanel


###########################################################################
## Class MyFrame1
###########################################################################
class MyFrame1 ( wx.Frame ):
    
    def __init__( self, parent ):
        wx.Frame.__init__ ( self, parent, id = wx.ID_ANY, title = wx.EmptyString, pos = wx.DefaultPosition, size = wx.Size( 800,880 ), style = wx.DEFAULT_FRAME_STYLE|wx.TAB_TRAVERSAL )

        self.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INFOBK ) )
        
        gbSizer1 = wx.GridBagSizer( 0, 0 )
        gbSizer1.SetFlexibleDirection( wx.BOTH )
        gbSizer1.SetNonFlexibleGrowMode( wx.FLEX_GROWMODE_SPECIFIED )
        
        self.m_panel8 = wx.Panel( self, wx.ID_ANY, wx.DefaultPosition, wx.DefaultSize, wx.TAB_TRAVERSAL )
        bSizer8 = wx.BoxSizer( wx.HORIZONTAL )
        
        self.btninsert = wx.Button( self.m_panel8, wx.ID_ANY, u"Insert", wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer8.Add( self.btninsert, 0, wx.ALL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.btnupdate = wx.Button( self.m_panel8, wx.ID_ANY, u"Update", wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer8.Add( self.btnupdate, 0, wx.ALL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.btndelete = wx.Button( self.m_panel8, wx.ID_ANY, u"Delete", wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer8.Add( self.btndelete, 0, wx.ALL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.btndateselect = wx.Button( self.m_panel8, wx.ID_ANY, u"Date Of Select", wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer8.Add( self.btndateselect, 0, wx.ALL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.btnselectall = wx.Button( self.m_panel8, wx.ID_ANY, u"SelectAll", wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer8.Add( self.btnselectall, 0, wx.ALL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.btnclear = wx.Button( self.m_panel8, wx.ID_ANY, u"Clear", wx.DefaultPosition, wx.DefaultSize, 0 )
        bSizer8.Add( self.btnclear, 0, wx.ALL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        
        self.m_panel8.SetSizer( bSizer8 )
        self.m_panel8.Layout()
        bSizer8.Fit( self.m_panel8 )
        gbSizer1.Add( self.m_panel8, wx.GBPosition( 5, 0 ), wx.GBSpan( 1, 8 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.m_staticText2 = wx.StaticText( self, wx.ID_ANY, u"No.", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText2.Wrap( -1 )
        gbSizer1.Add( self.m_staticText2, wx.GBPosition( 0, 0 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.txtNo = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, wx.TE_READONLY )
        gbSizer1.Add( self.txtNo, wx.GBPosition( 0, 1 ), wx.GBSpan( 1, 2 ), wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL|wx.ALL, 5 )
        
        self.m_staticText1 = wx.StaticText( self, wx.ID_ANY, u"일자", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText1.Wrap( -1 )
        gbSizer1.Add( self.m_staticText1, wx.GBPosition( 0, 3 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_VERTICAL|wx.ALIGN_RIGHT, 5 )
        
        self.m_staticText3 = wx.StaticText( self, wx.ID_ANY, u"계정과목", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText3.Wrap( -1 )
        gbSizer1.Add( self.m_staticText3, wx.GBPosition( 1, 0 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.txtdate = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.txtdate, wx.GBPosition( 0, 4 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.m_staticText13 = wx.StaticText( self, wx.ID_ANY, u"기간", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText13.Wrap( -1 )
        gbSizer1.Add( self.m_staticText13, wx.GBPosition( 1, 3 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_RIGHT|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.txtdatestart = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.txtdatestart, wx.GBPosition( 1, 4 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.m_staticText12 = wx.StaticText( self, wx.ID_ANY, u"~", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText12.Wrap( -1 )
        gbSizer1.Add( self.m_staticText12, wx.GBPosition( 1, 5 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.txtdateend = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.txtdateend, wx.GBPosition( 1, 6 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        combotitleChoices = ['급여','기타수입','주식비','간식비','외식비','보험료','기타지출']
        self.combotitle = wx.ComboBox( self, wx.ID_ANY, u"계정과목", wx.DefaultPosition, wx.DefaultSize, combotitleChoices, 0 )
        gbSizer1.Add( self.combotitle, wx.GBPosition( 1, 1 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.m_staticText4 = wx.StaticText( self, wx.ID_ANY, u"수지구분", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText4.Wrap( -1 )
        gbSizer1.Add( self.m_staticText4, wx.GBPosition( 2, 0 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_BOTTOM, 5 )
        
        self.radioRevenue = wx.RadioButton( self, wx.ID_ANY, u"수입", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.radioRevenue, wx.GBPosition( 2, 1 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_BOTTOM, 5 )
        
        self.radioExpense = wx.RadioButton( self, wx.ID_ANY, u"지출", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.radioExpense, wx.GBPosition( 2, 3 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_BOTTOM, 5 )
        
        self.m_staticText7 = wx.StaticText( self, wx.ID_ANY, u"적요", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText7.Wrap( -1 )
        gbSizer1.Add( self.m_staticText7, wx.GBPosition( 4, 0 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.txtRemark = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.Size( 500,-1 ), 0 )
        gbSizer1.Add( self.txtRemark, wx.GBPosition( 4, 1 ), wx.GBSpan( 1, 7 ), wx.ALL|wx.EXPAND|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.m_staticText5 = wx.StaticText( self, wx.ID_ANY, u"수입금액", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText5.Wrap( -1 )
        gbSizer1.Add( self.m_staticText5, wx.GBPosition( 3, 0 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.txtRe = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.txtRe, wx.GBPosition( 3, 1 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.m_staticText6 = wx.StaticText( self, wx.ID_ANY, u"지출금액", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText6.Wrap( -1 )
        gbSizer1.Add( self.m_staticText6, wx.GBPosition( 3, 3 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.txtEx = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.txtEx, wx.GBPosition( 3, 4 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.list = wx.ListCtrl( self, wx.ID_ANY, wx.DefaultPosition, wx.Size( 740,200 ), wx.LC_REPORT|wx.BORDER_SUNKEN )
        
        self.list.InsertColumn(0, 'No', wx.Layout_RightToLeft, width=50)
        self.list.InsertColumn(1, '일자', wx.Layout_RightToLeft, width=100)
        self.list.InsertColumn(2, '수입/지출', wx.Layout_RightToLeft)
        self.list.InsertColumn(3, '계정과목', wx.Layout_RightToLeft)
        self.list.InsertColumn(4, '수입금액', wx.Layout_LeftToRight)
        self.list.InsertColumn(5, '지출금액', wx.Layout_LeftToRight)
        self.list.InsertColumn(6, '적요', wx.Layout_RightToLeft, width=350)

        gbSizer1.Add( self.list, wx.GBPosition( 6, 0 ), wx.GBSpan( 14, 8 ), wx.ALL|wx.EXPAND, 5 )
        
        gbSizer2 = wx.GridBagSizer( 0, 0 )
        gbSizer2.SetFlexibleDirection( wx.BOTH )
        gbSizer2.SetNonFlexibleGrowMode( wx.FLEX_GROWMODE_SPECIFIED )
        
        self.m_staticText10 = wx.StaticText( self, wx.ID_ANY, u"PieChart", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText10.Wrap( -1 )
        gbSizer2.Add( self.m_staticText10, wx.GBPosition( 0, 0 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.btnchart = wx.Button( self, wx.ID_ANY, u"총 수입/지출 그래프", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer2.Add( self.btnchart, wx.GBPosition( 0, 1 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.EXPAND, 5 )
        
        self.btnchart1 = wx.Button( self, wx.ID_ANY, u"기간별 계정과목 그래프", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer2.Add( self.btnchart1, wx.GBPosition( 0, 3 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.EXPAND, 5 )
        
        self.chartPanel = PieChartPanel(self)
        self.chartPanel.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INFOBK ) )
        
        gbSizer2.Add( self.chartPanel, wx.GBPosition( 1, 0 ), wx.GBSpan( 15, 40 ), wx.ALL|wx.EXPAND, 5 )
        
        self.m_staticText131 = wx.StaticText( self, wx.ID_ANY, u"수입 총액 : ", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText131.Wrap( -1 )
        gbSizer2.Add( self.m_staticText131, wx.GBPosition( 16, 0 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.txtReveSum = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, wx.TE_READONLY )
        gbSizer2.Add( self.txtReveSum, wx.GBPosition( 16, 1 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        self.m_staticText141 = wx.StaticText( self, wx.ID_ANY, u"지출 총액 : ", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText141.Wrap( -1 )
        gbSizer2.Add( self.m_staticText141, wx.GBPosition( 16, 2 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.txtExtenSum = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, wx.TE_READONLY )
        gbSizer2.Add( self.txtExtenSum, wx.GBPosition( 16, 3 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        gbSizer1.Add( gbSizer2, wx.GBPosition( 20, 0 ), wx.GBSpan( 1, 8 ), wx.ALIGN_RIGHT|wx.EXPAND, 5 )
        
        
        self.SetSizer( gbSizer1 )
        self.Layout()
        
        self.Centre( wx.BOTH )
        
        # Connect Events
        self.btninsert.Bind( wx.EVT_BUTTON, self.btnInsert )
        self.btnupdate.Bind( wx.EVT_BUTTON, self.btnUpdate )
        self.btndelete.Bind( wx.EVT_BUTTON, self.btnDelete )
        self.btndateselect.Bind( wx.EVT_BUTTON, self.btnSelect )
        self.btnselectall.Bind( wx.EVT_BUTTON, self.btnSelecAll )
        self.btnclear.Bind( wx.EVT_BUTTON, self.btnClear )
        self.btnchart.Bind( wx.EVT_BUTTON, self.btnChart )
        self.btnchart1.Bind( wx.EVT_BUTTON, self.btnChart1 )
        self.list.Bind( wx.EVT_LIST_ITEM_SELECTED, self.handle )

    
    def __del__( self ):
        pass
    
    
    # Virtual event handlers, overide them in your derived class
    def btnInsert( self, event ):
        date=self.txtdate.GetValue()
        if(self.radioRevenue.GetValue()):
            section = '수입'
        elif(self.radioExpense.GetValue()):
            section = '지출'
        accounttitle=self.combotitle.GetValue()
        remark=self.txtRemark.GetValue()
        revenue=self.txtRe.GetValue()
        expense=self.txtEx.GetValue()
        try:
            homeBook.insertData(date,section,accounttitle,revenue,expense,remark)
        except:
            print('예외발생!')
        finally:
            print('입력작업종료')
        event.Skip()
    
    def btnUpdate( self, event ):
        date=self.txtdate.GetValue()
        if(self.radioRevenue.GetValue()):
            section = '수입'
        elif(self.radioExpense.GetValue()):
            section = '지출'
        accounttitle=self.combotitle.GetValue()
        remark=self.txtRemark.GetValue()
        revenue=self.txtRe.GetValue()
        expense=self.txtEx.GetValue()
        id = self.txtNo.GetValue()
        try:
            homeBook.update((date,section,accounttitle,revenue,expense,remark,id))
        except:
            print('예외발생!')
        finally:
            print('수정작업종료')
        event.Skip()
    
    def btnDelete( self, event ):
        id = self.txtNo.GetValue()
        try:
            homeBook.delete(id)
        except:
            print('예외발생!')
        finally:
            print('삭제작업완료')
        event.Skip()
    
    def btnSelect( self, event ):
        conn = sqlite3.connect("test.db")
        cur = conn.cursor()
        sql = "SELECT * FROM HOMEBOOK WHERE DATE BETWEEN ? AND ?"
        try:
            firstDate = str(self.txtdatestart.GetValue())
            secondDate = str(self.txtdateend.GetValue())
            cur.execute(sql, (firstDate, secondDate))
            rows = cur.fetchall()
            x = 0
            수입금액=0
            지출금액=0
            self.list.DeleteAllItems()
            for row in rows:
                self.list.InsertItem(x, str(row[0]))
                self.list.SetItem(x, 1, row[1])
                self.list.SetItem(x, 2, row[2])
                self.list.SetItem(x, 3, row[3])
                self.list.SetItem(x, 4, str(row[4]))
                self.list.SetItem(x, 5, str(row[5]))
                self.list.SetItem(x, 6, row[6])
                수입금액 += row[4]
                지출금액 += row[5]
                x += 1
            self.txtReveSum.SetLabel(str(수입금액))
            self.txtExtenSum.SetLabel(str(지출금액))
            
        except Exception as e:
            print(e)
            wx.MessageBox("찾는 자료가 없습니다.", "Message" , wx.OK | wx.ICON_INFORMATION)  
        finally: 
            cur.close()
            conn.close() 
        event.Skip()
    
    def btnSelecAll( self, event ):
        self.list.DeleteAllItems()
        rows = homeBook.selectAll()
        x=0
        수입금액=0
        지출금액=0
        for row in rows:
            self.list.InsertItem(x, str(row[0]))
            self.list.SetItem(x, 1, row[1])
            self.list.SetItem(x, 2, row[2])
            self.list.SetItem(x, 3, row[3])
            self.list.SetItem(x, 4, str(row[4]))
            self.list.SetItem(x, 5, str(row[5]))
            self.list.SetItem(x, 6, row[6])
            x += 1
            수입금액 += row[4]
            지출금액 += row[5]
        self.txtReveSum.SetLabel(str(수입금액))
        self.txtExtenSum.SetLabel(str(지출금액))
        event.Skip()
    
    def btnClear( self, event ):
        self.txtNo.Clear()
        self.txtdate.Clear()
        self.txtRemark.Clear()
        self.txtRe.Clear()
        self.txtEx.Clear()
        self.radioExpense.SetValue(int(0))
        self.radioRevenue.SetValue(int(0))
        self.combotitle.SetValue('계정과목')
        self.list.DeleteAllItems()
        self.txtdatestart.Clear()
        self.txtdateend.Clear()
        self.txtReveSum.Clear()
        self.txtExtenSum.Clear()
        self.chartPanel.ClearBackground()
        event.Skip()
    
    def btnChart( self, event ):
        self.btnSelecAll(event)
        rows = homeBook.selectAll()
        totalRe = 0
        totalEx = 0
        for row in rows:
            if row[2] == '수입':
                totalRe += int(row[4])
            elif row[2] == '지출':
                totalEx += int(row[5])
        self.chartPanel.SetData({"수입":totalRe,"지출":totalEx}) 

        event.Skip()
        
    def btnChart1( self, event ):
        self.btnSelect(event)
        firstDate = str(self.txtdatestart.GetValue())
        secondDate = str(self.txtdateend.GetValue())
        rows = homeBook.Select(firstDate,secondDate)
        급여=0
        기타수입=0
        주식비 = 0
        간식비 = 0
        외식비 = 0
        보험료 = 0
        기타지출 = 0
        for row in rows:
            if row[3] == '급여':
                급여 += row[4]
            elif row[3] == '기타수입':
                기타수입 += row[4]
            elif row[3] == '주식비':
                주식비 += row[5]
            elif row[3] == '간식비':
                간식비 += row[5]
            elif row[3] == '외식비':
                외식비 += row[5]
            elif row[3] == '보험료':
                보험료 += row[5]
            elif row[3] == '기타지출':
                기타지출 += row[5]
        self.chartPanel.SetData2({"급여":급여,"기타수입":기타수입,"주식비":주식비,"간식비":간식비,"외식비":외식비,"보험료":보험료,"기타지출":기타지출}) 
        event.Skip()
          
    def handle( self, event ):
        num = event.GetIndex()
        id =self.list.GetItem(num, col=0).GetText()
        date =self.list.GetItem(num, col=1).GetText()
        section =self.list.GetItem(num, col=2).GetText()
        accounttitle =self.list.GetItem(num, col=3).GetText()
        revenue =self.list.GetItem(num, col=4).GetText()
        extense =self.list.GetItem(num, col=5).GetText()
        remark =self.list.GetItem(num, col=6).GetText()
        self.txtNo.SetValue(id)
        self.txtdate.SetValue(date)
        if section == '수입':
            self.radioRevenue.SetValue(1)
        else:
            section == '지출'
            self.radioExpense.SetValue(1)
            
        self.combotitle.SetValue(accounttitle)
        self.txtRe.SetValue(revenue)
        self.txtEx.SetValue(extense)
        self.txtRemark.SetValue(remark)
        event.Skip()
        


if __name__ == '__main__':
    app=wx.App()
    frame = MyFrame1(parent=None)
    frame.Show()
    app.MainLoop()
