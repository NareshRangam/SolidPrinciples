package com.ss.withoutI;

public class CardPayment implements IPayment {

	@Override
	public void savePaymentDetails() {
		// TODO Auto-generated method stub
		saveCardDetails(); //getting card details
		System.out.println("saving paymnet details---userId:7894,userName:Test User,address:India,amount:10000,CardDetails:CardDetailsObject");
	}

	@Override
	public void saveCardDetails() {
		// TODO Auto-generated method stub
		System.out.println("saving card details ---cardNumber:213456789,cardType:VISA,Card:Debit Card,bankName:SBI");
	}

}
