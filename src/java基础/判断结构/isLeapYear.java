package java基础.判断结构;

import java.util.Scanner;

public class isLeapYear {
    public static void main(String[] args) {
        System.out.println("请输入一个年份：");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
