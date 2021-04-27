package cn.banana;

/**
 * @Author Banana
 * @Date 2021/4/27 16:12
 */
public class Nofavourable implements Strategy {
    @Override
    public void favourable() {
        System.out.println("没有折扣！");
    }
}
