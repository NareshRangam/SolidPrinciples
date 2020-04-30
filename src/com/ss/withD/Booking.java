package com.ss.withD;


public class Booking  {
	private IPayment iPayment;
	
	public Booking(IPayment iPayment) {
		super();
		this.iPayment = iPayment;
	}

	public void savePaymentDetails()
	{
		iPayment.savePaymentDetails();
	}

}
