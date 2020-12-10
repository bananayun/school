<%@ Page Language="C#" AutoEventWireup="true"  CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>登陆页面</title>
    <link href="LoginCss.css" rel="Stylesheet" />
</head>
<body>
    <form id="form1" runat="server">
    <div id="greet">
   
        <div id="login_panel">
        <p id="title_panel">
        <asp:Label runat="server" Text="用户登陆"></asp:Label>
         </p>
        <p class="userTxt_panel">
        <asp:Label runat="server" Text="账号：" ForeColor="Silver"></asp:Label>
        <asp:TextBox ID="UserName" runat="server" CssClass="login_text" Text="admin" ></asp:TextBox>
        </p>
        <p class="userTxt_panel">
         <asp:Label ID="Label1" runat="server" Text="密码：" ForeColor="Silver"></asp:Label>
         <asp:TextBox ID="UserPwd" runat="server"  TextMode="Password" 
             CssClass="login_text" BorderStyle="Dotted" Text="123"></asp:TextBox>
         </p>
         <p id="loginBut_panel">              
              <asp:ImageButton ID="ImageButton1" runat="server" ImageUrl="~/image/login.jpg" 
                   onclick="ImageButton1_Click" />
             <asp:ImageButton ID="ImageButton2" runat="server" ImageUrl="~/image/zhuce.jpg" 
                  onclick="ImageButton2_Click" />
        </p>
        </div>
     </div>
    </form>
</body>
</html>
