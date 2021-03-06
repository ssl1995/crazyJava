package java基础.循环结构;

public class DigitProgram {
    public static void main(String[] args) {
        int ge;
        int shi;
        int bai;
        for (int i = 200; i <= 300; i++) {
            // 个位
            ge = i % 10;
            // 十位
            shi = i / 10 % 10;
            // 百位
            bai = i / 100;
            if ((ge + shi + bai) == 12 && (ge * shi * bai == 42)) {
                System.out.println(i);
            }
        }
    }
}
