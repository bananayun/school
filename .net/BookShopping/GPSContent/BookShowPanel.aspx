<%@ Page Language="C#" AutoEventWireup="true" CodeFile="BookShowPanel.aspx.cs" Inherits="GPSContent_BookShowPanel" MasterPageFile="~/BookShopMaster.master" %>

<%@ Register Src="~/content/BookShow2.ascx" TagName="BookShowAdds" TagPrefix="bs2" %>
<asp:Content ContentPlaceHolderID="ContentPlaceHoder1" runat="server">
<bs2:BookShowAdds runat="server">
</bs2:BookShowAdds>
</asp:Content>
