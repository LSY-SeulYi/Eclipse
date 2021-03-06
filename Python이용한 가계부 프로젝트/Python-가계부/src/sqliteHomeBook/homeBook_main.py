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
        
        self.m_staticText1 = wx.StaticText( self, wx.ID_ANY, u"??????", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText1.Wrap( -1 )
        gbSizer1.Add( self.m_staticText1, wx.GBPosition( 0, 3 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_VERTICAL|wx.ALIGN_RIGHT, 5 )
        
        self.m_staticText3 = wx.StaticText( self, wx.ID_ANY, u"????????????", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText3.Wrap( -1 )
        gbSizer1.Add( self.m_staticText3, wx.GBPosition( 1, 0 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.txtdate = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.txtdate, wx.GBPosition( 0, 4 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.m_staticText13 = wx.StaticText( self, wx.ID_ANY, u"??????", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText13.Wrap( -1 )
        gbSizer1.Add( self.m_staticText13, wx.GBPosition( 1, 3 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_RIGHT|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.txtdatestart = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.txtdatestart, wx.GBPosition( 1, 4 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.m_staticText12 = wx.StaticText( self, wx.ID_ANY, u"~", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText12.Wrap( -1 )
        gbSizer1.Add( self.m_staticText12, wx.GBPosition( 1, 5 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.txtdateend = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.txtdateend, wx.GBPosition( 1, 6 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        combotitleChoices = ['??????','????????????','?????????','?????????','?????????','?????????','????????????']
        self.combotitle = wx.ComboBox( self, wx.ID_ANY, u"????????????", wx.DefaultPosition, wx.DefaultSize, combotitleChoices, 0 )
        gbSizer1.Add( self.combotitle, wx.GBPosition( 1, 1 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.m_staticText4 = wx.StaticText( self, wx.ID_ANY, u"????????????", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText4.Wrap( -1 )
        gbSizer1.Add( self.m_staticText4, wx.GBPosition( 2, 0 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_BOTTOM, 5 )
        
        self.radioRevenue = wx.RadioButton( self, wx.ID_ANY, u"??????", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.radioRevenue, wx.GBPosition( 2, 1 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_BOTTOM, 5 )
        
        self.radioExpense = wx.RadioButton( self, wx.ID_ANY, u"??????", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.radioExpense, wx.GBPosition( 2, 3 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_BOTTOM, 5 )
        
        self.m_staticText7 = wx.StaticText( self, wx.ID_ANY, u"??????", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText7.Wrap( -1 )
        gbSizer1.Add( self.m_staticText7, wx.GBPosition( 4, 0 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.txtRemark = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.Size( 500,-1 ), 0 )
        gbSizer1.Add( self.txtRemark, wx.GBPosition( 4, 1 ), wx.GBSpan( 1, 7 ), wx.ALL|wx.EXPAND|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.m_staticText5 = wx.StaticText( self, wx.ID_ANY, u"????????????", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText5.Wrap( -1 )
        gbSizer1.Add( self.m_staticText5, wx.GBPosition( 3, 0 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.txtRe = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.txtRe, wx.GBPosition( 3, 1 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.m_staticText6 = wx.StaticText( self, wx.ID_ANY, u"????????????", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText6.Wrap( -1 )
        gbSizer1.Add( self.m_staticText6, wx.GBPosition( 3, 3 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.txtEx = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer1.Add( self.txtEx, wx.GBPosition( 3, 4 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.list = wx.ListCtrl( self, wx.ID_ANY, wx.DefaultPosition, wx.Size( 740,200 ), wx.LC_REPORT|wx.BORDER_SUNKEN )
        
        self.list.InsertColumn(0, 'No', wx.Layout_RightToLeft, width=50)
        self.list.InsertColumn(1, '??????', wx.Layout_RightToLeft, width=100)
        self.list.InsertColumn(2, '??????/??????', wx.Layout_RightToLeft)
        self.list.InsertColumn(3, '????????????', wx.Layout_RightToLeft)
        self.list.InsertColumn(4, '????????????', wx.Layout_LeftToRight)
        self.list.InsertColumn(5, '????????????', wx.Layout_LeftToRight)
        self.list.InsertColumn(6, '??????', wx.Layout_RightToLeft, width=350)

        gbSizer1.Add( self.list, wx.GBPosition( 6, 0 ), wx.GBSpan( 14, 8 ), wx.ALL|wx.EXPAND, 5 )
        
        gbSizer2 = wx.GridBagSizer( 0, 0 )
        gbSizer2.SetFlexibleDirection( wx.BOTH )
        gbSizer2.SetNonFlexibleGrowMode( wx.FLEX_GROWMODE_SPECIFIED )
        
        self.m_staticText10 = wx.StaticText( self, wx.ID_ANY, u"PieChart", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText10.Wrap( -1 )
        gbSizer2.Add( self.m_staticText10, wx.GBPosition( 0, 0 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.btnchart = wx.Button( self, wx.ID_ANY, u"??? ??????/?????? ?????????", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer2.Add( self.btnchart, wx.GBPosition( 0, 1 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.EXPAND, 5 )
        
        self.btnchart1 = wx.Button( self, wx.ID_ANY, u"????????? ???????????? ?????????", wx.DefaultPosition, wx.DefaultSize, 0 )
        gbSizer2.Add( self.btnchart1, wx.GBPosition( 0, 3 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.EXPAND, 5 )
        
        self.chartPanel = PieChartPanel(self)
        self.chartPanel.SetBackgroundColour( wx.SystemSettings.GetColour( wx.SYS_COLOUR_INFOBK ) )
        
        gbSizer2.Add( self.chartPanel, wx.GBPosition( 1, 0 ), wx.GBSpan( 15, 40 ), wx.ALL|wx.EXPAND, 5 )
        
        self.m_staticText131 = wx.StaticText( self, wx.ID_ANY, u"?????? ?????? : ", wx.DefaultPosition, wx.DefaultSize, 0 )
        self.m_staticText131.Wrap( -1 )
        gbSizer2.Add( self.m_staticText131, wx.GBPosition( 16, 0 ), wx.GBSpan( 1, 1 ), wx.ALL|wx.ALIGN_CENTER_HORIZONTAL|wx.ALIGN_CENTER_VERTICAL, 5 )
        
        self.txtReveSum = wx.TextCtrl( self, wx.ID_ANY, wx.EmptyString, wx.DefaultPosition, wx.DefaultSize, wx.TE_READONLY )
        gbSizer2.Add( self.txtReveSum, wx.GBPosition( 16, 1 ), wx.GBSpan( 1, 1 ), wx.ALL, 5 )
        
        self.m_staticText141 = wx.StaticText( self, wx.ID_ANY, u"?????? ?????? : ", wx.DefaultPosition, wx.DefaultSize, 0 )
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
            section = '??????'
        elif(self.radioExpense.GetValue()):
            section = '??????'
        accounttitle=self.combotitle.GetValue()
        remark=self.txtRemark.GetValue()
        revenue=self.txtRe.GetValue()
        expense=self.txtEx.GetValue()
        try:
            homeBook.insertData(date,section,accounttitle,revenue,expense,remark)
        except:
            print('????????????!')
        finally:
            print('??????????????????')
        event.Skip()
    
    def btnUpdate( self, event ):
        date=self.txtdate.GetValue()
        if(self.radioRevenue.GetValue()):
            section = '??????'
        elif(self.radioExpense.GetValue()):
            section = '??????'
        accounttitle=self.combotitle.GetValue()
        remark=self.txtRemark.GetValue()
        revenue=self.txtRe.GetValue()
        expense=self.txtEx.GetValue()
        id = self.txtNo.GetValue()
        try:
            homeBook.update((date,section,accounttitle,revenue,expense,remark,id))
        except:
            print('????????????!')
        finally:
            print('??????????????????')
        event.Skip()
    
    def btnDelete( self, event ):
        id = self.txtNo.GetValue()
        try:
            homeBook.delete(id)
        except:
            print('????????????!')
        finally:
            print('??????????????????')
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
            ????????????=0
            ????????????=0
            self.list.DeleteAllItems()
            for row in rows:
                self.list.InsertItem(x, str(row[0]))
                self.list.SetItem(x, 1, row[1])
                self.list.SetItem(x, 2, row[2])
                self.list.SetItem(x, 3, row[3])
                self.list.SetItem(x, 4, str(row[4]))
                self.list.SetItem(x, 5, str(row[5]))
                self.list.SetItem(x, 6, row[6])
                ???????????? += row[4]
                ???????????? += row[5]
                x += 1
            self.txtReveSum.SetLabel(str(????????????))
            self.txtExtenSum.SetLabel(str(????????????))
            
        except Exception as e:
            print(e)
            wx.MessageBox("?????? ????????? ????????????.", "Message" , wx.OK | wx.ICON_INFORMATION)  
        finally: 
            cur.close()
            conn.close() 
        event.Skip()
    
    def btnSelecAll( self, event ):
        self.list.DeleteAllItems()
        rows = homeBook.selectAll()
        x=0
        ????????????=0
        ????????????=0
        for row in rows:
            self.list.InsertItem(x, str(row[0]))
            self.list.SetItem(x, 1, row[1])
            self.list.SetItem(x, 2, row[2])
            self.list.SetItem(x, 3, row[3])
            self.list.SetItem(x, 4, str(row[4]))
            self.list.SetItem(x, 5, str(row[5]))
            self.list.SetItem(x, 6, row[6])
            x += 1
            ???????????? += row[4]
            ???????????? += row[5]
        self.txtReveSum.SetLabel(str(????????????))
        self.txtExtenSum.SetLabel(str(????????????))
        event.Skip()
    
    def btnClear( self, event ):
        self.txtNo.Clear()
        self.txtdate.Clear()
        self.txtRemark.Clear()
        self.txtRe.Clear()
        self.txtEx.Clear()
        self.radioExpense.SetValue(int(0))
        self.radioRevenue.SetValue(int(0))
        self.combotitle.SetValue('????????????')
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
            if row[2] == '??????':
                totalRe += int(row[4])
            elif row[2] == '??????':
                totalEx += int(row[5])
        self.chartPanel.SetData({"??????":totalRe,"??????":totalEx}) 

        event.Skip()
        
    def btnChart1( self, event ):
        self.btnSelect(event)
        firstDate = str(self.txtdatestart.GetValue())
        secondDate = str(self.txtdateend.GetValue())
        rows = homeBook.Select(firstDate,secondDate)
        ??????=0
        ????????????=0
        ????????? = 0
        ????????? = 0
        ????????? = 0
        ????????? = 0
        ???????????? = 0
        for row in rows:
            if row[3] == '??????':
                ?????? += row[4]
            elif row[3] == '????????????':
                ???????????? += row[4]
            elif row[3] == '?????????':
                ????????? += row[5]
            elif row[3] == '?????????':
                ????????? += row[5]
            elif row[3] == '?????????':
                ????????? += row[5]
            elif row[3] == '?????????':
                ????????? += row[5]
            elif row[3] == '????????????':
                ???????????? += row[5]
        self.chartPanel.SetData2({"??????":??????,"????????????":????????????,"?????????":?????????,"?????????":?????????,"?????????":?????????,"?????????":?????????,"????????????":????????????}) 
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
        if section == '??????':
            self.radioRevenue.SetValue(1)
        else:
            section == '??????'
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
