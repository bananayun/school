package _08_设计模式._1_工厂模式_2;

/**
 * @Author Banana
 * @Date 2021/3/30 14:10
 */
public class ConsoleLog extends AbstractLogRecord{
    @Override
    public void say() {
        System.out.println("控制台日志记录！");
    }
}
