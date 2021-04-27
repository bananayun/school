package _08_设计模式._1_工厂模式;

/**
 * @Author Banana
 * @Date 2021/3/30 12:35
 */
public class UnsupportedShapException extends Throwable {
    private String message;
    public UnsupportedShapException(String message) {
        System.out.println(message);
    }

}
