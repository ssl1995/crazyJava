package java基础.数据类型;

public class String2Double {
    public static void main(String[] args) {
        double a = 12.5;
        //将基本类型转换为字符串
        String str1 = String.valueOf(a);
        System.out.println("a 转换为String型后+10的结果为： " + str1);
        String str = "2.8";
        // 将字符串转换为基本类型
        double b = Double.parseDouble(str);
        System.out.println("str 转换为double型后+10的结果为： " + b);

    }
}
