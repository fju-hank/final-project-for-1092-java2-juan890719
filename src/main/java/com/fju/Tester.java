package com.fju;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("您好這裡是咖啡廳，請選擇文字模式或是GUI模式 ( 1or2 )：");
        String select = scanner.next();
        while (!(select.equals("1")) && !(select.equals("2"))) {
            System.out.println("請重新輸入！");
            System.out.println("您好這裡是咖啡廳，請選擇文字模式或是GUI模式 ( 1or2 )：");
            select = scanner.next();
        }
        if (select.equals("1")) {
            Tester tester = new Tester();
            tester.menuSee();
        } else if (select.equals("2")) {
            GUI gui = new GUI();
            gui.openGUI();
        }
    }

    public void menuSee() {
        Menu menu = new Menu();

    }
}
