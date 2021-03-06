package java基础.图形化.swing.format;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DecimalFormatTest {
    public static void main(String[] args) {
        //创建一个默认的通用格式
        NumberFormat numberFormat = NumberFormat.getInstance();
        DecimalFormat numberDecimalFormat;
        //捕捉异常，以防强制类型转换出错
        try {
            //强制转换成DecimalFormat
            numberDecimalFormat = (DecimalFormat) numberFormat;
            //保留小数点后面三位，不足的补零,前面整数部分 每隔四位 ，用 “,” 符合隔开
            numberDecimalFormat.applyPattern("#,####.000");
            //设置舍入模式 为DOWN,否则默认的是HALF_EVEN
            numberDecimalFormat.setRoundingMode(RoundingMode.DOWN);
            //设置 要格式化的数 是正数的时候。前面加前缀
            numberDecimalFormat.setPositivePrefix("Prefix  ");
            System.out.println("正数前缀  " + numberDecimalFormat.format(123456.7891));
            //设置 要格式化的数 是正数的时候。后面加后缀
            numberDecimalFormat.setPositiveSuffix("  Suffix");
            System.out.println("正数后缀  " + numberDecimalFormat.format(123456.7891));
            //设置整数部分的最大位数
            numberDecimalFormat.setMaximumIntegerDigits(3);
            System.out.println("整数最大位数 " + numberDecimalFormat.format(123456.7891));
            //设置整数部分最小位数
            numberDecimalFormat.setMinimumIntegerDigits(3);
            System.out.println("整数最小位数 " + numberDecimalFormat.format(123456.7891));
            //设置小数部分的最大位数
            numberDecimalFormat.setMaximumFractionDigits(2);
            System.out.println("小数部分最大位数 " + numberDecimalFormat.format(123.4));
            //设置小数部分的最小位数
            numberDecimalFormat.setMinimumFractionDigits(2);
            System.out.println("小数部分最小位数 " + numberDecimalFormat.format(123.4));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
