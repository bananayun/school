package _08_设计模式._1_工厂模式;

/**
 * @Author Banana
 * @Date 2021/3/30 12:36
 */
public class ShapeFactory {
    public Shape createShape(String type) throws UnsupportedShapException {
        if(type.equals("Circle"))
            return new Circle();
        else if(type.equals("Rectangle"))
            return new Rectangle();
        else if(type.equals("Triangle"))
            return new Triangle();
        else {
            throw  new UnsupportedShapException("该系统不会画此种图形！");
        }
    }

    public static void main(String[] args) throws UnsupportedShapException {
        // TODO Auto-generated method stub
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.createShape("Circle").draw();
        shapeFactory.createShape("Circle").erase();

        shapeFactory.createShape("Rectangle").draw();
        shapeFactory.createShape("Rectangle").erase();

        shapeFactory.createShape("Triangle").draw();
        shapeFactory.createShape("Triangle").erase();

        shapeFactory.createShape("Square").draw();
    }


}
