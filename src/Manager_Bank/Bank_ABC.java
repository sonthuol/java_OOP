package Manager_Bank;

import java.util.Scanner;

public class Bank_ABC {
    private long numberAcount;
    private String nameAcount;
    private double moneyAcount;


    public Bank_ABC(){

    }

    public Bank_ABC(long numberAcount, String nameAcount) {
        this.numberAcount = numberAcount;
        this.nameAcount = nameAcount;
        this.moneyAcount = 50000;
    }

    public long getNumberAcount() {
        return numberAcount;
    }

    public void setNumberAcount(long numberAcount) {
        this.numberAcount = numberAcount;
    }

    public String getNameAcount() {
        return nameAcount;
    }

    public void setNameAcount(String nameAcount) {
        this.nameAcount = nameAcount;
    }

    public double getMoneyAcount() {
        return moneyAcount;
    }

    public void setMoneyAcount(double moneyAcount) {
        this.moneyAcount = moneyAcount;
    }
}
