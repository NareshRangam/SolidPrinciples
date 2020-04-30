package com.ss.withoutD;


public class Booking  {
	IPayment iPayment;
	public void savePaymentDetails(String payment)
	{
		if(payment.equalsIgnoreCase("cash"))
		{
			iPayment=new CashPayment();
			iPayment.savePaymentDetails();
		}
		else if(payment.equalsIgnoreCase("card"))
		{
			iPayment=new CardPayment();
			iPayment.savePaymentDetails();
		}
	}

}
