package cn.banana;

/**
 * @Author Banana
 * @Date 2021/4/27 14:42
 */
public class InsulatedDoor implements AlarmListener {

    @Override
    public void doSomeThing() {
        close();
    }

    public void close() {
        System.out.println("隔热门将自动关闭....");
    }
}
