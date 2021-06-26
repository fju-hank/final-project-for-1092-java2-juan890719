package com.fju;

import java.util.ArrayList;

public class Menu {
    ArrayList<String> list = new ArrayList<>();

    public void addMenu(String name, String type, String price) {
        list.add(name + "\t" + type + "\t" + price);
    }

    public void printMenu() {
        addMenu("Americano", "Drink", "60");
        addMenu("Espresso shots", "Drink", "50");
        addMenu("Café Latte", "Drink", "70");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            if (i == list.size() -1) {
            } else {
                System.out.println("");
            }
        }
    }
}
