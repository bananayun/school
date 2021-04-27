package _08_设计模式._3_原型设计模式;

import java.io.Serializable;

/**
 * @Author Banana
 * @Date 2021/4/3 17:24
 */
public class DataSet implements Serializable {
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
