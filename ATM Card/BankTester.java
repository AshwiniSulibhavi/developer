package com.xworkz.bankApp;
import java.util.Scanner;

public class BankTester {
	
	public static void main(String a[]) {
		@SuppressWarnings("resource")
		Scanner type= new Scanner(System.in);
		System.out.println(" Enter the  Bank Card");
		
		ICard iCard= BankFactory.getCard(type.next());
	    if(iCard!=null) 
	    {
	    	iCard.insert();
	    	iCard.withdraw();
	    	iCard.checkBalance();
	    	iCard.removeCard();
	    }

}
}
