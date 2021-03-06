package java基础.图形化.awt.layout;

import java.awt.*;

import static java.awt.BorderLayout.*;

public class BorderLayoutTest2 {
    public static void main(String[] args) {
        Frame frame = new Frame("测试窗口");
        frame.setLayout(new BorderLayout(30, 5));
        frame.add(new Button("North"), NORTH);
        frame.add(new Button("South"), SOUTH);
        frame.add(new Button("Default is in middle"));
        // 取消西部区域，使用panel添加
        Panel panel = new Panel();
        panel.add(new TextField(20));
        panel.add(new Button("pick me"));
        frame.add(panel);

        frame.add(new Button("East"), EAST);
        frame.pack();
        frame.setVisible(true);
    }
}
