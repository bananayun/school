package cn.banana;

/**
 * @Author Banana
 * @Date 2021/4/27 14:07
 */
public class AdvancedCipher extends CipherDecorator {
    public AdvancedCipher(Cipher cipher) {
        super(cipher);
    }

    public String encrypt(String plainText) {
        String result = super.encrypt(plainText);
        result = mod(result);
        return result;
    }

    public String mod(String text) {
        String str = " ";
        for (int i = 0; i < text.length(); i++) {
            String cString = String.valueOf(text.charAt(i) % 6);
            str += cString;
        }
        return str;
    }
}
