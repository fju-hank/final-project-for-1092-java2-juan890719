package com.fju;

import javax.swing.*;

public class GUI {
    private JPanel mainJPanel;
    private JTextField name;
    private JTextField type;
    private JTextField price;
    private JLabel meal;
    private JButton addBtn;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setContentPane(new GUI().mainJPanel);
        jFrame.setSize(600, 400);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
