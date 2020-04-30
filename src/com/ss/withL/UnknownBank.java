package com.ss.withL;

public class UnknownBank extends BankRBI {
	@Override
	public void monthlyLoanEMI(int amount) {
		System.out.println("Your monthly EMI in SBI Bank:"+ amount / 20);
	}
}
