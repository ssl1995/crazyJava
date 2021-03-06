package java基础.循环结构;

public class MultiTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.print(i + "*" + j + "=" + (i * j));
                } else {
                    System.out.print(i + "*" + j + "=" + (i * j) + ",\t");
                }
            }
            System.out.println();
        }
    }
}
