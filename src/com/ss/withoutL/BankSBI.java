package com.ss.withoutL;

public class BankSBI extends BankRBI {
	@Override
	public void monthlyLoanEMI(int amount) {
		System.out.println("Your monthly EMI in SBI Bank:"+ amount / 14);
	}
}
