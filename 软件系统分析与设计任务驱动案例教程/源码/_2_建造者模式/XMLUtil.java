package _08_设计模式._2_建造者模式;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @Author Banana
 * @Date 2021/4/3 17:10
 */
public class XMLUtil {
    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getBean() {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/_08_设计模式/_2_建造者模式/config.xml"));

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            //System.out.println(nl.item(0));
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue();

            //System.out.println(cName);

            //通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
//            Class<?> clazz=Class.forName(cName);
//            Object obj=(AbstractLogFactory) clazz.newInstance();

            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
