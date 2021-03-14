package java基础.IO流;

import java.io.*;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file = new File("E:\\product\\crazyJava\\src\\java基础\\IO流\\demo.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            fis = new FileInputStream(file);
            // 默认是不追加写=之前的内容全部删除再写，这样非常不好
            // fos = new FileOutputStream(file);
            fos = new FileOutputStream(file, true);
            // 这一写，之前的文档里的内容全部删除了再想写
            fos.write('a');
            int n = 0;
            while ((n = fis.read()) != -1) {
                System.out.print((char) n);
            }
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
