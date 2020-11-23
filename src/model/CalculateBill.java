package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateBill implements Calculate {
    Scanner sc = new Scanner(System.in);
    ArrayList<Item> itemList = new ArrayList<>();
    private long sumPrice;

    @Override
    public void add() {
        for (int i = 0; i < Order.listOrder.size(); i++) {
            itemList.addAll(Order.listOrder);
            Order.listOrder.remove(Order.listOrder.get(i));
            sumPrice = Order.sumPrice;
            Order.sumPrice = 0;
        }
    }

    public void show() {
        System.out.println("thông tin đơn hàng ");
        if (itemList == null) {
            System.out.println("không có SP");
        } else {
            for (Item item : itemList) {
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
