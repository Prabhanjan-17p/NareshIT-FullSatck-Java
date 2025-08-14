package com.nt.service;

public class TestUtilityStringHandle {
	public boolean isPalendrome(String text) {
//		try {
//			Thread.sleep(9000);
//		} catch (Exception e) {
//		}
		String ans = new StringBuffer(text).reverse().toString();
		return ans.equalsIgnoreCase(text);
	}

	public int countVowels(String text) {
		int count = 0;
		for (char c : text.toLowerCase().toCharArray()) {
			if ("aeiou".indexOf(c) != -1) {
				count++;
			}
		}
		return count;
	}

	// 4. Remove all spaces from a string
	public String removeSpaces(String text) {
		return text.replaceAll("\\s+", "");
	}
}
