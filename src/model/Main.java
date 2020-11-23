package model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculationItem ci = new CalculationItem();
        CalculateBill bill = new CalculateBill();
        Order order = new Order();
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("1 them Sp");
            System.out.println("2 mua Sp");
            System.out.println("3 xem hóa đơn ");
            System.out.println("4 thêm vào giỏ hàng");
            System.out.println("5 xem đơn ");
            System.out.println("6 thoat");
            num = Integer.parseInt(sc.nextLine());
            switch (num) {
                case 1:
                    ci.add();
                    break;
                case 2:
                    order.add();
                    break;
                case 3:
                    order.show();
                    break;
                case 4:
                    bill.add();
                    break;
                case 5:
                    bill.show();
                    break;
            }
        } while (num != 6);
    }
}
