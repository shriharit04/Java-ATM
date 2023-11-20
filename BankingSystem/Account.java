package BankingSystem;
public abstract class Account{
    int accNo;
    protected int bal;
    String accHolderName;
    int pin;
    
    void Withdraw(float amt){
        if(amt<=bal){
            bal -= amt;
        }else{
            System.out.println("Low balance, Please enter a different amount.");
        }
    }

    void Deposit(float amt){
        bal += amt;
    }
    void AccountData(){
        System.out.println("Account No : "+accNo);
        System.out.println("Account Holder : "+ accHolderName);
        System.out.println("Account Balance : "+ bal);
        System.out.println("--------------------");
    }
}

class SavingsAccount extends  Account {
    int aadharNo;
    public SavingsAccount(int accNo, int bal, String accHolderName,int pin, int proof) {
        this.accNo = accNo;
        this.bal = bal;
        this.accHolderName = accHolderName;
        this.pin = pin;
        aadharNo = proof;
        
    }

}

class NRIAccount extends Account{
    int passportNo;
    public NRIAccount(int accNo, int bal, String accHolderName,int pin,int proof) {
        this.accNo = accNo;
        this.bal = bal;
        this.accHolderName = accHolderName;
        this.pin = pin;
        passportNo = proof;
    }
    
}

