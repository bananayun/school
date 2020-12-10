using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Background_Admin_Home : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        string judage=(string)Session["judage"];
        if (judage ==null)
        {
            Response.Redirect("Admin_login.aspx");
        }


    }
}