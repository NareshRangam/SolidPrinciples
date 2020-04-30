package com.ss.withO;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Payment type");
		String paymentType = scanner.nextLine();
		Booking booking=new Booking();
		booking.makePayment(paymentType);
	}

}
