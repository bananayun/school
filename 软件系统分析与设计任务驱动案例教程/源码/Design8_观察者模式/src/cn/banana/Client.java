package cn.banana;

/**
 * @Author Banana
 * @Date 2021/4/27 14:44
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("==========机房监控系统开启=========");
        Voice Voice = new Voice();
        InsulatedDoor InsulatedDoor = new InsulatedDoor();
        Light Light = new Light();
        Security SecrurityDoor = new Security();
        //传感器
        Sensor Sensor = new Sensor();
        //添加设备
        Sensor.add(SecrurityDoor);
        Sensor.add(Light);
        Sensor.add(InsulatedDoor);
        Sensor.add(Voice);
        //响应
        Sensor.setTem(30.0);
        Sensor.sendMessage();
        System.out.println("\n\n=============温度过高， 使系统出现故障============");
        Sensor.setTem(50.0);
        Sensor.sendMessage();
    }
}
