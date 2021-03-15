package java基础.IO流;

import java.io.*;

public class BufferInputStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File file = new File("C:\\projects\\crazyJava\\src\\java基础\\IO流\\demo.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            fis = new FileInputStream(file);
            fos = new FileOutputStream(file, true);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            // 缓冲输出流是将数据写入一个不可见的字节数组中=不是直接就写入了
            bos.write('b');
            // 如果不flush/close是不追真正的写入的
            bos.flush();
            int n = 0;
            while ((n = bis.read()) != -1) {
                System.out.print((char) n);
            }
            bis.close();
            // close默认是会flush的，但是好习惯是flush也加上
            bos.close();
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
