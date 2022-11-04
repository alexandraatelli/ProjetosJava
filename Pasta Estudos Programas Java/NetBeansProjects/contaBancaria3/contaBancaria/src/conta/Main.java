package conta;

import java.time.LocalDate;
import java.util.Date;

import Account.Account;
import Account.AccountType;
import holder.AccountHolder;

public class Main {
	public static void main(String[] args) {
				
		AccountHolder holder = new AccountHolder("Giovani", "123456", LocalDate.now());
		Account savingsAccount = new Account(1, 100, AccountType.SAVING);
		Account salaryAccount = new Account(2, 200, AccountType.SALARY);
		holder.associateAccount(savingsAccount);
		holder.associateAccount(salaryAccount);
		
		System.out.println(holder.toString());
	}
}
