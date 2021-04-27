package _08_设计模式._1_工厂模式_3;

/**
 * @Author Banana
 * @Date 2021/4/3 16:34
 */
public class Client {
    public static void main(String args[]) {
        try {
            Sale sale;
            Purchase purchase;
            Stock stock;

            AbstractFactory abstractFactory;
            abstractFactory = (AbstractFactory) XMLUtil.getBean();
            sale = abstractFactory.CreateSale();
            sale.BySale();
            purchase = abstractFactory.CreatePurchase();
            purchase.ByPurchase();
            stock = abstractFactory.CreateStock();
            stock.ByStock();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
