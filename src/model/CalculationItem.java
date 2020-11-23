package model;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculationItem implements Calculate {
    static ArrayList<Item> arrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("thêm sp");
        String name = sc.nextLine();
        System.out.println("them ID");
        String ID = sc.nextLine();
        System.out.println("nhap gia");
        long price = Integer.parseInt(sc.nextLine());
        System.out.println("So luong SP");
        int number = Integer.parseInt(sc.nextLine());
        Item item = new Item(name, ID, price, number);
        arrayList.add(item);
    }

    @Override
    public void search() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }
}
