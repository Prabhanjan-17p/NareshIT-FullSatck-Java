package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.BankAccount;
import com.nt.repository.IBankAccountRepository;

@Service
public class BankMgmtServiceImpl implements IBankMgmtService {
	@Autowired
	private IBankAccountRepository accountRepo;

	@Override
	public String openAccount(BankAccount account) {
		// use repo
		account.setCreateBy(System.getProperty("user.name"));
		long acno = accountRepo.save(account).getAccno();
		return "Bank Account is opened having accont number::" + acno;
	}

	@Override
	public String withdraw(long acno, double amount) {
		// use repo
		BankAccount account = accountRepo.findById(acno).orElseThrow(() -> new RuntimeException("Invalid acno"));
		// update the object
		account.setBalance(account.getBalance() - amount);
		account.setUpdatedBy(System.getProperty("user.name"));
		// update the object
		accountRepo.save(account);
		return amount + "  amount is  withdrawn from the account number ::" + acno;
	}

	@Override
	public BankAccount showAccountDetails(long acno) {
		BankAccount account = accountRepo.findById(acno).orElseThrow(() -> new RuntimeException("Invalid acno"));
		return account;
	}

	@Override
	public String deposite(long acno, double amount) {
		// use repo
		BankAccount account = accountRepo.findById(acno).orElseThrow(() -> new RuntimeException("Invalid acno"));
		// update the object
		account.setBalance(account.getBalance() + amount);
		account.setUpdatedBy(System.getProperty("user.name"));
		// update the object
		accountRepo.save(account);
		return amount + "  amount is  deposited in to the account number ::" + acno;
	}

	@Override
	public String transferMoney(long srcAcno, long destAcno, double amount) {
		// use other service method
		withdraw(srcAcno, amount);
		deposite(destAcno, amount);
		return amount + " amount is transfered from " + srcAcno + " to " + destAcno;
	}

}
