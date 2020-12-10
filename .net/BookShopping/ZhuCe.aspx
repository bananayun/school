<%@ Page Language="C#" AutoEventWireup="true" CodeFile="ZhuCe.aspx.cs" Inherits="ZhuCe" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1" runat="server">
    <title>用户注册</title>
     <link href="LoginCss.css" rel="Stylesheet" />
</head>
<body>
    <form id="form1" runat="server">
    <div id="zhuce_panel">
        <p style=" margin:0 20%">
            用户注册
        </p>
        <p>
            账　　号：<asp:TextBox ID="UserName2" runat="server"></asp:TextBox>
        </p>
        <p>
             密　　码：<asp:TextBox ID="UserPwd2" runat="server" TextMode="Password"></asp:TextBox>
             <asp:CompareValidator
                 ID="CompareValidator1" runat="server" ErrorMessage="两次密码不一致" 
                 ControlToCompare="UserPwd2" ControlToValidate="restPwd"></asp:CompareValidator>
        </p>
        <p>
             重复密码：<asp:TextBox ID="restPwd" runat="server" TextMode="Password"></asp:TextBox>
        </p>
        <p>
            　E-mail：<asp:TextBox ID="Email" runat="server"></asp:TextBox>
            <asp:RegularExpressionValidator ID="RegularExpressionValidator1" runat="server" 
                ControlToValidate="Email" ErrorMessage="请输入正确的E-mail" 
                ValidationExpression="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*"></asp:RegularExpressionValidator>
        </p>
        <p style="margin:0 20%">
            <asp:Button ID="Button1" runat="server" text="创建用户" Height="40px" onclick="Unnamed1_Click" 
                Width="80px" />
        </p>
   
    </div>
    </form>
</body>
</html>
