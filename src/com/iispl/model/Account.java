package com.iispl.model;

import java.math.BigDecimal;

public class Account {
	private String accountNumber;
	private boolean isActive;
	private BigDecimal accountBalance;
	public Account(String accountNumber, boolean isActive, BigDecimal accountBalance) {
		
		this.accountNumber = accountNumber;
		this.isActive = isActive;
		this.accountBalance = accountBalance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public BigDecimal getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}
	

}
