package com.accenture.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TransactionDTO {
	
	private List<Transaction> transactions;
	
	public TransactionDTO() {
		this.transactions = new ArrayList<Transaction>();
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	public void addTransaction(Transaction t) {
		this.getTransactions().add(t);
	}
	
	public Transaction getFirstElement() {
		Transaction t = this.getTransactions().get(0);
		this.getTransactions().remove(0);
		return t;
	}
	
	

}
