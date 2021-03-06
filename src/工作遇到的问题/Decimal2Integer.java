package 工作遇到的问题;

import java.text.NumberFormat;

public class Decimal2Integer {
    public static void main(String[] args) {
        Double decimal = 0.05/100000;
        NumberFormat format = NumberFormat.getInstance();
        format.setMinimumFractionDigits(7);
        String res =format.format(decimal);
        System.out.println(res);
    }
}