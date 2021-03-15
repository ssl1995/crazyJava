package java基础.IO流;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamReadAndWriter {
    public static void main(String[] args) {
        File parent = new File("C:\\projects\\crazyJava\\src\\java基础\\IO流");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        InputStreamReader iso = null;
        OutputStreamWriter osw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            fis = new FileInputStream(parent + "\\demo.txt");
            // 读文件的时候，最好指定为追加模式
            fos = new FileOutputStream(parent + "\\demo1.txt", true);
            // 输入输出的时候指定编码格式，防止出现乱码问题
            iso = new InputStreamReader(fis, StandardCharsets.UTF_8);
            osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            br = new BufferedReader(iso);
            bw = new BufferedWriter(osw);
            char[] cs = new char[10];
            int len = 0;
            while ((len = br.read(cs)) != -1) {
                bw.write(cs, 0, len);
            }
            bw.flush();
            osw.close();
            iso.close();
            fos.close();
            fis.close();
            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
