package com.iispl.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import com.iispl.model.Account;

public class AccountService {
	public static Account createAccount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the account details");
		System.out.println("Enter Account Number: ");
		String accountNumber = scanner.nextLine();
		System.out.println("Enter the opening Balance: ");
		BigDecimal openingBalance = scanner.nextBigDecimal();
		Account account= new Account(accountNumber,true,openingBalance);
		return account;
		
	
	}
	
	 public static void depositAmount(Account account, BigDecimal amount) {
	        account.setAccountBalance(account.getAccountBalance().add(amount));

	    }
	 public static void withdrawAmount(Account account, BigDecimal amount) {
		 account.setAccountBalance(account.getAccountBalance().subtract(amount));
	 }
}
