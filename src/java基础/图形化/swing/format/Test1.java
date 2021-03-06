package java基础.图形化.swing.format;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Test1 {
    public static void main(String[] args) {
        DecimalFormat decimal6Format = (DecimalFormat) NumberFormat.getInstance();
        decimal6Format.applyPattern("0.000000");
        decimal6Format.setRoundingMode(RoundingMode.DOWN);
        decimal6Format.setMaximumIntegerDigits(1);
        decimal6Format.setMinimumIntegerDigits(1);
        decimal6Format.setMaximumFractionDigits(6);
        decimal6Format.setMinimumFractionDigits(6);

        System.out.println(decimal6Format.format(Double.parseDouble("10.0000005")));
    }
}
