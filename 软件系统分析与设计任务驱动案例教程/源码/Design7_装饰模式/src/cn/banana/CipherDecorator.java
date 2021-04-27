package cn.banana;

/**
 * @Author Banana
 * @Date 2021/4/27 14:06
 */
public class CipherDecorator implements Cipher {
    private Cipher cipher;

    public CipherDecorator(Cipher cipher) {
        this.cipher = cipher;
    }

    @Override
    public String encrypt(String plainText) {
        return cipher.encrypt(plainText);
    }

}
