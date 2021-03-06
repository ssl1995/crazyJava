package java基础.图形化.swing.format;

import javax.swing.*;
import java.awt.*;

public class AwtTest extends JFrame {
    private Frame f = new Frame("GridBagLayout Test");
    private GridBagLayout gbl = new GridBagLayout();
    private GridBagConstraints gbc = new GridBagConstraints();

    private Button[] btns = new Button[10];

    private void addButton(Button btn) {
        gbl.setConstraints(btn, gbc);
        f.add(btn);
    }

    public void init() {
        for (int i = 0; i < 10; i++) { // 先初始化10个按钮
            btns[i] = new Button("button" + i);
        }
        f.setLayout(gbl); // 设定框架的布局模式

        gbc.fill = GridBagConstraints.BOTH; // 伸缩首先规定是两个方向上的
        gbc.weighty = 1; // 纵向比例都是1:1

        // 第1行的4个按钮
        gbc.weightx = 1; // 第一行的三个都是1:1:1
        addButton(btns[0]);
        addButton(btns[1]);
        addButton(btns[2]);
        gbc.gridwidth = GridBagConstraints.REMAINDER; // 第4个添加后就要换行了
        addButton(btns[3]);

        // 第2行1个按钮，仍然保持REMAINDER换行状态
        addButton(btns[4]);

        // 第3行2个按钮，分别横跨2格
        gbc.gridwidth = 2;
        gbc.weightx = 1;
        addButton(btns[5]);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        addButton(btns[6]);

        // 7纵跨2个格子，8、9一上一下
        gbc.gridheight = 2;
        gbc.gridwidth = 1;
        gbc.weightx = 1;
        addButton(btns[7]); // 由于纵跨2格因此纵向伸缩比例不需要调整，默认为1*2格，比例刚好

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = 1;
        gbc.weightx = 3;
        addButton(btns[8]);
        addButton(btns[9]);

        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AwtTest().init();
    }

}
