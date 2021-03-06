package java基础.图形化.awt.adapter;

import javax.swing.*;

public class WindowCloseTest {
    private JFrame f = new JFrame("test");
    private JButton ok = new JButton("ok");
    private JTextField text = new JTextField(20);

    public void init() {
        JPanel p = new JPanel();
        p.add(text);
     /*   ok.addActionListener(e -> {
            System.exit(0);
        });*/
        p.add(ok);
        f.add(p);

    }

    public static void main(String[] args) {
        new WindowCloseTest().init();
    }

}
