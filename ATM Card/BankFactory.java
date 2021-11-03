package com.xworkz.bankApp;

public class BankFactory{
	
public static ICard getCard(String type) {
	
	if(type.equals("AxisBank")) {
		
		return new AxisBankImplementation();
	}
	else if(type.equals("CanaraBank")) {
		
		return new CanaraBankImplementation();
		
	}
      else if (type.equals("BankOfBaroda")) {
		
		return new BankOfBarodaImplementation();
	}
      else {
    		 System.out.println("Bank does not exists or your Card in Invalid/Blocked.....");
    		}
	
           return null;
	
	
}

}
