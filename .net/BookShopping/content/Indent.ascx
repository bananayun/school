<%@ Control Language="C#" AutoEventWireup="true" CodeFile="Indent.ascx.cs" Inherits="content_Indent" %>
<asp:DataList ID="dlShoppingCart" runat="server" 
             OnDeleteCommand="dlShoppingCart_DeleteCommand" 
 Font-Size="Large" 
             Height="211px" Width="410px">
                        <ItemTemplate>
                            <table style="width: 800px; font-size: 10pt;" border="0" cellpadding="0" cellspacing="0">
                                <tr>
                                    <td style="width: 100px; height: 26px;">
                                        <asp:Label ID="labGoodName" runat="server" Text='<%# Eval("IndentID") %>'></asp:Label></td>
                                    <td style="width: 102px; height: 26px;">
                                        <asp:Label ID="labGoodsPrice" runat="server" Text='<%# Eval("UserName") %>'></asp:Label></td>
                                    <td style="width: 102px; height: 26px;">
                                        <asp:Label ID="txtGoodsNum" runat="server" Text='<%# Eval("BookName") %>' Width="33px"></asp:Label></td>
                                     <td style="width: 62px; height: 26px;">
                                        <asp:Label ID="TextBox1" runat="server" Text='<%# Eval("Price","{0:c}") %>' Width="33px"></asp:Label></td>
                                      <td style="width: 62px; height: 26px;">
                                        <asp:Label ID="TextBox2" runat="server" Text='<%# Eval("Num") %>' Width="33px"></asp:Label></td>
                                        <td style="width: 102px; height: 26px;">
                                        <asp:Label ID="TextBox3" runat="server" Text='<%# Eval("IndentTime") %>' Width="33px"></asp:Label></td>
                                        <td style="width: 102px; height: 26px;">
                                        <asp:Label ID="TextBox4" runat="server" Text='<%# Eval("FaHuoWay") %>' Width="33px"></asp:Label></td>
                                         <td style="width: 102px; height: 26px;">
                                        <asp:Label ID="TextBox5" runat="server" Text='　<%# Eval("PayMoney") %>' Width="33px"></asp:Label></td>
                                        <td style="width: 102px; height: 26px;">
                                        <asp:Label ID="TextBox6" runat="server" Text='　<%# Eval("fahuo") %>' Width="33px"></asp:Label></td>
                                    <td style="height: 40px">
                                        &nbsp;<asp:LinkButton ID="lnkbtnDel" runat="server" CommandArgument='<%# Eval("IndentID") %>'
                                            CommandName="delete" ForeColor="Black">删除</asp:LinkButton></td>
                                </tr>
                            </table>
                        </ItemTemplate>
                        <HeaderTemplate><table style="width: 800px; font-size: 10pt;" border="0" cellpadding="0" cellspacing="0">
                            <tr>
                                <td style="width: 100px; height: 26px; font-size:large">
                                        订单编号</td>
                                <td style="width: 100px; height: 26px;  font-size:large">
                                        用户名</td>
                                <td style="width: 100px; height: 26px; font-size:large">
                                        图书名</td>
                                <td style="width: 60px; height: 26px; font-size:large">
                                        价格</td>
                                <td style="width: 60px; height: 26px; font-size:large">
                                        数量</td>
                                <td style="width: 100px; height: 26px; font-size:large">
                                        订单日期</td>
                                <td style="width: 100px; height: 26px; font-size:large">
                                        发货方式</td>
                                <td style="width: 100px; height: 26px; font-size:large">
                                        付款方式</td>
                                <td style="width: 100px; height: 26px; font-size:large">
                                        是否发货</td>
                                <td style="height: 26px">
                                    &nbsp;</td>
                            </tr>
                        </table>
                        </HeaderTemplate>
                        <FooterTemplate>
                        </FooterTemplate>
                        <FooterStyle BackColor="#b9f4fa" />
                        <AlternatingItemStyle BackColor="White" />
                        <ItemStyle BackColor="#ffffff" />
                        <HeaderStyle BackColor="#b9f4fa" />
                    </asp:DataList>