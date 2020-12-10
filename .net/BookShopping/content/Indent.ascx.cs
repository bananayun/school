using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;

public partial class content_Indent : System.Web.UI.UserControl
{
    protected void Page_Load(object sender, EventArgs e)
    {
        Bind();
      
    }
    public void Bind()
    {
        string user = Session["UserID"].ToString();
        DataSet ds2 = DB.reDs("select UserName from UserInfo where UserID=" + user);
        string UserName = ds2.Tables[0].Rows[0][0].ToString();
        DataSet ds = DB.reDs("select * from Indent where UserName='" + UserName + "'");
        dlShoppingCart.DataSource = ds;//指定数据源
        dlShoppingCart.DataBind();
    }
    //删除购物车中的商品
    protected void dlShoppingCart_DeleteCommand(object source, DataListCommandEventArgs e)
    {
        bool P_bool_reVal = DB.ExSql("Delete from Indent where IndentID=" + e.CommandArgument.ToString());
        if (!P_bool_reVal)
            Response.Write("<script>删除失败，请重试！</script>");
        else
            Bind();
    }
}