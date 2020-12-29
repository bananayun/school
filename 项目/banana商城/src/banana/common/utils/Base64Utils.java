package banana.common.utils;

import java.util.Base64;

public class Base64Utils {
    //编码
    public static String encode(String msg){
        //获取一个编码器，进行编码
        return Base64.getEncoder().encodeToString(msg.getBytes());
    }
    //解码
    public static String decode(String msg){
        //获取一个解码器，进行解码，并转为字符串
        return new String(Base64.getDecoder().decode(msg));
    }
}
