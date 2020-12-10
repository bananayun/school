using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;

public partial class content_BookMinute : System.Web.UI.UserControl
{
    protected void Page_Load(object sender, EventArgs e)
    {
        string P_str_GoodsID=Request["ISBN"];
        DataSet ds = DB.reDs("select * from ShowBook where ISBN=" + P_str_GoodsID);
        txtGoodsName.Text = ds.Tables[0].Rows[0][1].ToString();
        imgGoodsPhoto.ImageUrl = ds.Tables[0].Rows[0][7].ToString();
        txtGoodsPrice.Text = ds.Tables[0].Rows[0][3].ToString();
        txtGoodsDesc.Text = ds.Tables[0].Rows[0][6].ToString();

    }
    protected void btnClose_Click(object sender, EventArgs e)
    {
        Response.Write("<script>window.close();</script>");
    }
}