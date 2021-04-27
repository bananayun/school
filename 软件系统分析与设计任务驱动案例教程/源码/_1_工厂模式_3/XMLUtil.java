package _08_设计模式._1_工厂模式_3;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @Author Banana
 * @Date 2021/4/3 16:33
 */
public class XMLUtil {
    public static Object getBean() {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/_08_设计模式/_1_工厂模式_3/config.xml"));

            NodeList n1 = doc.getElementsByTagName("className");
            Node classNode = n1.item(0).getFirstChild();
            String cName = classNode.getNodeValue();
            System.out.println(cName);
            Class<?> c = Class.forName("_08_设计模式._1_工厂模式_3." + cName);
            Object obj = c.newInstance();
            return obj;
        }catch(Exception e){
            e.printStackTrace();
            return null;

        }
    }

}
