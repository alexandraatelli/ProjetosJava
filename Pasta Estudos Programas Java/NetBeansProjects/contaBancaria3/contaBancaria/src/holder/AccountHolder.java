package holder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Account.Account;

public class AccountHolder {
	
	private String name;
	private String password;
	private LocalDate createdAt;
	private List<Account> accounts = new ArrayList<>();

	public AccountHolder(String name, String password, LocalDate createdAt) {
		this.name = name;
		this.password = password;
		this.createdAt = createdAt;
	}
	
	public boolean associateAccount(Account account) {
		if (this.accounts.add(account))
			return true;
		
		return false;
	}
	
	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public LocalDate getBirthDate() {
		return createdAt;
	}
	
	@Override
	public String toString() {
		String holderAccounts = "";
		for(Account account : accounts) {
			holderAccounts = holderAccounts + " Id da conta: " + account.getId() + " Tipo da conta: " + account.getType() + "\n";
		}
		return "AccountHolder [name=" + name + ", password=" + password + ", createdAt=" + createdAt + ", accounts="
				+ holderAccounts + "]";
	}
	
}
