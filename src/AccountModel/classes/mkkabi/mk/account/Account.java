package mkkabi.mk.account;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private static List<Account> accounts = new ArrayList();
	private String name;
	private double currentBalance;
	private List<Transaction> transactios = new ArrayList();

	public Account(String name, double currentBalance) {
		this.name = name;
		this.currentBalance = currentBalance;
		accounts.add(this);
	}
        
        public void changeBalance(double amount){
            this.currentBalance += amount;
        }

	
	
	
	public static List<Account> getAccounts() {
		return accounts;
	}

	public String getName() {
		return name;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public List<Transaction> getTransactios() {
		return transactios;
	}
        
        

	@Override
	public String toString() {
		return "Account{" + "name=" + name + ", currentBalance=" + currentBalance + ", transactios=" + transactios + '}';
	}
	
	

}
