package cn.banana;

/**
 * @Author Banana
 * @Date 2021/4/27 16:13
 */
public class Context {
    protected Strategy str;

    public void setStrategy(Strategy stra) {
        this.str = stra;
    }

    public void favourable() {
        str.favourable();
    }

}
