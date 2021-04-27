package _08_设计模式._1_工厂模式_2;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @Author Banana
 * @Date 2021/3/30 13:11
 */
public class XMLUtil {
    //该方法用于从XML配置文件中提取具体类名，并返回一个实例
    public static Object getBean(){
        //创建DOM文档对象
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(new File("src/_08_设计模式/_1_工厂模式_2/Config.xml"));

            //获取包含类名的文本节点
            NodeList n1 = document.getElementsByTagName("className");
            Node className = n1.item(0).getFirstChild();
            String cNameString = className.getNodeValue();

            System.out.println(cNameString);
            //通过类名生成实例对象并返回,此处要用准确路径"_08_设计模式._1_工厂模式_2.FileLogFactory"
            Class c = Class.forName("_08_设计模式._1_工厂模式_2." + cNameString);
            //Class c = Class.forName(cNameString);
            Object object = c.newInstance();

            return object;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
