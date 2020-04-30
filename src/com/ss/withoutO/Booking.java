package com.ss.withoutO;

public class Booking {

	public void makePayment(String paymentType)
	{
		if(paymentType.equalsIgnoreCase("cash"))
		{
			System.out.println("Your Cash Payment Succes");
		}
		else if(paymentType.equalsIgnoreCase("card"))
		{
			System.out.println("Your Card Payment Succes");
		}
		else if(paymentType.equalsIgnoreCase("wallet"))
		{
			System.out.println("Your Wallet Payment Succes");
		}
	}
}
