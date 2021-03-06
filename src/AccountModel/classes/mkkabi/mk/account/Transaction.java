package mkkabi.mk.account;

import java.time.LocalDateTime;

public class Transaction {
	
	private int id;
	private LocalDateTime date;
	private double amount;
	private String description;
	private Source category;

	public Transaction(Account acc, LocalDateTime date, double amount, String comment, Source category) {
		this.date = date;
		this.amount = amount;
		this.description = comment;
		this.category = category;
		acc.getTransactios().add(this);
                acc.changeBalance(amount);
	}

	public LocalDateTime getDate() {
		return date;
	}

	public double getAmount() {
		return amount;
	}

	public String getComment() {
		return description;
	}

	public Source getSource() {
		return category;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setComment(String comment) {
		this.description = comment;
	}

	public void setSource(Source source) {
		this.category = source;
	}

	@Override
	public String toString() {
		return "Transaction{" + "date=" + date + ", amount=" + amount + ", description=" + description + ", source=" + category + '}';
	}
	
	

}
