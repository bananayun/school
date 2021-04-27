package _08_设计模式._2_建造者模式;

/**
 * @Author Banana
 * @Date 2021/4/3 17:05
 */
public class FullPatternBuilder extends PatternBuilder {
    //完整模式下将显示菜单、播放列表、主窗口、控制条

    public void bulidMenu() {
        product1.setMenu("菜单");
    }

    public void bulidPlaylists() {
        product1.setPlaylists("播放列表");
    }

    public void bulidPrimeWindows() {
        product1.setPrimeWindows("主窗口");
    }

    public void bulidControlBar() {
        product1.setControlBar(" ");

    }

    public void bulidcCollectLists() {
        product1.setEllectLists("");
    }

}
