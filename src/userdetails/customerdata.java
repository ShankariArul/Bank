package userdetails;

import java.util.Scanner;

public class customerdata {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Customer Name : ");
		
	    String CustomerName = reader.next();
	    
	    System.out.print("Account Type : ");
		
	    String AccountType = reader.next();
	    
	    System.out.print("Account Number : ");
		
	    String AccountNumber = reader.next();
	    
	    System.out.print("Account Balance : $");
		
	    float AccountBalance = reader.nextFloat();
	    

	}

}
