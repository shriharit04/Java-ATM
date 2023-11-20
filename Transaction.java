
public class Transaction {
    int accNo;
    String withdrawOrDeposit;
    float UpdatedBal;
    
    public Transaction(int accNo, int withdrawOrDeposit, float updatedBal) {
        this.accNo = accNo;
        if(withdrawOrDeposit==1){
            this.withdrawOrDeposit = "Withdrawal";
        }else if(withdrawOrDeposit==2)  
            this.withdrawOrDeposit = "Deposit";
        else if(withdrawOrDeposit ==0)
            this.withdrawOrDeposit = "Bank Adding Money";
        UpdatedBal = updatedBal;
    }

    
    
}
