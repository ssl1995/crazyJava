package java基础.循环结构;

public class StarProgram {
    public static void main(String[] args) {
        // i:行数
        for (int i = 1; i <= 5; i++) {
            // j:每行前面的空格数
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            // k:每行的*数量
            for (int k = 1; k <= (i * 2 + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
