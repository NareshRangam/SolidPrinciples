package com.ss.withoutO;

import java.util.Scanner;

public class BookingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);  
	    System.out.println("Enter Payment type");

	    String paymentType = scanner.nextLine(); 
	    Payment payment=new Payment();
	    payment.makePayment(paymentType);
	}

}
