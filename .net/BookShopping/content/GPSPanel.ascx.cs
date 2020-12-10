using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;

public partial class content_GPSPanel : System.Web.UI.UserControl
{
    protected void Page_Load(object sender, EventArgs e)
    {
        string BookName = Request["BookName"];
        DataSet ds = DB.reDs("select * from ShowBook where BookName='" + BookName + "'");
        showBookDl.DataSource = ds;//指定数据源
        showBookDl.DataBind();
    }
    protected void ShowBook_ItemCommand(object source, DataListCommandEventArgs e)
    {

        if (e.CommandName == "describe")
        {
            string P_str_GoodsID = e.CommandArgument.ToString();
            Response.Write("<script>window.open('BookMinute.aspx?ISBN=" + P_str_GoodsID + "','','width=637px,height=601px')</script>");
        }
        if (e.CommandName == "buy")
        {
            if (Session["UserID"] != null)
            {
                string P_str_GoodsID = e.CommandArgument.ToString();
                Response.Redirect("ShopingCart.aspx?ISBN=" + P_str_GoodsID);
            }
            else
            {
                Response.Write("<script>alert('您还没有登录，请先登录再购买！');</script>");
            }
        }
    }
}