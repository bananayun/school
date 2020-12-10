using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;

public partial class content_ShopingCart : System.Web.UI.UserControl
{
    public static string M_str_Count;
    public string BookName;
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            //向购物车中添加商品，如果购物车中已经存在该商品，则商品数量加１，如果是第一次购买，则向购物车中添加一条商品信息
            string P_str_CartID = Session["UserID"].ToString();
            string P_str_GoodsID = Request["ISBN"];
             DateTime dt = DateTime.Now; 
            string dt24 = dt.ToString("yyyy-MM-dd HH:mm:ss");
            DataSet ds = DB.reDs("select count(*) from bk_Cart where CartId=" + P_str_CartID + "and ISBN=" + P_str_GoodsID);
            if (ds.Tables[0].Rows[0][0].ToString() == "0")
            {
                DataSet ds1 = DB.reDs("select BookName,Price from ShowBook where ISBN=" + P_str_GoodsID);
                DataSet ds2 = DB.reDs("select UserName from UserInfo where UserID=" + P_str_CartID);
                string P_str_GoodsName = ds1.Tables[0].Rows[0][0].ToString();
                string P_str_GoodsPrice = ds1.Tables[0].Rows[0][1].ToString();
                string P_str_Num = "1";
                string UserName = ds2.Tables[0].Rows[0][0].ToString();
                BookName=P_str_GoodsName;
                DB.ExSql("insert bk_Cart values(" + P_str_CartID + "," + P_str_GoodsID + ",'" + P_str_GoodsName + "'," + P_str_GoodsPrice + "," + P_str_Num + ")");
                bool bl=DB.ExSql("insert Indent values('"+ UserName+"','"+ P_str_GoodsName+"',"+ P_str_GoodsPrice+","+ P_str_Num+",'"+
                            dt24+"','"+ DropDownList1.Text+"','"+ DropDownList2.Text+"','是')");
            }
            else
            {
                DB.ExSql("update bk_Cart set Num=Num+1 where CartId=" + P_str_CartID + " and ISBN=" + P_str_GoodsID);
                DB.ExSql("update Indent set Num=Num+1 where BookName="+BookName);

            }
            
            //显示购物车中的商品信息
            Bind();
        }
    }
    public void Bind()
    {
        DataSet ds2 = DB.reDs("select *,Price*Num As Count from bk_cart where CartId=" + Session["UserID"]);
        float P_fl_Count = 0;
        foreach (DataRow dr in ds2.Tables[0].Rows)
        {
            P_fl_Count += Convert.ToSingle(dr[6]);
        }
        M_str_Count = P_fl_Count.ToString();
        dlShoppingCart.DataSource = ds2;
        dlShoppingCart.DataBind();
    }
    protected void dlShoppingCart_ItemDataBound(object sender, DataListItemEventArgs e)
    {
        //用来实现数量文本框中只能输入数字
        TextBox txtGoodsNum = (TextBox)e.Item.FindControl("txtGoodsNum");
        if (txtGoodsNum != null)
        {
            txtGoodsNum.Attributes["onkeyup"] = "value=value.replace(/[^\\d]/g,'')";
        }

    }
    //清空购物车
    protected void lnkbtnClear_Click(object sender, EventArgs e)
    {
        bool P_bool_reVal = DB.ExSql("Delete from bk_Cart where CartId=" + Session["UserID"]);
        if (!P_bool_reVal)
            Response.Write("<script>清空失败，请重试！</script>");
        else
            Bind();
    }
    //清空购物车时的提示信息
    protected void lnkbtnClear_Load(object sender, EventArgs e)
    {
        lnkbtnClear.Attributes["onclick"] = "javascript:return confirm('你确定要清空购物车吗？')";
    }
    //继续购物
    protected void lnkbtnContinue_Click(object sender, EventArgs e)
    {
        Response.Redirect("home_page.aspx");
    }
    //删除购物车中的商品
    protected void dlShoppingCart_DeleteCommand(object source, DataListCommandEventArgs e)
    {
        bool P_bool_reVal = DB.ExSql("Delete from bk_Cart where CartId=" + Session["UserID"] + " and ISBN=" + e.CommandArgument.ToString());
        if (!P_bool_reVal)
            Response.Write("<script>删除失败，请重试！</script>");
        else
            Bind();
    }
    //删除购物车中的商品时的提示信息
    protected void lnkbtnDel_Load(object sender, EventArgs e)
    {
        ((LinkButton)sender).Attributes["onclick"] = "javascript:return confirm('你确定要删除该物品吗？')";
    }
    //更新购物车
    protected void dlShoppingCart_ItemCommand(object source, DataListCommandEventArgs e)
    {
        if (e.CommandName == "updateNum")
        {
            string P_str_Num = ((TextBox)e.Item.FindControl("txtGoodsNum")).Text;
            bool P_bool_reVal = DB.ExSql("update bk_cart set Num=" + P_str_Num + "where CartId=" + Session["UserID"] + "and ISBN=" + e.CommandArgument.ToString());
            if (P_bool_reVal)
                Bind();
        }
    }
    protected void lnkbtnSettleAccounts_Click(object sender, EventArgs e)
    {

        Response.Write("<script language=javascript>alert('下订单成功！');</script>");
    }
}