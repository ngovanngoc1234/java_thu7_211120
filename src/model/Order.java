package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Order implements Calculate {
    Scanner sc = new Scanner(System.in);
    public static ArrayList<Item> listOrder = new ArrayList<>();
    public static long sumPrice;

    @Override
    public void add() {
        int num;
        System.out.println("nhap ten sp");
        String name = sc.nextLine();
        int check = 0;
        for (int i = 0; i < CalculationItem.arrayList.size(); i++) {
            if (name.equals(CalculationItem.arrayList.get(i).getName())) {
                System.out.println(CalculationItem.arrayList.get(i));
                System.out.println("cần mua bao nhiêu Sp");
                num = Integer.parseInt(sc.nextLine());
                if (CalculationItem.arrayList.get(i).getSumItem() > 0) {
                    CalculationItem.arrayList.get(i).setAmount(num);
                    CalculationItem.arrayList.get(i).subtract(num);
                    listOrder.add(CalculationItem.arrayList.get(i));
                    sumPrice += (listOrder.get(i).getPrice() * num);
                    check++;
                } else {
                    System.out.println("đã hết hàng ");
                }
                break;
            }
        }
        if (check == 0) {
            System.out.println("không có Sp này");
        }
    }

    public void show() {
        System.out.println("thông tin đơn hàng ");
        if (listOrder == null) {
            System.out.println("khong co thong tin don hang");
        } else {
            for (Item item : listOrder) {
                System.out.println("mã sản phẩm : " + item.getItemID());
                System.out.println("tên sản phẩm : " + item.getName());
                System.out.println("Giá sản phẩm : " + item.getPrice());
                System.out.println("số lượng mua : " + item.getAmount());
            }
            System.out.println("tổng tiền đơn hàng " + sumPrice);
        }

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
