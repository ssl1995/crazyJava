package java基础.IO流;

public class Demo {
    public static void method() {
        try {
            System.out.println("进入到try块");
            return;
        } catch (Exception e) {
            System.out.println("异常发生了");
        } finally {
            System.out.println("进入到finally块");
        }
        System.out.println("后续代码");
    }

    public static void main(String[] args) {
        method();
    }
}
