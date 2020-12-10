using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Background_EditBook : System.Web.UI.UserControl
{
    //string book;
    //string tablestr;
    protected void Page_Load(object sender, EventArgs e)
    {
           
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        SQLClass sc = new SQLClass();
        string sqlstr = "insert ShowBook values(" + txtIS.Text + ",'" + bookName.Text + "'," +
                       "'" + txtAuthor.Text + "'," + txtprice.Text + "," + txtcount.Text + ",0,'" + txtdesc.Text + "','" + ImageAds.Text + "','"+ dropclass.Text+"')";
        if (sc.sqlExec(sqlstr))
        {
            Response.Write("<script language=javascript>alert('添加成功！');</script>");
        }
        else
            Response.Write("<script language=javascript>alert('添加失败！');</script>");
           

    }
    protected void Button2_Click(object sender, EventArgs e)
    {
        SQLClass sc = new SQLClass();
        string sqlstr;
        if (txtprice.Text.Length>0 && txtcount.Text.Length>0)
            sqlstr = "update ComputerBk set 价格=" + txtprice.Text + ",入库数量=" + txtcount.Text + " where ISBN=" + txtIS.Text + "";
        else if (txtprice.Text.Length>0)
            sqlstr = "update ComputerBk set 价格=" + txtprice.Text + " where ISBN=" + txtIS.Text + "";
        else
            sqlstr = "update ComputerBk set 入库数量=" + txtcount.Text + " where ISBN=" + txtIS.Text + "";


        if (sc.sqlExec(sqlstr))
        {
            Response.Write("<script language=javascript>alert('修改成功！');</script>");
           // Response.Redirect("Admin_Home.aspx");
        }
        else
            Response.Write("<script language=javascript>alert('修改失败！');</script>");
    }
    protected void btnDelte_Click(object sender, EventArgs e)
    {
        SQLClass sc = new SQLClass();
        string sqlStr=" delete ComputerBk where ISBN="+ txtIS.Text+"";
        if (sc.sqlExec(sqlStr))
        {
            Response.Write("<script language=javascript>alert('删除成功！');</script>");
        }
        else
            Response.Write("<script language=javascript>alert('删除失败！');</script>");
    }
}