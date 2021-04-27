package cn.banana;

/**
 * @Author Banana
 * @Date 2021/4/27 14:41
 */
public class Light implements AlarmListener {

    @Override
    public void doSomeThing() {
        light();
    }

    public void light() {
        System.out.println("警示灯闪烁.....");
    }

}

