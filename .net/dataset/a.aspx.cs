using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class a : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        //string s_url;

        //s_url = "b.aspx?class1=" + Label1.Text;

        //Session["name"] = Label1.Text;
        //string str = Label1.Text;

        //HttpCookie objCookie = new HttpCookie("myCookie", str);
        //Response.Cookies.Add(objCookie);

        Application["name"] = Label1.Text; 


        Response.Redirect("b.aspx");
    }
}