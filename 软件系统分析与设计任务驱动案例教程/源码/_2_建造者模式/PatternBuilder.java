package _08_设计模式._2_建造者模式;

/**
 * @Author Banana
 * @Date 2021/4/3 17:04
 */
public abstract class PatternBuilder {
    protected Product product1 = new Product();


    public abstract void bulidMenu();

    public abstract void bulidPlaylists();

    public abstract void bulidPrimeWindows();

    public abstract void bulidControlBar();

    public abstract void bulidcCollectLists();

    public Product getProduct() {
        return product1;
    }
}
