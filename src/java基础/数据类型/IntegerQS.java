package java基础.数据类型;

public class IntegerQS {
    public static void main(String[] args) {
        Integer one = new Integer(100);
        Integer two = new Integer(200);
        Integer three = 100;
        Integer four = 100;
        Integer five = 200;
        Integer six = 200;
        // false,因为是new出来的2个实例肯定内存地址不一样
        System.out.println("one==tow:" + (one == two));
        // true,比较内容值
        System.out.println("three==100:" + (three == 100));
        // true,127内同用一个常量池内存
        System.out.println("three==four:" + (three == four));
        // true,比较内容值
        System.out.println("five==200:" + (five == 200));
        // false,127外不能同用一个内容值
        System.out.println("five==six:" + (five == six));
    }
}
