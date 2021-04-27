package _08_设计模式._1_工厂模式_3;

/**
 * @Author Banana
 * @Date 2021/4/3 16:28
 */
public class IncomeFactory implements AbstractFactory{
    @Override
    public Sale CreateSale() {
        System.out.println("收入工厂生产销售单");
        return new Saleorder();
    }

    @Override
    public Purchase CreatePurchase() {
        System.out.println("收入工厂生产退货单");
        return new Returnorder();
    }

    @Override
    public Stock CreateStock() {
        System.out.println("收入工厂生产出库单");
        return new Outboundorder();
    }
}
