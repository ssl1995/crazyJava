package java基础.图形化.awt.layout;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutTest {
    private Frame f = new Frame("Test");
    private Box hor = Box.createHorizontalBox();
    private Box ver = Box.createVerticalBox();

    public void init() {
        Box leftBox = Box.createVerticalBox();
        leftBox.add(new Label("l1"));
        leftBox.add(new Label("l2"));
        Box rightBox = Box.createVerticalBox();
        rightBox.add(new Label("r1"));
        rightBox.add(new Label("r2"));
        hor.add(leftBox);
        hor.add(rightBox);
//        hor.add(new Button("h1"));
//        hor.add(new Button("h2"));
        ver.add(new Button("ver1"));
        ver.add(new Button("ver2"));
        f.add(hor, BorderLayout.NORTH);
        f.add(ver);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayoutTest().init();
    }
}
