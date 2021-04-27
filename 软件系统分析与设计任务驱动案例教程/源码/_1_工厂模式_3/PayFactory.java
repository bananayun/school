package _08_设计模式._1_工厂模式_3;

/**
 * @Author Banana
 * @Date 2021/4/3 16:29
 */
public class PayFactory implements AbstractFactory{
    @Override
    public Sale CreateSale() {
        System.out.println("支出工厂生产退款单");
        return new Refundorder();
    }

    @Override
    public Purchase CreatePurchase() {
        System.out.println("支出工厂生产采购单");
        return new Purchaseorder();
    }

    @Override
    public Stock CreateStock() {
        System.out.println("支出工厂生产入库单");
        return new Entryorder();
    }
}
