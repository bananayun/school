package _08_设计模式._2_建造者模式;

/**
 * @Author Banana
 * @Date 2021/4/3 17:09
 */
public class SpfPatternBuilder extends PatternBuilder {
    ///在精简模式下只显示主窗口和控制条
    public void bulidMenu() {
        product1.setMenu(" ");
    }

    public void bulidPlaylists() {
        product1.setPlaylists(" ");
    }

    public void bulidPrimeWindows() {
        product1.setPrimeWindows("主窗口");
    }

    public void bulidControlBar() {
        product1.setControlBar("控制条");
    }

    public void bulidcCollectLists() {
        product1.setEllectLists("");
    }
}
