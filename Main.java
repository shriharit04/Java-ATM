//TODO: Add object serilization to ATM
//Create PaCKAGE bANKING SYSTEM for the same.
//TODO: LOg the the data to a file.

import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        ATM a1 = new ATM(100000);
        SavingsAccount hari = new SavingsAccount(1223,40000,"Shrihari",1234,12546);
        NRIAccount thiyagu = new NRIAccount(1567, 80000, "Thiyagarajan", 1234, 123456);
        a1.StartTransaction(hari);
        a1.StartTransaction(thiyagu);
        a1.StartTransaction(hari);

        a1.AddMoney(100000);
        a1.getLog();

        sc.close();

    
    }
}
