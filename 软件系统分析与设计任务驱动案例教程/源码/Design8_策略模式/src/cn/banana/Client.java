package cn.banana;

/**
 * @Author Banana
 * @Date 2021/4/27 16:14
 */
public class Client {

    public static void main(String[] args) {
        Context con = new Context();
        Strategy stra;
        stra = (Strategy) XMLUtil.getBean();
        con.setStrategy(stra);
        con.favourable();
    }

}
