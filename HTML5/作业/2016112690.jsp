<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.util.Date"%>
<%@ page import="javax.servlet.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="net.sf.json.JSON"%>
<%@ page import="net.sf.json.JSONObject"%>
<%@ page import="net.sf.json.JSONArray"%>
<%@ page import="net.sf.json.xml.XMLSerializer"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.awt.image.BufferedImage"%>

<%@ page import="java.net.URLDecoder,java.net.URLEncoder" %>
<%@ page import="java.nio.charset.StandardCharsets" %>
<%@ page import="javax.servlet.http.*"%>
<%@ page import = "org.apache.commons.fileupload.*" %>
<%@ page import = "org.apache.commons.fileupload.disk.*" %>
<%@ page import = "org.apache.commons.fileupload.servlet.*" %>
<%@ page import = "org.apache.commons.io.output.*" %>
<%@ page import="org.apache.commons.io.FilenameUtils"%>
<%
if  (request.getMethod().indexOf("POST") < 0)  {
  out.write("请从系统进入");
  //response.sendRedirect("/");
  out.flush();out.close();
}

         out.println("<html >");
         out.println("<head>");
         out.println("<title>JSP File upload</title>");  
         out.println("</head>");
         out.println("<body>");
                  out.print("当前毫秒值: " );
                  out.print( String.valueOf((new Date()).getTime()));
				  out.print("毫秒");
                  out.print("<br>");
     out.write("=======================request.getParameterNames======================<br>");
     Enumeration enumeration = request.getParameterNames();
     //Map<String, Object> modelMap = new HashMap<>();
     while(enumeration.hasMoreElements()){
       String parameterName = enumeration.nextElement().toString();
       //modelMap.put(parameterName, request.getParameter(parameterName));
       String value = request.getParameter(parameterName);
       //value = new String(value.getBytes("UTF-8"), "ISO-8859-1");
       value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
           out.print(parameterName +" : " );
           out.print(value );
           out.print( "<br>");
	 }
	   
  out.print( "<br>");
  out.print( "<br>");
	   
String Student_Method = request.getParameter("method");


//'------  取得資料 --------
  String mDBbigint_Student_SchoolSerialNo = request.getParameter("mDBbigint_Student_SchoolSerialNo");    
  //'--SchoolSerialNo
  
  if (mDBbigint_Student_SchoolSerialNo != null)
    mDBbigint_Student_SchoolSerialNo      = URLDecoder.decode(mDBbigint_Student_SchoolSerialNo); 
	else mDBbigint_Student_SchoolSerialNo="";
  String mDBnvarchar_Student_Name         = request.getParameter("mDBnvarchar_Student_Name");            
  // '--SName
  if (mDBnvarchar_Student_Name         != null)
    mDBnvarchar_Student_Name              = URLDecoder.decode(mDBnvarchar_Student_Name); 
	else mDBnvarchar_Student_Name="";
  String mDBnvarchar_Student_gender       = request.getParameter("mDBnvarchar_Student_gender");          
  // '--性别
  if (mDBnvarchar_Student_gender       != null)
    mDBnvarchar_Student_gender            = URLDecoder.decode(mDBnvarchar_Student_gender); 
	else mDBnvarchar_Student_gender="";
  String mDBnvarchar_Student_Birth        = request.getParameter("mDBnvarchar_Student_Birth");           
  // '--生日
  if (mDBnvarchar_Student_Birth        != null)
    mDBnvarchar_Student_Birth             = mDBnvarchar_Student_Birth; else mDBnvarchar_Student_Birth="";
  String mDBnvarchar_Student_PicA         = request.getParameter("mDBnvarchar_Student_PicA");                                                                                    //'Replace(trim(]request.getAttribute("mDBnvarchar_Student_PicA").toString()),request.getRealPath("/"),"")                                                                                       //'--照片
  String mDBnvarchar_Student_PicB         = request.getParameter("mDBnvarchar_Student_PicB");            
  //'--照片
  String mDBnvarchar_Student_Pic          = "";                                                                                     //'          = mDBnvarchar_Student_PicA + "," + mDBnvarchar_Student_PicB                                                                                        //'--照片
out.print("学生名字  = ");
 out.print(mDBnvarchar_Student_Name);  out.print("<br/>"); 

out.print("性别  = ");
out.print(mDBnvarchar_Student_gender);  out.print("<br/>");
out.print("生日  = ");
 out.print(mDBnvarchar_Student_Birth);  out.print("<br/>");
out.print("Student_Method  = ");
 out.print(Student_Method);  out.print("<br/>");
out.print("头像  = ");
 out.print(mDBnvarchar_Student_PicA); 
  out.print("<br/>");
  
	   
	  
      out.println("<p>No file uploaded</p>"); 
   
   
         out.println("</body>");
         out.println("</html>");
		 
%>



