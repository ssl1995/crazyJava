package java基础.图形化.awt.component;

import java.awt.*;

public class FileDialogTest {
    Frame frame = new Frame("test");
    FileDialog d1 = new FileDialog(frame, "open file", FileDialog.LOAD);
    FileDialog d2 = new FileDialog(frame, "save file", FileDialog.SAVE);
    Button b1 = new Button("open file");
    Button b2 = new Button("save file");

    public void init() {

        b1.addActionListener(e -> {
            d1.setVisible(true);
            // 打印：绝对路径/文件名，以正斜杠相连接
            System.out.println(d1.getDirectory() + d1.getFile());
        });

        b2.addActionListener(e -> {
            b2.setVisible(true);
            // 打印绝对路径和文件名
            System.out.println(d2.getDirectory() + d2.getFile());
        });

        frame.add(b1);
        frame.add(b2, BorderLayout.SOUTH);
        frame.setBounds(50,50,100,200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new FileDialogTest().init();
    }

}
