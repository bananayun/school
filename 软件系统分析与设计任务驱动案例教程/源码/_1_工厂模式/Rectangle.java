package _08_设计模式._1_工厂模式;

/**
 * @Author Banana
 * @Date 2021/3/30 12:39
 */

public class Rectangle implements Shape {

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("画一个矩形！");
    }

    @Override
    public void erase() {
        // TODO Auto-generated method stub
        System.out.println("擦除矩形！");
    }

}

