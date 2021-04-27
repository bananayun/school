package _08_设计模式._2_建造者模式;

/**
 * @Author Banana
 * @Date 2021/4/3 17:09
 */
public class RedRum {
    private PatternBuilder patternBuilder;

    public void setPatternBulider(PatternBuilder patternBuilder) {
        this.patternBuilder = patternBuilder;
    }

    public Product construct() {
        patternBuilder.bulidMenu();
        patternBuilder.bulidPrimeWindows();
        patternBuilder.bulidPlaylists();
        patternBuilder.bulidControlBar();
        patternBuilder.bulidcCollectLists();
        return patternBuilder.getProduct();
    }

}
