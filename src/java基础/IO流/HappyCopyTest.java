package java基础.IO流;

import java.io.*;

public class HappyCopyTest {

    public static void main(String[] args) {
        File parent = new File("C:\\projects\\crazyJava\\src\\java基础\\IO流");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(parent + "\\happy.jpg");
            fos = new FileOutputStream(parent + "\\happy_copy.jpg");
            byte[] copyArr = new byte[1024];
            int n;
            while ((n = fis.read(copyArr)) != -1) {
                // 从指定长度读取字节数组，不会发生多余空间复制问题
                fos.write(copyArr, 0, n);
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
