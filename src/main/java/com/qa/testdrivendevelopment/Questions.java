package com.qa.testdrivendevelopment;

public class Questions {
	/**
	 * There is a well known mnemonic which goes "I before E, except after C", which
	 * is used to determine which order "ei" or "ie" should be in a word.
	 * 
	 * Write a function which returns the boolean True if a string follows the
	 * mnemonic, and returns the boolean False if not.
	 * 
	 * For Example: iBeforeE("ceiling") → True iBeforeE("believe") → True
	 * iBeforeE("glacier") → False iBeforeE("height") → False
	 */
	public boolean iBeforeE(String input) {

		String a = input;

		if (a.contains("cie")) {
			return false;
		} else if (a.contains("ie") || a.contains("cei")) {
			return true;
		} else {
			return false;
		}
	}
}
