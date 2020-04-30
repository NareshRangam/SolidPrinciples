package com.ss.withS;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user=new User();
		user.createUser("Test User");
		user.deleteUser("Unknown User");
		Booking booking=new Booking();
		booking.makePayment(500);
		booking.showPaymentDetails(2);
	}

}
