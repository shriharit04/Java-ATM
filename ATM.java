import java.util.HashMap;
import java.util.Scanner;

public class ATM {
    ATM(float bal){
        this.bal = bal
    }
    private float bal;
    HashMap<Integer,Float> log = new HashMap<Integer,Float>();
    public float getBal() {
        return bal;
    }
    public void AddMoney(float bal) {
        this.bal += bal;
    }
    public HashMap<Integer, Float> getLog() {
        return log;
    }



    <T extends Account > void StartTransaction(T acc){ //TODO:create account abstract class
        Scanner sc = new Scanner(System.in);
       //logging in 
        for(int i = 1; i<=3;i++) {
            System.out.print("Enter Pin : ");
            int pin = sc.nextInt();
            if(pin!= acc.pin){
                if(i==3){
                    System.out.println("Account has been locked. Please contact bank to unlock.");
                }
                System.out.println("Wrong pin entered try again." + (3-i) + " tries left." );
            }else{
                System.out.println("Welcome "+acc.accHolderName);
                break;
            }
        }

        //print services
        System.out.println("Account Balance : " + acc.bal);
        System.out.println("Available services : \n 1 : Withdraw Money\n 2 : Deposit Money");
        int ch = sc.nextInt();
        float amt;
        switch (ch) {
            case 1:
                System.out.print("Enter amount to withdraw : ");
                amt = sc.nextFloat();
                if(amt>bal){
                    System.out.println("Low balance in ATM, sorry for the inconvenience.");
                }
                bal -= amt;
                acc.Withdraw(amt);

                System.out.println("Successful");
                break;
            case 2:
                System.out.print("Enter amount to deposit : ");
                amt = sc.nextFloat();
                bal += amt;
                acc.Deposit(amt);

                System.out.println("Successful");
                break;
            default:
                System.out.println("Please Enter the right option. Logging out");
                break;

            
        }
        
    

        sc.close();
    }

}
