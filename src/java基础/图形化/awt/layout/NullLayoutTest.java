package java基础.图形化.awt.layout;

import java.awt.*;

public class NullLayoutTest {
    Frame f = new Frame("test");
    Button b1 = new Button("Button1");
    Button b2 = new Button("Button2");

    public void init() {
        // 不使用布局分布器，而采用绝对定位，但是不推荐
        f.setLayout(null);

        b1.setBounds(20, 30, 90, 28);
        b2.setBounds(50, 45, 120, 35);
        f.add(b1);
        f.add(b2);
        f.setBounds(50, 45, 300, 150);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new NullLayoutTest().init();
    }
}
