<%@ Page Language="C#" AutoEventWireup="true" CodeFile="BookMinute.aspx.cs" Inherits="GPSContent_BookMinute" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ Register Src="~/content/BookMinute.ascx" TagName="BookMinuteAdds" TagPrefix="bm" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <bm:BookMinuteAdds runat="server">
        </bm:BookMinuteAdds>
    </div>
    </form>
</body>
</html>
