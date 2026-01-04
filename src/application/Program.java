package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	try {	
		System.out.println("Enter account data: ");
		
		System.out.println("Number: ");
		Integer number = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Holder: ");
		String holder = sc.nextLine();
		
		System.out.println("Initial Balance: ");
		Double balance = sc.nextDouble();
		
		System.out.println("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		System.out.println();
		System.out.println("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		acc.withdraw(amount);
		
		
		System.out.println(acc);
		
	}
		
	catch (DomainException e) {
		System.out.println("Withdraw error: " + e.getMessage());
	}
		
		
	sc.close();
	}
}
