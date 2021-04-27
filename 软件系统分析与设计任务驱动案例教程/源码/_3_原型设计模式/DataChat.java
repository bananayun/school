package _08_设计模式._3_原型设计模式;

import java.io.*;

/**
 * @Author Banana
 * @Date 2021/4/3 17:25
 */
public class DataChat implements Serializable {
    private DataSet dataSet  = null;
    private int no;
    private String color;
    public DataChat() {
        this.dataSet = new DataSet();
    }

    public Object deepClone() throws IOException, ClassNotFoundException, OptionalDataException
    {
        //将对象写入流中
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中取出
        ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return(ois.readObject());
    }

    public DataSet getDataSet() {
        return dataSet;
    }

    public void setDataSet(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display()
    {
        System.out.println("查看图表 --->图表编号为: "+this.getNo()+" 数据为: "+this.getDataSet().getData()+" 颜色:"+this.getColor());
    }

}
