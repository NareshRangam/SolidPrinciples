package com.ss.withO;


public class Booking  {
	IPayment iPayment;
	public void makePayment(String payment)
	{
		if(payment.equalsIgnoreCase("cash"))
		{
			iPayment=new CashPayment();
			iPayment.makePayment();
		}
		else if(payment.equalsIgnoreCase("card"))
		{
			iPayment=new CardPayment();
			iPayment.makePayment();
		}
		else if(payment.equalsIgnoreCase("wallet"))
		{
			iPayment=new WalletPayment();
			iPayment.makePayment();
		}
	}

}
