package java基础.图形化.awt.layout;

import java.awt.*;

public class GridBagTest {
    private Frame f = new Frame("test");
    private GridBagLayout gb = new GridBagLayout();
    private GridBagConstraints gbc = new GridBagConstraints();// 创建网格约束器
    private Button[] bs = new Button[10];

    public void init() {
        f.setLayout(gb);
        for (int i = 0; i < bs.length; i++) {
            bs[i] = new Button("button" + i);
        }

        gbc.fill = GridBagConstraints.BOTH;// 填充方式：所有组件都可以横向、纵向扩大

        gbc.weightx = 1;
        addButton(bs[0]);
        addButton(bs[1]);
        addButton(bs[2]);
        gbc.gridwidth = GridBagConstraints.REMAINDER; // gbc控制的GUI组件将会成为横向最后一个组件
        addButton(bs[3]);

        addButton(bs[4]);

        gbc.gridwidth = 2;// gbc控制的GUI组件横跨2个网络
        addButton(bs[5]);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        addButton(bs[6]);


        gbc.gridwidth = 1;// gbc控制的GUI组件横向1个网络，纵向2个网络
        gbc.gridheight = 2;
        gbc.weighty = 1;// gbc控制的GUI组件纵向的权重为1
        addButton(bs[7]);

        gbc.weighty = 0;// 设置下面的按钮在纵向上不会扩大
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = 1;
        addButton(bs[8]);
        addButton(bs[9]);

        f.pack();
        f.setVisible(true);
    }

    private void addButton(Button button) {
        gb.setConstraints(button, gbc);
        f.add(button);
    }

    public static void main(String[] args) {
        new GridBagTest().init();
    }

}
