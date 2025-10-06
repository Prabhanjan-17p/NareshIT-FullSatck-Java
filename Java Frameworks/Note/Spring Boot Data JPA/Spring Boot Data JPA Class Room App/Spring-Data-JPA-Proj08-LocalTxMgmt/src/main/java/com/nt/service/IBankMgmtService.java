package com.nt.service;

import com.nt.entity.BankAccount;

public interface IBankMgmtService {
	public String openAccount(BankAccount account);

	public String withdraw(long acno, double amount);

	public BankAccount showAccountDetails(long acno);

	public String deposite(long acno, double amount);

	public String transferMoney(long srcAcno, long destAcno, double amount);
}
