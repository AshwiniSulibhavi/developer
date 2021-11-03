package com.xworkz.bankApp;

public class BankOfBarodaImplementation implements ICard {

	@Override
	public void insert() {
		System.out.println("please insert the Bank of Baroda ATM  card first....");
		
	}

	@Override
	public void withdraw() {
		System.out.println(" Enter amount ....");
		
	}

	@Override
	public void checkBalance() {
		System.out.println(" Your bank Balance is ......this much.");
		
	}

	@Override
	public void removeCard() {
		System.out.println("Remove ATM card & press clear...");
		
	}

}
