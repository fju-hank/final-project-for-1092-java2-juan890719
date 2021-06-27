package com.fju;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUI {
    private JPanel mainJPanel;
    private JTextField name;
    private JTextField type;
    private JTextField price;
    private JButton addBtn;
    private JPanel menu;
    private JList list;
    private ArrayList<String> arrayList = new ArrayList<String>();

    private void replaceModel(){
        list.setModel(new AbstractListModel(){
            @Override
            public int getSize(){
                return arrayList.size();
            }

            @Override
            public Object getElementAt(int index){
                return arrayList.get(index);
            }
        });
    }

    public void openGUI() {
        GUI gui = new GUI();
        JFrame jFrame = new JFrame();
        jFrame.setContentPane(gui.mainJPanel);
        jFrame.setSize(600, 400);
        jFrame.setTitle("Welcome to the Café !");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //菜單
        Menu menu = new Menu();
        gui.list = new JList();
        gui.arrayList.add("Americano   Drink   60");
        gui.arrayList.add("Espresso shots   Drink   50");
        gui.arrayList.add("Café Latte   Drink   70");
        gui.replaceModel();
        JScrollPane scrollPane = new JScrollPane();
        jFrame.add(scrollPane, BorderLayout.CENTER);
        scrollPane.setViewportView(gui.list);

        //新增餐點按鈕
        gui.addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gui.name.requestFocusInWindow();
                gui.name.selectAll();
                gui.type.requestFocusInWindow();
                gui.type.selectAll();
                gui.price.requestFocusInWindow();
                gui.price.selectAll();
                String name = gui.name.getText();
                String type = gui.type.getText();
                String price = gui.price.getText();
                if (name.isEmpty() || type.isEmpty() || price.isEmpty()) {
                    JOptionPane.showMessageDialog(jFrame, "輸入框不能為空！",
                            "警訊", JOptionPane.WARNING_MESSAGE);
                } else {
                    gui.arrayList.add(name + "   " + type + "   " + price);
                    gui.replaceModel();
                }
            }
        });
        jFrame.setVisible(true);
    }
}
