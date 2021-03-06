package java基础.图形化.awt.component;

import java.awt.*;

public class DialogTest {
    Frame frame = new Frame("test");

    Dialog d1 = new Dialog(frame, "d1", true);// 模式对话框会阻塞，等待用户操作该对话框
    Dialog d2 = new Dialog(frame, "d2", false);// 非模式对话框不会阻塞，可能会出现异常

    Button b1 = new Button("open d1");
    Button b2 = new Button("open d2");

    public void init() {
        d1.setBounds(20, 30, 300, 400);
        d2.setBounds(20, 30, 300, 400);
        // Button的事件监听器
        b1.addActionListener(e -> {
            d1.setVisible(true);
        });
        b2.addActionListener(e -> {
            d2.setVisible(true);
        });

        frame.add(b1);
        frame.add(b2, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new DialogTest().init();
    }
}
