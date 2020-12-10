using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class content_AlterUser : System.Web.UI.UserControl
{
    protected void Page_Load(object sender, EventArgs e)
    {
        AltUserTxt.Text = Session["UserName"].ToString();
    }
    protected void AltBut_Click(object sender, EventArgs e)
    {
        SQLClass sc = new SQLClass();
        String sqlStr = "select * from UserInfo where UserName='" + AltUserTxt.Text+ "' and UserPwd='" + UserPwd.Text+ "'";
        if (sc.sqlSelect(sqlStr))
        {
            sqlStr = "update UserInfo set UserPwd='" + AltPwd.Text+"' where UserName='"+ AltUserTxt.Text+"'";
            if (sc.sqlExec(sqlStr))
            {
                Response.Write("<script language=javascript>alert('修改成功！');</script>");
            }
        }
        else
            Response.Write("<script language=javascript>alert('原密码错误或用户名错误！');</script>");
    }
}