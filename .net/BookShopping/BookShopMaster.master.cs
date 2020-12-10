using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class BookShopMaster : System.Web.UI.MasterPage
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (Session["UserName"] != null)
        {
            HyperLink1.Text = (string)Session["UserName"];
            HyperLink2.Text = "　　注销";
            HyperLink2.NavigateUrl = "~/Default.aspx";
            
        }
    }
    protected void SeekBtn_Click(object sender, ImageClickEventArgs e)
    {
        Response.Redirect("GPSPanel.aspx?BookName=" + SeekText.Text);
    }
}
