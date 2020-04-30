package com.ss.withoutL;

public class BankICICI extends BankRBI {
	@Override
	public void monthlyLoanEMI(int amount) {
		System.out.println("Your monthly EMI in ICICI Bank:"+ amount / 16);
	}
}
