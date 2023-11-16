//todo: print customer info
//TODO: Add logging functionality to ATM
//TODO: Add object serilization to ATM
//Create PaCKAGE bANKING SYSTEM for the same.
//TODO: LOg the the data to a file.

public class Main {

    public static void main(String[] args) {
        ATM a1 = new ATM();
        SavingsAccount harish = new SavingsAccount(1223,80000,"Shrihari",1234,12546);
        a1.StartTransaction(harish);
        

    
    }
}
