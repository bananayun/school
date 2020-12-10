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
    protected void Page_Load(object sender, EventArgs e)
    {
        Bind();
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
        if (M_str_Count == "")
        {
            Response.Write("<script>alert('您的购物车中没有任何物品!');</script>");
        }
        else
        {
            DataSet ds = DB.reDs("select Money from tb_User where UserID=" + Session["UserID"].ToString());
            decimal P_str_Money = Convert.ToDecimal(ds.Tables[0].Rows[0][0].ToString());
            if (P_str_Money < Convert.ToDecimal(M_str_Count))
            {
                Response.Write("<script>alert('您的余额不足，请重新充值后再购买！');</script>");
            }
            else
            {
                bool P_bool_reVal1 = DB.ExSql("Delete from tb_Cart where CartID=" + Session["UserID"]);
                bool P_bool_reval2 = DB.ExSql("update tb_User set Money=Money-" + M_str_Count + " where UserID=" + Session["UserID"]);
                if (!P_bool_reVal1 & !P_bool_reval2)
                {
                    Response.Write("<script>结账失败，请重试！</script>");
                }
                else
                {
                    Bind();
                    //Response.Redirect("SuccessShop.aspx");
                    Response.Write("<script>window.open('SuccessShop.aspx','','Width=300px;Height=250px;status=no;help=no;scrollbars=no');</script>");
                }
            }
        }
    }
}