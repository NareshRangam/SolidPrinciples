package com.ss.withoutO;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);  
	    System.out.println("Enter Payment type");

	    String paymentType = scanner.nextLine(); 
	    Booking payment=new Booking();
	    payment.makePayment(paymentType);
	}

}
