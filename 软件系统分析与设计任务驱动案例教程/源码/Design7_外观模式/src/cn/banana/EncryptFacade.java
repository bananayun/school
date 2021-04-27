package cn.banana;

/**
 * @Author Banana
 * @Date 2021/4/27 14:09
 */
public class EncryptFacade {
    private FileReader reader = new FileReader();
    private FileWriter writer = new FileWriter();
    private CipherMachine cipher = new CipherMachine();

    public EncryptFacade() {};

    public void Encrypt() {
        reader.read();
        cipher.encrypt();
        writer.write();

    }
}
