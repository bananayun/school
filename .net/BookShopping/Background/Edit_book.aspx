<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Edit_book.aspx.cs" Inherits="Background_Edit_book" MasterPageFile="~/Background/BackgroundMasterPage.master" %>

<%@ Register Src="~/Background/EditBook.ascx" TagName="editAdds" TagPrefix="eb1" %>
<asp:Content ContentPlaceHolderID="ContentPlaceHolder2" ID="cent2" runat="server">
 <eb1:editAdds runat="server"></eb1:editAdds>
</asp:Content>
