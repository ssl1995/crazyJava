package java基础.循环结构;

public class FiveFactorial {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            int s = 1;
            for (int j = 1; j <= i; j++) {
                s *= j;
            }
            sum += s;
        }
        System.out.println("1到4的阶乘=" + sum);
    }
}
