package mkkabi.mk.app.model;

import java.time.LocalDateTime;
import java.util.List;
import mkkabi.mk.account.Account;
import mkkabi.mk.account.Source;
import mkkabi.mk.account.Transaction;

public class Model {

	public void createAccount(String name, double startingBalance) {
		Account acc = new Account(name, startingBalance);
	}

	public List<Account> getAllAccounts() {
		return Account.getAccounts();
	}

	public void createTransactionSource(String name) {
		Source src = new Source(name);
	}

	public void makeTransaction(Account acc, String description, double amount, Source source) {
		Transaction tr = new Transaction(acc, LocalDateTime.now(), amount, description, source);
	}
	
	public List<Source> getTransactionSources(){
		return Source.getSources();
	}

}
