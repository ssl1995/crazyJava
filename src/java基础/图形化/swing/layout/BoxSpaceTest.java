package java基础.图形化.swing.layout;

import javax.swing.*;
import java.awt.*;

public class BoxSpaceTest {
    private JFrame f = new JFrame("test");
    private Box hor = Box.createHorizontalBox();
    private Box ver = Box.createVerticalBox();

    public void init() {
        hor.add(new JButton("h1"));
        hor.add(Box.createHorizontalGlue());// 拖动窗口，可以被拉伸
        hor.add(new JButton("h2"));
        hor.add(Box.createHorizontalStrut(10));// 固定了长度，不能被拉伸
        hor.add(new JButton("h3"));

        ver.add(new JButton("ver1"));
        ver.add(Box.createVerticalGlue());
        ver.add(new JButton("ver2"));
        ver.add(Box.createVerticalStrut(10));
        ver.add(new JButton("ver3"));

        f.add(hor, BorderLayout.NORTH);
        f.add(ver);
        f.pack();
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new BoxSpaceTest().init();
    }

}
