package com.nt.dao;

public interface ILoginDAO {
	public int authenticate(String username,String password);
	public String addNewUser(String user, String pwd);
}
