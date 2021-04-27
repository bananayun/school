package _08_设计模式._1_工厂模式_2;

/**
 * @Author Banana
 * @Date 2021/3/30 13:38
 */
public class MainClass {
    public static void main(String[] args) {

        AbstractLogFactory factory = (AbstractLogFactory)XMLUtil.getBean();
        AbstractLogRecord logRecordMethod = factory.getLogMethod();
        logRecordMethod.say();
    }

}
