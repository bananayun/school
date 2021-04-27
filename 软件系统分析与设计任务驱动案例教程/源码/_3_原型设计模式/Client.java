package _08_设计模式._3_原型设计模式;

/**
 * @Author Banana
 * @Date 2021/4/3 17:26
 */
public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DataChat dataChat = new DataChat();
        //初始化图表的编号、颜色和数据
        dataChat.getDataSet().setData(1111);
        dataChat.setColor("black");
        dataChat.setNo(12301);
        dataChat.display();

        DataChat copyDataChat = null;
        try {
            copyDataChat = (DataChat)dataChat.deepClone();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        /* copyDataChat.display();*/
        System.out.println("用户修改新图表的编号、颜色和数据");
        copyDataChat.getDataSet().setData(2222);
        copyDataChat.setNo(10086);
        copyDataChat.setColor("green");
        copyDataChat.display();
    }

}
