package com.ss.withoutL;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankRBI bankRBI=new BankRBI();
		bankRBI.monthlyLoanEMI(12000);
		BankRBI icic=new BankICICI();
		icic.monthlyLoanEMI(12000);
		BankRBI unknown=new UnknownBank();
		unknown.monthlyLoanEMI(12000);
	}

}
