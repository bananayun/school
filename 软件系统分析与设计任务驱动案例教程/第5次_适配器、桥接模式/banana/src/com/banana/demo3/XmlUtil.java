package com.banana.demo3;

import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class XmlUtil {
	//配置文件读取处理类
    public static Object getBean(String args)
    {
    
        try{
        //创建一个文档对象
            DocumentBuilderFactory  dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
          
            Document doc=builder.parse(new File("src/com/banana/demo3/config.xml"));
       
            //获取包含类名的文本节点
            NodeList n1=doc.getElementsByTagName("className");
            Node classnode = null;
            String className=null;
          
            if(args.equals("OutPut"))
            {
                classnode=n1.item(0).getFirstChild();
            }else if(args.equals("OperatingSystem"))
            {
                classnode=n1.item(1).getFirstChild();
            }else if(args.equals("EncodingLanguage"))
            {
                classnode=n1.item(2).getFirstChild();
            }
            className=classnode.getNodeValue();
            
            //通过类名生成实例对象并将其返回
            Class c=Class.forName(className);
            Object obj=c.newInstance();
            return obj;
        }catch(Exception e)
        {
            e.getStackTrace();
            return null;
        }

    }

}
