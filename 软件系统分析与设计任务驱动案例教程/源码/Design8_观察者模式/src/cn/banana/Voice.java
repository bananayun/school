package cn.banana;

/**
 * @Author Banana
 * @Date 2021/4/27 14:43
 */
public class Voice implements AlarmListener {

    @Override
    public void doSomeThing() {
        alarm();
    }

    public void alarm() {
        System.out.println("报警器发出警报....");
    }
}
