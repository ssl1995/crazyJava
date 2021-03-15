package java基础.IO流;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) {
        File parent = new File("C:\\projects\\crazyJava\\src\\java基础\\IO流");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        // 序列化:把Java对象转化成字节序列的过程，必须实现Serializable接口才能被序列化
        Good goods = new Good(1, "电脑");
        try {
            fos = new FileOutputStream(parent + "\\goods.txt");
            oos = new ObjectOutputStream(fos);
            fis = new FileInputStream(parent + "\\goods.txt");
            ois = new ObjectInputStream(fis);
            // 将对象写进文件中
            oos.writeObject(goods);
            oos.flush();
            Good goods1 = (Good) ois.readObject();
            System.out.println(goods1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
