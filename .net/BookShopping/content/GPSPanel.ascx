<%@ Control Language="C#" AutoEventWireup="true" CodeFile="GPSPanel.ascx.cs" Inherits="content_GPSPanel"%>
<div style=" margin:10px 10px;">
    <asp:DataList ID="showBookDl" runat="server" RepeatColumns="4" Width="500" OnItemCommand="ShowBook_ItemCommand">
        <ItemTemplate>
            <table style="font-size: 10pt; width: 227px; height: 105px" border="0" cellpadding="0" cellspacing="0">
                                <tr>
                                    <td rowspan="4" style="width: 101px">
                                        <asp:Image ID="imgGoodsPhoto" runat="server" ImageUrl='<%# Eval("ImageAds") %>' Width="66px" Height="92px" /></td>
                                    <td style="width: 201px">
                                        名称：<asp:Label ID="labGoodsName" runat="server" Text='<%# Eval("BookName") %>'></asp:Label></td>
                                </tr>
                                <tr>
                                    <td style="width: 201px">
                                        销售数量：<asp:Label ID="labGoodsKind" runat="server" Text='<%# Eval("Incount") %>'></asp:Label></td>
                                </tr>
                                <tr>
                                    <td style="width: 201px">
                                        单价：<asp:Label ID="labGoodzPrice" runat="server" Text='<%# Eval("Price", "{0:c}") %>'></asp:Label></td>
                                </tr>
                                <tr>
                                    <td style="width: 201px">
                                        <asp:LinkButton ID="lnkbtnGoodsDescribe" runat="server" CommandArgument='<%# Eval("ISBN")%>' CommandName="describe">详细信息</asp:LinkButton>
                                        <asp:LinkButton ID="lnkbtnBuy" runat="server" CommandArgument='<%# Eval("ISBN") %>' Width="32px" CommandName="buy">购买</asp:LinkButton></td>
                                </tr>
                        </table>
        </ItemTemplate>
    </asp:DataList>
</div>