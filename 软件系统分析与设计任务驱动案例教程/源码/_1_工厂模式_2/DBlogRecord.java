package _08_设计模式._1_工厂模式_2;

/**
 * @Author Banana
 * @Date 2021/3/30 13:39
 */
public class DBlogRecord extends AbstractLogRecord{
    @Override
    public void say() {
        System.out.println("数据库日志记录！");
    }
}
