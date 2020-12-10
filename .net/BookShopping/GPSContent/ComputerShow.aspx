<%@ Page Language="C#" AutoEventWireup="true" CodeFile="ComputerShow.aspx.cs" Inherits="GPSContent_ComputerShow" MasterPageFile="~/BookShopMaster.master" %>
<%@ Register Src="~/content/ComputerBookShow.ascx" TagName="ComputerAdds" TagPrefix="ca1" %>
<asp:Content ContentPlaceHolderID="ContentPlaceHoder1" runat="server" ID="Content1">
<ca1:ComputerAdds  runat="server"/>
</asp:Content>