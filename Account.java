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

