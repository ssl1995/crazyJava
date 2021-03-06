package java基础.图形化.awt.layout;

import java.awt.*;

import static java.awt.BorderLayout.NORTH;

public class GridLayoutTest {
    public static void main(String[] args) {
        Frame frame = new Frame("Calculator");
        Panel p1 = new Panel();
        p1.add(new TextField(50));
        frame.add(p1, NORTH);

        // 使用GridLayout格子布局器，模仿一个计算器布局
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(3, 5, 4, 4));
        String[] names = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", "."};
        for (int i = 0; i < names.length; i++) {
            p2.add(new Button(names[i]));
        }
        frame.add(p2);

        frame.pack();
        frame.setVisible(true);
    }
}
