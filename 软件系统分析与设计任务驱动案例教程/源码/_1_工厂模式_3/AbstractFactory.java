package _08_设计模式._1_工厂模式_3;

/**
 * @Author Banana
 * @Date 2021/4/3 16:20
 */
public interface AbstractFactory {
    public Sale CreateSale();
    public Purchase CreatePurchase();
    public Stock CreateStock();
}
