<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.util.Date"%>
<%@ page import="javax.servlet.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="net.sf.json.JSON"%>
<%@ page import="net.sf.json.JSONObject"%>
<%@ page import="net.sf.json.JSONArray"%>
<%@ page import="net.sf.json.xml.XMLSerializer"%>
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
  out.write("請從系统進入");
  //response.sendRedirect("/");
  out.flush();out.close();
}
String PrgID = "Student";

//'=========  系統變數  ==============================

String Student_Method="", mNewTime,SQLStr="";

  
    //out.flush();out.close();
  
  
         out.println("<html >");
         out.println("<head>");
         out.println("<title>JSP File upload</title>");  
         out.println("</head>");
         out.println("<body>");
                  out.print("String.valueOf((new Date()).getTime()) : " );
                  out.print( String.valueOf((new Date()).getTime()));
                  out.print("<br>");
		 
		 
   File file ;
   int maxFileSize = 5*1024 * 1024;//5M bytes
   int maxMemSize = 5000 * 1024;
   ServletContext context = pageContext.getServletContext();
   //upload 存放位置
   String filePath = request.getRealPath("/Student/");//context.getInitParameter("mDBnvarchar_Student_PicA");
 File dir = new File(filePath);
 if(!dir.exists()) dir.mkdirs();
   // Verify the content type
   String contentType = request.getContentType();
   
   if ((contentType.indexOf("multipart/form-data") >= 0)) {
      DiskFileItemFactory factory = new DiskFileItemFactory();
      // maximum size that will be stored in memory
      factory.setSizeThreshold(maxMemSize);
      
      // Location to save data that is larger than maxMemSize.
      //factory.setRepository(new File("d:\\temp"));
      factory.setRepository(new File(request.getRealPath("/Student/")));

      // Create a new file upload handler
      ServletFileUpload upload = new ServletFileUpload(factory);
      
      // maximum file size to be uploaded.
      upload.setSizeMax( maxFileSize );
      
      try { 
         // Parse the request to get file items.
         List fileItems = upload.parseRequest(request);

         // Process the uploaded file items
         Iterator i = fileItems.iterator();

         out.write("=======================multipart/form-data======================<br>");
         while ( i.hasNext () ) {
            FileItem fi = (FileItem)i.next();
            String fieldName = fi.getFieldName();
			
            if ( !fi.isFormField () ) {
               // Get the uploaded file parameters
               String fileName = fieldName+ String.valueOf((new Date()).getTime());             //fi.getName();
               boolean isInMemory = fi.isInMemory();
               long sizeInBytes = fi.getSize();
            
               // Write the file
               String fileNamegetName = fi.getName();
                fileName = fieldName + 
		                  String.valueOf((new Date()).getTime()) + 
					   fileNamegetName.substring(fileNamegetName.length() - 4 ); //fi.getName();
               file = new File( filePath + fileName) ;
			   fi.write( file ) ;
               out.println("Uploaded Filename: " + filePath + 
               fileName + "<br>");
               out.println("<img src='" + "/Student/" + 
               fileName + "'><br>");
		     if (isInMemory)
                  out.println("isInMemory: " + fieldName + 
                "<br>");
                  out.print("sizeInBytes: " );
                  out.print( sizeInBytes);
                  out.print(          "<br>");
             }
		   else{
			
			String value = fi.getString();
                //value = new String(value.getBytes("UTF-8"), "ISO-8859-1");
                value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
			 
               out.println("fieldName===== " + fieldName );	
               out.println(" value== " + value + 
                "<br>");	
			}
         }
      } catch(Exception ex) {
         out.println(ex);
      }
   } else {
	   
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
  out.print( "<br>");
  out.print( "<br>");
  out.print( "<br>");
	   
Student_Method = request.getParameter("method");
//'============================ New  ===============================================

//'------  取得資料 --------


  String mDBbigint_Student_SchoolSerialNo = request.getParameter("mDBbigint_Student_SchoolSerialNo");    //'--SchoolSerialNo
  if (mDBbigint_Student_SchoolSerialNo != null)
    mDBbigint_Student_SchoolSerialNo      = URLDecoder.decode(mDBbigint_Student_SchoolSerialNo); else mDBbigint_Student_SchoolSerialNo="";
  String mDBnvarchar_Student_Name         = request.getParameter("mDBnvarchar_Student_Name");            // '--SName
  if (mDBnvarchar_Student_Name         != null)
    mDBnvarchar_Student_Name              = URLDecoder.decode(mDBnvarchar_Student_Name); else mDBnvarchar_Student_Name="";
  String mDBnvarchar_Student_gender       = request.getParameter("mDBnvarchar_Student_gender");          // '--性别
  if (mDBnvarchar_Student_gender       != null)
    mDBnvarchar_Student_gender            = URLDecoder.decode(mDBnvarchar_Student_gender); else mDBnvarchar_Student_gender="";
  String mDBnvarchar_Student_Birth        = request.getParameter("mDBnvarchar_Student_Birth");           // '--生日
  if (mDBnvarchar_Student_Birth        != null)
    mDBnvarchar_Student_Birth             = mDBnvarchar_Student_Birth; else mDBnvarchar_Student_Birth="";
  String mDBnvarchar_Student_PicA         = request.getParameter("mDBnvarchar_Student_PicA");                                                                                    //'Replace(trim(]request.getAttribute("mDBnvarchar_Student_PicA").toString()),request.getRealPath("/"),"")                                                                                       //'--照片
  String mDBnvarchar_Student_PicB         = request.getParameter("mDBnvarchar_Student_PicB");            //'--照片
  String mDBnvarchar_Student_Pic          = "";                                                                                     //'          = mDBnvarchar_Student_PicA + "," + mDBnvarchar_Student_PicB                                                                                        //'--照片
  
  
  
  
  
out.print("mDBnvarchar_Student_PicA  = ");
 out.print(mDBnvarchar_Student_PicA);  out.print("<br/>");
   
out.print("mDBnvarchar_Student_Birth  = ");
 out.print(mDBnvarchar_Student_Birth);  out.print("<br/>");
out.print("Student_Method  = ");
 out.print(Student_Method);  out.print("<br/>");
out.print("mDBnvarchar_Student_Name  = ");
 out.print(mDBnvarchar_Student_Name);  out.print("<br/>");
  
	   
	  
      out.println("<p>No file uploaded</p>"); 
   } 
   
         out.println("</body>");
         out.println("</html>");
		 
%>



