<%@ Control Language="C#" AutoEventWireup="true" CodeFile="BookMinute.ascx.cs" Inherits="content_BookMinute" %>
<table align="center" border="0" cellpadding="0" cellspacing="0" style="font-size: 10pt;
            width: 352px">
            <tr>
                <td align="left" style="width: 200px">
                    商品名称：</td>
                <td style="width: 359px">
                    <asp:TextBox ID="txtGoodsName" runat="server" Enabled="False"></asp:TextBox>
                    <font color="red"></font>
                </td>
            </tr>
            <tr style="color: #000000">
                <td align="left" style="width: 200px; height: 19px">
                    商品价格：
                </td>
                <td colspan="3" style="width: 269px; height: 19px">
                    <asp:TextBox ID="txtGoodsPrice" runat="server" Enabled="False">0</asp:TextBox>￥</td>
            </tr>
            <tr>
                <td align="left" style="width: 200px; height: 87px">
                    商品图像：
                </td>
                <td colspan="3" style="width: 269px; height: 87px">
                    <asp:Image ID="imgGoodsPhoto" runat="server" Height="103px" Width="90px">
                    </asp:Image>
                </td>
            </tr>
            <tr>
                <td align="left" style="width: 200px; height: 97px">
                    商品介绍：
                </td>
                <td style="width: 359px; height: 97px">
                    <asp:TextBox ID="txtGoodsDesc" runat="server" Height="84px" TextMode="MultiLine"
                        Width="245px" Enabled="False"></asp:TextBox></td>
            </tr>
            <tr>
                <td align="left" colspan="2" style="height: 8px">
                    <asp:Button ID="btnClose" runat="server" OnClick="btnClose_Click" Text="关闭" /></td>
            </tr>
        </table>