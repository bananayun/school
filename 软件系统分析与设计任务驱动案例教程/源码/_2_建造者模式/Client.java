package _08_设计模式._2_建造者模式;

/**
 * @Author Banana
 * @Date 2021/4/3 17:10
 */
public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PatternBuilder pBuilder = (PatternBuilder)XMLUtil.getBean();
        RedRum redRum = new RedRum();
        redRum.setPatternBulider(pBuilder);
        Product product1 = redRum.construct();

        // System.out.println("完整模式下将显示菜单、播放列表、主窗口、控制条");
        // System.out.println("精简模式下只显示主窗口和控制条");
        System.out.println("忆模式下将显示主窗口、控制条、收藏列表");
        System.out.println(product1.getControlBar());
        System.out.println(product1.getEllectLists());
        System.out.println(product1.getMenu());
        System.out.println(product1.getPrimeWindows());
        System.out.println(product1.getPlaylists());
    }

}
