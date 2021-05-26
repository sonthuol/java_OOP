package Manager_Bank;

import com.sun.security.jgss.GSSUtil;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager_BankABC {
    DecimalFormat formatter = new DecimalFormat("###,###,###");
    public static Scanner sc = new Scanner(System.in);

    private List<Bank_ABC>  bank_abcList;


    public Manager_BankABC(){
        bank_abcList = new ArrayList<Bank_ABC>();
    }

    public void addUser(){
        long numberAcount = input_numberAcount();
        String nameAcount = input_nameAcount();
        Bank_ABC bank_abc = new Bank_ABC(numberAcount, nameAcount);
        bank_abcList.add(bank_abc);
    }

    public void deleteUser(long numberAcount){
        Bank_ABC bank_abc = null;
        int size = bank_abcList.size();
        for (int i = 0; i < size; i++){
            if(bank_abcList.get(i).getNumberAcount() == numberAcount){
                bank_abc = bank_abcList.get(i);
                break;
            }
            if(bank_abc != null){
                bank_abcList.remove(bank_abc);
            }else{
                System.out.println("Number acount: "+numberAcount+" not exists!!");
            }
        }
    }

    public void editUser(long numberAcount){
        boolean isExisted = false;
        int size = bank_abcList.size();
        for (int i = 0; i < size; i++){
            if (bank_abcList.get(i).getNumberAcount() == numberAcount){
                isExisted  = true;
                bank_abcList.get(i).setNumberAcount(input_numberAcount());
                bank_abcList.get(i).setNameAcount(input_nameAcount());
                bank_abcList.get(i).setMoneyAcount(input_moneyAcount());
                break;
            }
            if (!isExisted){
                System.out.println("Number acount: "+numberAcount+" not exists!!");
            }
        }

    }

    public void show(){
        System.out.println("------------Danh Sach Tai Khoan---------------------");
        System.out.printf("%-20s |", "So Tai Khoan");
        System.out.printf("%-20s |", "Ten Tai Khoan");
        System.out.printf("%-20s |\n", "So Du");
        System.out.println("-----------------------------------------------------");
        for (Bank_ABC bank_abc : bank_abcList){
            System.out.printf("%-20d |", bank_abc.getNumberAcount());
            System.out.printf("%-20s |", bank_abc.getNameAcount());
            System.out.printf("%-20s |\n", formatter.format(bank_abc.getMoneyAcount())+" VNĐ");
        }
    }

    public void napTien(){

    }
    public void rutTien(){}
    public void daohan(){}
    public void chuyentien(){}

    private long input_numberAcount(){
        while(true){
            System.out.print("input number acount: ");
            try {
                long number = Long.parseLong(sc.nextLine());
                if(number < 0){
                    throw new NumberFormatException();
                }
                if (checkExists(number) == 1){
                    System.out.println("Tai khoan da ton tai");
                    throw new NumberFormatException();
                }
                return number;
            }catch (NumberFormatException ex){
                System.out.println("invalid! Please input number Acount!!");
            }

        }
    }

    private String input_nameAcount(){
        System.out.print("input name Acount: ");
        return sc.nextLine();
    }
    private double input_moneyAcount(){
        while(true){
            System.out.print("input money Acount: ");
            try {
                double money = Double.parseDouble(sc.nextLine());
                if (money < 1000){
                    throw new NumberFormatException();
                }
                return money;
            }catch (NumberFormatException ex){
                System.out.println("inValid! Please input Money!!");
            }
        }
    }

    private int checkExists(long numberAcount){
        int check = 0;
        int size = bank_abcList.size();
        for(int i = 0; i < size; i++){
            if(bank_abcList.get(i).getNumberAcount() == numberAcount){
                check = 1;
            }
        }
        return check;
    }
}
