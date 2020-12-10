<%@ Page Language="C#" AutoEventWireup="true" CodeFile="ShopingCart2.aspx.cs" Inherits="GPSContent_ShopingCart" MasterPageFile="~/BookShopMaster.master" %>
<%@ Register Src="~/content/ShopingCart2.ascx" TagName="cartAdds" TagPrefix="sc" %>
<asp:Content ContentPlaceHolderID="ContentPlaceHoder1" runat="server">
<sc:cartAdds runat="server">
</sc:cartAdds>
</asp:Content>