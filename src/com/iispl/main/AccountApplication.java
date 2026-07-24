package com.iispl.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.iispl.model.Account;
import com.iispl.service.AccountService;
public class AccountApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Account account = null;
		BigDecimal amount;
		List<Account> accounts = new ArrayList<>();
		char goToMainMenu;
		do {
			System.out.println("1.create account, 2.Display account, 3.Deposit Amount, 4.Withdraw");
			System.out.println("Enter Your choice: ");
			int option = scanner.nextInt();
			switch(option) {
			case 1:
//				BigDecimal accountBalance = scanner.nextBigDecimal();
				account = AccountService.createAccount();
				accounts.add(account);
				break;
			case 2:
				AccountService.dislayAccountDetails(accounts);
				break;
			case 3:
				account = findAccountFromList(accounts);
				if(account != null) {
					amount = getAmountFromCustomer();
					AccountService.depositAmount(account,amount);
				}
				else {
					System.out.println("Account not be found");
				}
				break;
			case 4:
				amount = getAmountFromCustomer();
				AccountService.withdrawAmount(account,amount);
				break;
			default:
				System.out.println("Invalid user option");
			}	
			System.out.println("Do you want to continue");
			goToMainMenu = scanner.next().charAt(0);
			
		}
		while(goToMainMenu == 'y');
	}
	private static Account findAccountFromList(List<Account> accounts) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Account to be searched");
		String accountNumber = scanner.nextLine();
		for(Account account: accounts) {
			if(account.getAccountNumber().equals(accountNumber));
			return account;
		}
		return null;
	}
	public static BigDecimal getAmountFromCustomer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a amount: ");
		return scanner.nextBigDecimal();
	}
}
