package java基础.IO流;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        // mkdirs生成一个多级目录
        File crazyJava = new File("E:\\Java\\markdown_notes\\crazyJava");
        if (!crazyJava.exists()) {
            crazyJava.mkdirs();
        }
        // createNewFile创建一个文件，执行后缀为txt
        File ioTxt = new File(crazyJava, "io.txt");
        if (!ioTxt.exists()) {
            try {
                ioTxt.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
