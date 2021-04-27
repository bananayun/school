package _08_设计模式._1_工厂模式_2;

/**
 * @Author Banana
 * @Date 2021/3/30 14:11
 */
public class ConsoleFactory extends AbstractLogFactory{
    @Override
    public AbstractLogRecord getLogMethod() {
        return new ConsoleLog();
    }
}
