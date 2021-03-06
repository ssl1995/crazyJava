package java基础.图形化.awt.layout;

import java.awt.*;

public class FlowLayoutTest {
    public static void main(String[] args) {
        Frame frame = new Frame("test");
        // FlowLayout.LEFT:左对齐
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        for (int i = 1; i <= 10; i++) {
            frame.add(new Button("pick me" + i));
        }
        frame.pack();// 设置窗口为最佳大小，无需手动设置边界值
        frame.setVisible(true);
    }
}
