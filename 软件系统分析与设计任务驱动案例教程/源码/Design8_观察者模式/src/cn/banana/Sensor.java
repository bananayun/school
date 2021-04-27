package cn.banana;

import java.util.ArrayList;

/**
 * @Author Banana
 * @Date 2021/4/27 14:43
 */
public class Sensor {
    private double tem;
    private ArrayList<AlarmListener> alarmListeners = new ArrayList<AlarmListener>();

    public void add(AlarmListener lisenter) {
        this.alarmListeners.add(lisenter);
    }

    public void remove(AlarmListener lisenter) {
        this.alarmListeners.remove(lisenter);
    }

    public void testAlarm() {
        for (AlarmListener obj : alarmListeners) {
            obj.doSomeThing();
        }
    }

    public void setTem(double tem) {
        this.tem = tem;
    }

    public void sendMessage() {
        if (this.tem > 40.0) {
            testAlarm();
        } else {
            System.out.println("=========正常工作===========");
        }
    }

}
