package _08_设计模式._1_工厂模式;

/**
 * @Author Banana
 * @Date 2021/3/30 12:37
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆形！");
    }

    @Override
    public void erase() {
        System.out.println("擦除圆形！");
    }
}
