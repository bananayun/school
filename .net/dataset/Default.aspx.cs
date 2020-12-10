using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

using System.Data;
using System.Data.SqlClient;

public partial class _Default : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            bind();
        }
    }

    public void bind()
    {
        string strconn = "Data Source=404-TEACHER;Initial Catalog=student;Integrated Security=True";
        SqlConnection conn = new SqlConnection(strconn);
        conn.Open();

        string cmd = "select * from dbo.student_table";
        SqlDataAdapter da = new SqlDataAdapter(cmd, conn);
        DataSet ds = new DataSet();
        da.Fill(ds);

        GridView1.DataSource = ds;

        GridView1.DataKeyNames = new string[] { "sname" };//主键bai
        GridView1.DataBind();
        conn.Close();
    }


    protected void GridView1_RowEditing(object sender, GridViewEditEventArgs e)
    {
        GridView1.EditIndex = e.NewEditIndex;
        bind();
    }
    protected void GridView1_RowCancelingEdit(object sender, GridViewCancelEditEventArgs e)
    {
        GridView1.EditIndex = -1;
        bind();
    }
    protected void GridView1_RowUpdating(object sender, GridViewUpdateEventArgs e)
    {
        string strconn = "Data Source=404-TEACHER;Initial Catalog=student;Integrated Security=True";
        SqlConnection conn = new SqlConnection(strconn);
        conn.Open();


        ((TextBox)(GridView1.Rows[e.RowIndex].Cells[2].Controls[0])).Text.ToString().Trim();

        string updateSql = "update student_table set stu_id='"
           + ((TextBox)(GridView1.Rows[e.RowIndex].Cells[3].Controls[0])).Text.ToString().Trim() + "' where sname='"
           + GridView1.DataKeys[e.RowIndex].Value.ToString().Trim() + "'";

        SqlCommand cmdt = new SqlCommand(updateSql, conn);
        try
        {
            cmdt.ExecuteNonQuery();
            Response.Write("<script>alert('更新成功！')</script>");
        }
        catch
        {
            return;
        }
        conn.Close();
        GridView1.EditIndex = -1;
        bind();
    }




    protected void GridView1_SelectedIndexChanged(object sender, EventArgs e)
    {
        bind();
    }
    protected void GridView1_SelectedIndexChanging(object sender, GridViewSelectEventArgs e)
    {
        bind();
    }
    protected void GridView1_RowDeleting(object sender, GridViewDeleteEventArgs e)
    {
        string strconn = "Data Source=404-TEACHER;Initial Catalog=student;Integrated Security=True";
        SqlConnection conn = new SqlConnection(strconn);
        conn.Open();


        //int aa = e.RowIndex;

        string deleteuser = GridView1.DataKeys[e.RowIndex].Value.ToString();//获取主键
                
        string cmd = "delete from student_table where sname='" + deleteuser + "'";//
        SqlCommand cmdt = new SqlCommand(cmd, conn);

        try
        {
            cmdt.ExecuteNonQuery();
            Response.Write("<script>alert('删除成功！')</script>");
        }
        catch
        {
            return;
        }
        conn.Close();


        GridView1.EditIndex = -1;
        bind();
    }
}