package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.BankAccount;
import com.nt.service.IBankMgmtService;

@Component
public class VersioningAndTimeStampTestRunner implements CommandLineRunner {
	@Autowired
	private  IBankMgmtService  bankService;

	@Override
	public void run(String... args) throws Exception {
		/*try {
			BankAccount  account=new BankAccount("rani","delhi",100000.0);
			String msg=bankService.openAccount(account);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			String msg=bankService.withdraw(100000000, 1000.0);
			System.out.println(msg);
			BankAccount  account=bankService.showAccountDetails(100000000);
			System.out.println("Account created on::"+account.getCreationTime()+".... last accessed on"+account.getLastAccessTime()+"....modified for::"+account.getUpdationCount()+" times");
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*	try {
				String msg=bankService.deposite(100000000, 1000.0);
				System.out.println(msg);
				BankAccount  account=bankService.showAccountDetails(100000000);
				System.out.println("Account created on::"+account.getCreationTime()+".... last accessed on"+account.getLastAccessTime()+"....modified for::"+account.getUpdationCount()+" times");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		*/
		
		try {
			String msg=bankService.transferMoney(100000000, 1000000021, 1000.0);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main

}//class
