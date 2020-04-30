package com.ss.withoutS;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user=new User();
		user.createUser("Test User");
		user.makePayment(500);
		user.deleteUser("Unknown User");
	}

}
