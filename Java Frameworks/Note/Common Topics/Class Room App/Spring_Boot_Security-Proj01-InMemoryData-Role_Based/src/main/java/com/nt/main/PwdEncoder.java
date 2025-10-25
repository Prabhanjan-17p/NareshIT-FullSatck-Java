package com.nt.main;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PwdEncoder {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String pass1 = encoder.encode("raja");
		String pass2 = encoder.encode("kanha");
		String pass3 = encoder.encode("babu");
		String pass4 = encoder.encode("nayak");

		System.out.println(pass1);
		System.out.println(pass2);
		System.out.println(pass3);
		System.out.println(pass4);
	}

}
