package codegym.menu;

import java.util.Scanner;

public class MainMenu {
    public static Scanner scanner = new Scanner(System.in);

    public static void show() {
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪  CHÀO MỪNG TỚI KIOT VIET  ⚪ ⚪ ⚪ ⚪ ⚪");
        System.out.println("⚪                                      ⚪");
        System.out.println("⚪     1. Quản lý người dùng              ⚪");
        System.out.println("⚪     2. Quản lý đồ uống                  ⚪");
        System.out.println("⚪     3. Quản lý hóa đơn                ⚪");
        System.out.println("⚪     0. Thoát                                 ⚪");
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪");
    }

    public static void launch() {
        int option;
        do {
            show();
            System.out.println("\nChọn chức năng ");
            System.out.print(" ⭆ ");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    UserView.run();
                    break;
                case 2:
                    ProductView.run();
                    break;
                case 3:
                    OrderView.run();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                    break;
            }

        } while (option != 0);
    }
}
