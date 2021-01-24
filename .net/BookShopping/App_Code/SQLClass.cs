using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;

/// <summary>
///SQLClass 的摘要说明
/// </summary>
public class SQLClass
{
    private string strcon;
    private static SqlConnection SqlCon;
    public SQLClass()
    {
        strcon = "data Source=App_Data;server=localhost;database=BookShop;" +
                       "integrated security=SSPI";
        SqlCon = new SqlConnection(ConfigurationManager.AppSettings["GetCon"]);;
        //
        //TODO: 在此处添加构造函数逻辑
        //
    }
    public bool sqlSelect(string sql)
    {
        SqlDataAdapter da = new SqlDataAdapter(sql,SqlCon);
        DataSet ds = new DataSet();
        int count = da.Fill(ds,"table");
        return count > 0;
    }
    public bool sqlExec(string sql)
    {
        SqlCon.Open();
        try
        {
            SqlCommand OledbCom = new SqlCommand(sql, SqlCon);
            return OledbCom.ExecuteNonQuery() == 1;
        }
        finally
        {
            SqlCon.Close();
        }

    }
}