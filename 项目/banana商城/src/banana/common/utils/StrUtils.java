package banana.common.utils;

public class StrUtils {
    //true 空，false 非空
    public static boolean empty(String...msg){
        boolean res = false;
        for (String s : msg) {
            res = (s == null || s.length() == 0);
            if (res)
                break;
        }
        return res;
    }
}