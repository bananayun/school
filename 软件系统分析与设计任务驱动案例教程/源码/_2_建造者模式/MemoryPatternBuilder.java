package _08_设计模式._2_建造者模式;

/**
 * @Author Banana
 * @Date 2021/4/3 17:08
 */
public class MemoryPatternBuilder extends PatternBuilder {
    /// 记忆模式下将显示主窗口、控制条、收藏列表
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
        product1.setEllectLists("收藏列表");
    }

}
