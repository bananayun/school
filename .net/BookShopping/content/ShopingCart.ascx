<%@ Control Language="C#" AutoEventWireup="true" CodeFile="ShopingCart.ascx.cs" Inherits="content_ShopingCart" %>
<div style=" margin:150px 250px;">
         <asp:LinkButton ID="lnkbtnContinue" runat="server" 
             OnClick="lnkbtnContinue_Click" ForeColor="#5D00EE" Font-Size="X-Large">继续购物　</asp:LinkButton>
         <asp:LinkButton ID="lnkbtnSettleAccounts" runat="server" OnClick="lnkbtnSettleAccounts_Click" ForeColor="#5D00EE"  Font-Size="X-Large">下订单　</asp:LinkButton>
         <asp:LinkButton ID="lnkbtnClear" runat="server" OnClick="lnkbtnClear_Click" OnLoad="lnkbtnClear_Load" ForeColor="#5D00EE"  Font-Size="X-Large">清空购物车</asp:LinkButton>
         <asp:DataList ID="dlShoppingCart" runat="server" 
             OnItemDataBound="dlShoppingCart_ItemDataBound" 
             OnDeleteCommand="dlShoppingCart_DeleteCommand" 
             OnItemCommand="dlShoppingCart_ItemCommand" Font-Size="Large" 
             Height="211px" Width="410px">
                        <ItemTemplate>
                            <table style="width: 368px; font-size: 10pt;" border="0" cellpadding="0" cellspacing="0">
                                <tr>
                                    <td style="width: 88px; height: 26px;">
                                        <asp:Label ID="labGoodName" runat="server" Text='<%# Eval("BookName") %>'></asp:Label></td>
                                    <td style="width: 102px; height: 26px;">
                                        <asp:Label ID="labGoodsPrice" runat="server" Text='<%# Eval("Price","{0:c}") %>'></asp:Label></td>
                                    <td style="width: 50px; height: 26px;">
                                        <asp:TextBox ID="txtGoodsNum" runat="server" Text='<%# Eval("Num") %>' Width="33px"></asp:TextBox></td>
                                    <td style="width: 76px; height: 26px">
                                        <asp:LinkButton ID="lnkbtnUpdateCart" runat="server" CommandArgument='<%# Eval("ISBN") %>'
                                            CommandName="updateNum" ForeColor="Black">更新购物车</asp:LinkButton></td>
                                    <td style="height: 26px">
                                        &nbsp;<asp:LinkButton ID="lnkbtnDel" runat="server" CommandArgument='<%# Eval("ISBN") %>'
                                            CommandName="delete" ForeColor="Black" OnLoad="lnkbtnDel_Load">删除</asp:LinkButton></td>
                                </tr>
                            </table>
                        </ItemTemplate>
                        <HeaderTemplate><table style="width: 368px; font-size: 10pt;" border="0" cellpadding="0" cellspacing="0">
                            <tr>
                                <td style="width: 88px; height: 26px; font-size:large">
                                        商品名称</td>
                                <td style="width: 102px; height: 26px;  font-size:large">
                                        单价</td>
                                <td style="width: 50px; height: 26px; font-size:large">
                                        数量</td>
                                <td style="width: 76px; height: 26px">
                                </td>
                                <td style="height: 26px">
                                    &nbsp;</td>
                            </tr>
                        </table>
                        </HeaderTemplate>
                        <FooterTemplate>
                            <table style="width: 368px; font-size: 10pt;" border="0" cellpadding="0" cellspacing="0">
                                <tr>
                                    <td align="left" colspan="4" style=" font-size:large;">
                                        合计金额：<%#M_str_Count %>￥</td>
                                </tr>
                            </table>
                        </FooterTemplate>
                        <FooterStyle BackColor="#b9f4fa" />
                        <AlternatingItemStyle BackColor="White" />
                        <ItemStyle BackColor="#ffffff" />
                        <HeaderStyle BackColor="#b9f4fa" />
                    </asp:DataList>
                    <p>
                    发货方式：<asp:DropDownList ID="DropDownList1" runat="server">
                        <asp:ListItem Value="申通">申通</asp:ListItem>
                        <asp:ListItem Value="圆通">圆通</asp:ListItem>
                        <asp:ListItem>EMSN</asp:ListItem>
                    </asp:DropDownList>
                    </p>
                    <p>
                        付款方式：<asp:DropDownList ID="DropDownList2" runat="server">
                            <asp:ListItem Value="网银">网银</asp:ListItem>
                            <asp:ListItem Value="支付宝">支付宝</asp:ListItem>
                        </asp:DropDownList>
                    </p>
</div>




