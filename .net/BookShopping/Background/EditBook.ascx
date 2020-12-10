<%@ Control Language="C#" AutoEventWireup="true" CodeFile="EditBook.ascx.cs" Inherits="Background_EditBook" %>
<table style="width: 701px">
    <tr>
        <td style="width: 172px">
            ISBN:</td>
        <td style="width: 22px">
            <asp:TextBox ID="txtIS" runat="server" Width="173px"></asp:TextBox></td>
        <td>
            书名:</td>
        <td>
            <asp:TextBox ID="bookName" runat="server"></asp:TextBox>
        </td>
    </tr>
    <tr>
        <td style="width: 172px">
            作者:</td>
        <td style="width: 22px">
            <asp:TextBox ID="txtAuthor" runat="server" Width="173px"></asp:TextBox></td>
        <td>
            价格:</td>
        <td>
            <asp:TextBox ID="txtprice" runat="server"></asp:TextBox></td>
    </tr>
    <tr>
        <td style="width: 172px">
            入库数量:</td>
        <td style="width: 22px">
            <asp:TextBox ID="txtcount" runat="server" Width="174px"></asp:TextBox></td>
        <td>
            书籍种类:</td>
        <td>
            <asp:DropDownList ID="dropclass" runat="server">
                <asp:ListItem>计算机</asp:ListItem>
                <asp:ListItem>青春</asp:ListItem>
                <asp:ListItem>励志</asp:ListItem>
                <asp:ListItem>小说</asp:ListItem>
            </asp:DropDownList>
        </td>
    </tr>
    <tr>
        <td style="width: 172px">
            简介：</td>
        <td style="width: 22px">
            <asp:TextBox ID="txtdesc" runat="server" Rows="3" TextMode="MultiLine"></asp:TextBox></td>
        <td>
            图片地址：
        </td>
        <td>
            <asp:TextBox ID="ImageAds" runat="server">
            </asp:TextBox>
        </td>
       
    </tr>
    <tr>
        <td colspan="4">
            <p style=" margin:0 200px">
            <asp:Button ID="Button1" runat="server" Text="入库" Width="76px" 
                onclick="Button1_Click" />
            <asp:Button ID="Button2" runat="server" Text="修改" Width="76px" 
                onclick="Button2_Click" />
            <asp:Button ID="btnDelte" runat="server" Text="删除" Width="76px" 
                    onclick="btnDelte_Click" />
            </p>
        </td>      
    </tr>
</table>
