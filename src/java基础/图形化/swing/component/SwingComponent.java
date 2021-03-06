package java基础.图形化.swing.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

public class SwingComponent {

    JFrame f = new JFrame("test");
    // ok按钮
    JButton ok = new JButton("ok", new ImageIcon("ok.jpg"));

    // 单选按钮
    JRadioButton male = new JRadioButton("male", true);
    JRadioButton female = new JRadioButton("female", false);
    ButtonGroup bg = new ButtonGroup();

    // 复选框
    JCheckBox married = new JCheckBox("is marred?", false);
    // 下拉选择框
    String[] colors = new String[]{"red", "green", "blue"};
    JComboBox<String> colorChooser = new JComboBox<>(colors);
    // 列表选择框
    JList<String> colorList = new JList<>(colors);

    // 文本选择区域
    JTextArea ta = new JTextArea(8, 20);
    JTextField name = new JTextField(40);

    // 菜单条
    JMenuBar mb = new JMenuBar();
    JMenu file = new JMenu("fileMenu");
    JMenu edit = new JMenu("editMenu");

    // 三个菜单项
    JMenuItem newItem = new JMenuItem("new",  new ImageIcon("new.jpg"));
    JMenuItem saveItem = new JMenuItem("save",  new ImageIcon("save.jpg"));
    JMenuItem exitItem = new JMenuItem("exit", new ImageIcon("exit.jpg"));

    // 自动换行菜单项
    JCheckBoxMenuItem autoWrap = new JCheckBoxMenuItem("autoWrap");

    // 复制粘贴菜单项
    JMenuItem copyItem = new JMenuItem("copy", new ImageIcon("copy.jpg"));
    JMenuItem pasteItem = new JMenuItem("paste", new ImageIcon("paste.jpg"));

    // 注释和取消菜单项
    JMenu format = new JMenu("format");
    JMenuItem commentItem = new JMenuItem("comment");
    JMenuItem cancelItem = new JMenuItem("cancel");

    // 右键菜单
    JPopupMenu pop = new JPopupMenu();
    ButtonGroup flavorGroup = new ButtonGroup();

    // 定义程序外观
    JRadioButtonMenuItem metalItem = new JRadioButtonMenuItem("Metal Style", true);
    JRadioButtonMenuItem nimbusItem = new JRadioButtonMenuItem("Nimbus Style");
    JRadioButtonMenuItem windowsItem = new JRadioButtonMenuItem("Windows Style");
    JRadioButtonMenuItem classicItem = new JRadioButtonMenuItem("Class Style");
    JRadioButtonMenuItem motifItem = new JRadioButtonMenuItem("Motif Style");

    public void init() {

        JPanel bottom = new JPanel();
        bottom.add(name);
        bottom.add(ok);
        f.add(bottom, BorderLayout.SOUTH);

        JPanel checkPanel = new JPanel();
        checkPanel.add(colorChooser);
        bg.add(male);
        bg.add(female);
        checkPanel.add(male);
        checkPanel.add(female);
        checkPanel.add(married);

        Box topLeft = Box.createVerticalBox();
        JScrollPane taJSP = new JScrollPane(ta);
        topLeft.add(taJSP);
        topLeft.add(checkPanel);

        Box top = Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colorList);
        f.add(top);

        // netItem设置快捷键，为大写字母N
        newItem.setAccelerator(KeyStroke.getKeyStroke('N', InputEvent.CTRL_DOWN_MASK));
        newItem.addActionListener(e -> {
            ta.append("user clicked 'newItem'\n");
        });
        // 为file添加菜单项
        file.add(newItem);
        file.add(saveItem);
        file.add(exitItem);
        // edit添加菜单项
        edit.add(autoWrap);
        edit.addSeparator();
        edit.add(copyItem);
        edit.add(pasteItem);
        // comment增加提示信息
        commentItem.setToolTipText("Comment the program code");
        format.add(commentItem);
        format.add(cancelItem);
        // 使用new JMenuItem("-")不能添加菜单风格符
        edit.add(new JMenuItem("-"));
        edit.add(format);
        // 添加到菜单条中
        mb.add(file);
        mb.add(edit);
        // 为f设置菜单条
        f.setJMenuBar(mb);

        // 组合右键菜单
        flavorGroup.add(metalItem);
        flavorGroup.add(nimbusItem);
        flavorGroup.add(windowsItem);
        flavorGroup.add(classicItem);
        flavorGroup.add(motifItem);
        pop.add(metalItem);
        pop.add(nimbusItem);
        pop.add(windowsItem);
        pop.add(classicItem);
        pop.add(motifItem);
        // 为5个风格菜单添加时间监听器
        ActionListener flavorListener = e -> {
            try {
                switch (e.getActionCommand()) {
                    case "Metal Style":
                        break;
                    case "Nimbus Style":
                        changeFlavor(2);
                        break;
                    case "Windows Style":
                        changeFlavor(3);
                        break;
                    case "Class Style":
                        changeFlavor(4);
                        break;
                    case "Motif Style":
                        changeFlavor(5);
                        break;
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        };
        metalItem.addActionListener(flavorListener);
        nimbusItem.addActionListener(flavorListener);
        windowsItem.addActionListener(flavorListener);
        classicItem.addActionListener(flavorListener);
        motifItem.addActionListener(flavorListener);
        // 调用该方法即可设置右键菜单
        ta.setComponentPopupMenu(pop);
        // 设置窗口右上角x按钮，点击关闭，退出程序
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.pack();
        f.setVisible(true);
    }
    private void changeFlavor(int flavor) throws Exception {
        switch (flavor) {
            case 1:
                UIManager.setLookAndFeel(
                        "javax.swing.plaf.metal.MetalLookAndFeel");
                break;
            case 2:
                UIManager.setLookAndFeel(
                        "javax.swing.plaf.nimbus.NimbusLookAndFeel");
                break;
            case 3:
                UIManager.setLookAndFeel(
                        "com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                break;
            case 4:
                UIManager.setLookAndFeel(
                        "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
                break;
            case 5:
                UIManager.setLookAndFeel(
                        "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                break;
        }
        // 更新指定组件的UI
        SwingUtilities.updateComponentTreeUI(f.getContentPane());
        SwingUtilities.updateComponentTreeUI(mb);
        SwingUtilities.updateComponentTreeUI(pop);
    }

    public static void main(String[] args) {
        new SwingComponent().init();
    }
}
