<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Admin_login.aspx.cs" Inherits="Admin_login" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>用户登录</title>
      <link href="../LoginCss.css" rel="Stylesheet" />
</head>
<body>
    <form id="form1" runat="server">
    <div style="background-image: url('../image/BoundImage.jpg'); margin:0px 200px; width:960px; height:500px;">
        <div style=" width:320px; height:250px; margin:150px 30%; position: absolute;">
            <p class="userTxt_panel">
                <asp:Label ID="Label2" runat="server" Text="账号：" ForeColor="Black" Font-Size="Large"></asp:Label>
                <asp:TextBox ID="UserName" runat="server" CssClass="login_text"></asp:TextBox>
                </p>
                 <p class="userTxt_panel">
                <asp:Label ID="Label3" runat="server" Text="密码：" ForeColor="Black" Font-Size="Large"></asp:Label>
                <asp:TextBox ID="UserPwd" runat="server"  TextMode="Password" 
                 CssClass="login_text" BorderStyle="Dotted"></asp:TextBox>
                </p>
            <p id="loginBut_panel">            
              <asp:ImageButton ID="ImageButton1" runat="server" ImageUrl="~/image/login.jpg" 
                   onclick="ImageButton1_Click" />             
            </p>
           </div>
           </div>
    </form>
</body>
</html>
