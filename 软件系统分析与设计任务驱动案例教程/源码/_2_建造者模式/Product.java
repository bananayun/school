package _08_设计模式._2_建造者模式;

/**
 * @Author Banana
 * @Date 2021/4/3 17:02
 */
public class Product {
    private String menu;
    private String playlists;
    private String primeWindows;
    private String controlBar;
    private String ellectLists;
    public String getMenu() {
        return menu;
    }
    public void setMenu(String menu) {
        this.menu = menu;
    }
    public String getPlaylists() {
        return playlists;
    }
    public void setPlaylists(String playlists) {
        this.playlists = playlists;
    }
    public String getPrimeWindows() {
        return primeWindows;
    }
    public void setPrimeWindows(String primeWindows) {
        this.primeWindows = primeWindows;
    }
    public String getControlBar() {
        return controlBar;
    }
    public void setControlBar(String controlBar) {
        this.controlBar = controlBar;
    }
    public String getEllectLists() {
        return ellectLists;
    }
    public void setEllectLists(String ellectLists) {
        this.ellectLists = ellectLists;
    }
}
