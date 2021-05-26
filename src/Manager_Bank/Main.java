package Manager_Bank;

import java.util.Scanner;

public class Main {
    public  static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Manager_BankABC manager_bankABC = new Manager_BankABC();
        String option = null;
        boolean isExited = false;
        menu();
        while (true){
            option = sc.nextLine();
            switch (option){
                case "1": manager_bankABC.addUser(); break;
                case "2": manager_bankABC.show(); break;
                case "3": isExited = true; break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (isExited){
                break;
            }
            menu();
        }

    }

    private static void menu(){
        System.out.println("1.Tao tai khoan.");
        System.out.println("2.Danh sach tai khoan.");
        System.out.println("3.Thoan");
    }
}
