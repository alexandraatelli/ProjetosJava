package Account;

public class Account {

	private int accountId;
    private double balance;
    private AccountType accountType;
    
    public Account(int id, double balance, AccountType accountType) {
        this.accountId = id;
        this.balance = balance;
        this.accountType = accountType;        
    }

    public void deposit(double depositAmount) {
        if(depositAmount > 0.0) {
            this.balance = this.balance + depositAmount;
        }
    }
    
    public boolean withdraw(double Amount) {
    	if (this.balance - Amount >= 0.0) {
    		this.balance = this.balance - Amount;
    		return true;
    	} 
    		
    	return false;
    }

    public double getBalance() {
        return this.balance;
    }
    
    public AccountType getType() {
    	return this.accountType;
    }

    public int getId() {
        return this.accountId;
    }
}