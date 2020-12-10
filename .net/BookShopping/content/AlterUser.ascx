<%@ Control Language="C#" AutoEventWireup="true" CodeFile="AlterUser.ascx.cs" Inherits="content_AlterUser" %>
<div style="margin:10px 200px">
    <p style="font-size:larger">
        用　户　名：<asp:TextBox runat="server" ID="AltUserTxt"></asp:TextBox>
    </p>
    <p style="font-size:larger">
        旧　密　码：<asp:TextBox runat="server" ID="UserPwd" TextMode="Password"></asp:TextBox>
    </p>
    <p style="font-size:larger">
        新　密　码：<asp:TextBox 
            runat="server" ID="AltPwd" TextMode="Password"></asp:TextBox><asp:CompareValidator
            ID="CompareValidator1" runat="server" ErrorMessage="两次输入密码不一致" 
            ControlToCompare="AltPwd" ControlToValidate="AltPwd2"></asp:CompareValidator>
    </p>
    <p style="font-size:larger">
        重复新密码：<asp:TextBox runat="server" ID="AltPwd2" 
            TextMode="Password"></asp:TextBox>
    </p>
    <p style="font-size:larger">
        <asp:Button runat="server" ID="AltBut" Text="修改密码" Height="40" Width="80" 
            onclick="AltBut_Click" />
    </p>

</div>