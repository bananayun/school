using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.SqlClient;
using System.Data;

public partial class ZhuCe : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Unnamed1_Click(object sender, EventArgs e)
    {       
        String sqlStr = "insert UserInfo(UserName,UserPwd,E_mail)  values('" + UserName2.Text + "','" + UserPwd2.Text + "','"+ Email.Text+"')";
        bool bl=DB.ExSql(sqlStr);
        if(bl==true)
        {
            Response.Write("<script language=javascript>alert('注册成功！');</script>");
            Response.Redirect("Default.aspx");
        }
        else
            Response.Write("<script language=javascript>alert('注册失败！');</script>");
        

    }
}