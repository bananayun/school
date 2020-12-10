using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class b : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        //Label1.Text = Request.QueryString["class1"];
        //Label1.Text = Session["name"].ToString();
        //Label1.Text = Request.Cookies["myCookie"].Value;

        Label1.Text = Application["name"].ToString(); 

    }
}