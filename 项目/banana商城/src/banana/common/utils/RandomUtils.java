package banana.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

public class RandomUtils {
    //生成激活码
    public static String createActive(){
        //时间+100~1000的十六进制随机数
        return getTime() + Integer.toHexString(new Random().nextInt(900)+100);
    }
    //生成订单号
    public static String createOrderId(){
        return getTime() + UUID.randomUUID().toString();
    }

    //设置时间格式
    private static String getTime() {
        SimpleDateFormat s = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        return s.format(Calendar.getInstance().getTime());
    }
}
