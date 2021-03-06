package java基础.图形化.awt.layout;

import java.awt.*;

import static java.awt.BorderLayout.*;

public class BorderLayoutTest1 {
    public static void main(String[] args) {
        Frame frame = new Frame("测试窗口");
        // frame默认布局器：BorderLayout
        frame.setLayout(new BorderLayout(40, 10));
        frame.add(new Button("North"), NORTH);
        frame.add(new Button("South"), SOUTH);
        frame.add(new Button("Default is in middle"));
        frame.add(new Button("East"), EAST);
        frame.add(new Button("West"), WEST);
        // 取消某个组件不会产生空白，其他组件会填充
        frame.pack();
        frame.setVisible(true);
    }
}
