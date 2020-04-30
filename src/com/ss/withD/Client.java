package com.ss.withD;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking cash=new Booking(new CashPayment());
		cash.savePaymentDetails();
		Booking card=new Booking(new CardPayment());
		card.savePaymentDetails();
	}

}
