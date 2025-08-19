package com.nt.service;

import com.nt.dao.ILoginDAO;

public class LoginImpltService implements ILoginMgmtService {

	private ILoginDAO logindao;

	public LoginImpltService(ILoginDAO logindao) {
		super();
		this.logindao = logindao;
	}

	@Override
	public boolean login(String username, String password) {
		if (username.equalsIgnoreCase("") || password.equalsIgnoreCase("")) {
			throw new IllegalArgumentException("Invalid inputs");
		}

		int count = logindao.authenticate(username, password);

		if (count == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String addUser(String username, String pwd) {
		if (!username.equalsIgnoreCase("") && !pwd.equalsIgnoreCase("")) {
			logindao.addNewUser(username, pwd);
			return "User Added";
		} else {
			return "User Not Added";
		}
	}

}
