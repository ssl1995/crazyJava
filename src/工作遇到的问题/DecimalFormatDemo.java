package 工作遇到的问题;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DecimalFormatDemo {
    public static void main(String[] args) {
        //创建一个默认的通用格式
        NumberFormat numberFormat = NumberFormat.getInstance();
        DecimalFormat numberDecimalFormat;
        //捕捉异常，以防强制类型转换出错
        try {
            //强制转换成DecimalFormat
            numberDecimalFormat = (DecimalFormat) numberFormat;
            //保留小数点后面三位，不足的补零,前面整数部分 每隔四位 ，用 “,” 符合隔开
            numberDecimalFormat.applyPattern("###.###");
            //设置舍入模式 为DOWN,否则默认的是HALF_EVEN
            numberDecimalFormat.setRoundingMode(RoundingMode.DOWN);
            System.out.println(numberDecimalFormat.format(0.5));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
