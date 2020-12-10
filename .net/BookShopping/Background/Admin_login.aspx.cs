using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Admin_login : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        Session["judage"] = "1";
    }

    protected void ImageButton1_Click(object sender, ImageClickEventArgs e)
    {
        SQLClass sc = new SQLClass();
        String sqlStr = "select * from UserInfo where UserName='" + UserName.Text + "' and UserPwd='" + UserPwd.Text + "'";
        if (sc.sqlSelect(sqlStr) && UserName.Text == "admin")
        {
            Session["UserName"] = "admin";
            Response.Redirect("Admin_Home.aspx");
        }
        else
            Response.Write("<script language=javascript>alert('登录失败！');</script>");

    }
}