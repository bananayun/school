using System;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Xml.Linq;
using System.Data.SqlClient;
using System.Collections;

public partial class _Default : System.Web.UI.Page 
{
    protected void Page_Load(object sender, EventArgs e)
    {
        Session["UserID"]=null;
        Session["UserName"] = null;
    }
    protected void ImageButton1_Click(object sender, ImageClickEventArgs e)
    {
        String sqlStr = "select * from UserInfo where UserName='"+UserName.Text+"' and UserPwd='"+UserPwd.Text+"'";
        DataSet ds = DB.reDs(sqlStr);
        if (ds.Tables[0].Rows.Count != 0)
        {
            Session["UserID"] = ds.Tables[0].Rows[0][0].ToString();
            Session["UserName"] = UserName.Text;
            Response.Redirect("GPSContent/home_page.aspx");
        }
        else
            Response.Write("<script language=javascript>alert('登录失败！');</script>");
    }

    protected void ImageButton2_Click(object sender, ImageClickEventArgs e)
    {
        Response.Redirect("ZhuCe.aspx");
    }
}