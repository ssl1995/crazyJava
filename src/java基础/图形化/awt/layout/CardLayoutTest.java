package java基础.图形化.awt.layout;

import java.awt.*;
import java.awt.event.ActionListener;

public class CardLayoutTest {
    Frame f = new Frame("test");
    String[] names = {"1", "2", "3", "4", "5"};
    Panel p1 = new Panel();

    public void init() {
        // CardLayout是按照时间来分布的
        final CardLayout c = new CardLayout();
        p1.setLayout(c);
        for (int i = 0; i < names.length; i++) {
            p1.add(names[i], new Button(names[i]));
        }

        Panel p2 = new Panel();
        // 配置行为监听器
        ActionListener listener = e -> {
            switch (e.getActionCommand()) {
                case "previous":
                    c.previous(p1);
                    break;
                case "next":
                    c.next(p1);
                    break;
                case "first":
                    c.first(p1);
                    break;
                case "last":
                    c.last(p1);
                    break;
                case "third":// 第三张必须和names中的名字对应
                    c.show(p1, "3");
                    break;
            }
        };
        Button previous = new Button("previous");
        Button next = new Button("next");
        Button first = new Button("first");
        Button last = new Button("last");
        Button third = new Button("third");
        previous.addActionListener(listener);
        next.addActionListener(listener);
        first.addActionListener(listener);
        last.addActionListener(listener);
        third.addActionListener(listener);

        p2.add(previous);
        p2.add(next);
        p2.add(first);
        p2.add(last);
        p2.add(third);

        f.add(p1);
        f.add(p2, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayoutTest().init();
    }

}
