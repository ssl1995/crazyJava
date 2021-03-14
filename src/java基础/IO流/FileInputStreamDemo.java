package java基础.IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream demoTxt = null;
        try {
            File file = new File("E:\\product\\crazyJava\\src\\java基础\\IO流\\demo.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            demoTxt = new FileInputStream(file);
            // read()一次只能读取一个字符
            int n = 0;
            while ((n = demoTxt.read()) != -1) {
                // 但是遇到中文字符就会出现乱码
                System.out.print((char) n);
            }
            demoTxt.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
