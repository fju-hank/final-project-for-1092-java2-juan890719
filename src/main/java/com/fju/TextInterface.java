package com.fju;

import java.util.Scanner;

public class TextInterface {
    public void openTextInterface() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("您想選擇看菜單、新增菜單餐點還是離開呢 ( 1or2or3 )：");
        String select = scanner.next();

        //使用者錯誤輸入處理
        while (!(select.equals("1")) && !(select.equals("2")) && !(select.equals("3"))) {
            System.out.println("請重新輸入！");
            System.out.println("您想選擇看菜單、新增菜單餐點還是離開呢 ( 1or2or3 )：");
            select = scanner.next();
        }

        //看菜單、新增菜單餐點、離開(回到選擇文字模式/GUI模式)
        switch (select) {
            case "1":
                menuSee();
                break;
            case "2":
                addMenuMeal();
                break;
            case "3":
                Tester tester = new Tester();
                tester.open();
                break;
        }
    }

    public void menuSee() {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        if (menu.list.size() < 2) {
            menu.addMenu("Americano", "Drink", "60");
            menu.addMenu("Espresso shots", "Drink", "50");
            menu.addMenu("Café Latte", "Drink", "70");
        }
        menu.printMenu();
        System.out.println("接下來您想選擇新增菜單餐點、離開哪個呢 ( 1or2 )：");
        String select = scanner.next();

        while (!(select.equals("1")) && !(select.equals("2"))) {
            System.out.println("請重新輸入！");
            System.out.println("接下來您想選擇新增菜單餐點、離開哪個呢 ( 1or2 )：");
            select = scanner.next();
        }

        switch (select) {
            case "1":
                addMenuMeal();
                break;
            case "2":
                Tester tester = new Tester();
                tester.open();
        }
    }

    public void addMenuMeal() {
        Menu meal = new Menu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入欲新增餐點的餐點名：");
        String name = scanner.next();
        System.out.println("請輸入欲新增餐點的類型：(ex: coffee、cake...)");
        String type = scanner.next();
        System.out.println("請輸入欲新增餐點的價格：(NT$，請用阿拉伯數字)");
        String price = scanner.next();
        meal.addMenu(name, type, price);
        System.out.println("新增成功！");
        System.out.println("接下來您想看菜單、離開哪一個呢？ ( 1or2 )");
        String select = scanner.next();

        while (!(select.equals("1")) && !(select.equals("2"))) {
            System.out.println("請重新輸入！");
            System.out.println("接下來您想看菜單、離開哪一個呢？ ( 1or2 )");
            select = scanner.next();
        }

        switch (select) {
            case "1":
                menuSee();
                break;
            case "2":
                Tester tester = new Tester();
                tester.open();
        }
    }
}
