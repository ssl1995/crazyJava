package java基础.异常;

import java.util.Scanner;

public class FinallyDemo {

    public static void main(String[] args) {
        int res = test();
        System.out.println("res:" + res);
    }

    /**
     * finally中如果有return，那么就会屏蔽掉其他语句块中的return
     * 建议不要在finally中使用return
     */
    private static int test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----运算开始------");
        try {
            System.out.println("请输入第一个整数：");
            int one = sc.nextInt();
            System.out.println("请输入第二个整数：");
            int two = sc.nextInt();
            return one / two;
        } catch (ArithmeticException e) {
            System.out.println("除数不允许为零");
            return -1;
        } finally {
            System.out.println("-----finally------");
            return -100;
        }
    }
}
