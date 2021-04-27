package _08_设计模式._1_工厂模式;

/**
 * @Author Banana
 * @Date 2021/3/30 12:41
 */
public class Triangle implements Shape {
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("画一个三角形！");
    }

    @Override
    public void erase() {
        // TODO Auto-generated method stub
        System.out.println("擦除三角形！");
    }

}
