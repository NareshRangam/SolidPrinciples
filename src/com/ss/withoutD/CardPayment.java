package com.ss.withoutD;

public class CardPayment implements IPayment {
	
	@Override
	public void savePaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("Your card payment success and payment details saving-----userId:7894,userName:Test User,address:India,amount:10000");
	}
}
