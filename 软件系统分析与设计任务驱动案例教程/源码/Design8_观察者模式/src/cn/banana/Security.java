package cn.banana;

/**
 * @Author Banana
 * @Date 2021/4/27 14:42
 */
public class Security implements AlarmListener {

    @Override
    public void doSomeThing() {
        open();
    }

    public void open() {
        System.out.println("安全逃生门将自动开启.....");
    }

}
