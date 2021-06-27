package com.fju;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List list = new ArrayList<>();

    public void addMenu(String name, String type, String price) {
        list.add(name + "\t" + type + "\t" + price);
    }

    public void printMenu() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            if (i == list.size() -1) {
            } else {
                System.out.println("");
            }
        }
    }
}
