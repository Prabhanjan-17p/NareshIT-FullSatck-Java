package com.nt.service;

public interface ILoginMgmtService {
	public boolean login(String username, String password);
	public String addUser(String username, String pwd);
}
