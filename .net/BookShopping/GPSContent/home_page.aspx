<%@ Page Language="C#" AutoEventWireup="true" CodeFile="home_page.aspx.cs" Inherits="home_page" MasterPageFile="~/BookShopMaster.master" %>

<%@ Register Src="~/content/BookShow2.ascx" TagName="BookAddress" TagPrefix="nr1" %>
<asp:Content ContentPlaceHolderID="ContentPlaceHoder1" runat="server" ID="Content1">
<p style=" font-size:large;">
    新书上架:
</p>
<br />
<nr1:BookAddress runat="server" />
<p style=" font-size:large;">
    热点推荐：
</p>
<br />
<nr1:BookAddress ID="BookAddress1" runat="server" />
<p style=" font-size:large;">
    经典书籍：
</p>
<br />
<nr1:BookAddress ID="BookAddress2" runat="server" />
</asp:Content>