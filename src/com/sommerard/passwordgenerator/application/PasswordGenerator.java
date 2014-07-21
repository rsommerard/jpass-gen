package com.sommerard.passwordgenerator.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author Romain SOMMERARD
 */
public class PasswordGenerator {

	private int passwordLength;
	private boolean number;
	private boolean specialChars;
	private boolean uppercase;
	private boolean lowercase;

	public PasswordGenerator() {
		this.passwordLength = 8;
		this.number = true;
		this.specialChars = true;
		this.uppercase = true;
		this.lowercase = true;
	}

	public int getPasswordLength() {
		return this.passwordLength;
	}

	public boolean isNumberActivate() {
		return this.number;
	}

	public boolean isSpecialCharsActivate() {
		return this.specialChars;
	}

	public boolean isUppercaseActivate() {
		return this.uppercase;
	}

	public boolean isLowercaseActivate() {
		return this.lowercase;
	}

	public void setNumberActivate(boolean activate) {
		this.number = activate;
		this.setDefault();
	}

	public void setSpecialCharsActivate(boolean activate) {
		this.specialChars = activate;
		this.setDefault();
	}

	public void setUppercaseActivate(boolean activate) {
		this.uppercase = activate;
		this.setDefault();
	}

	public void setLowercaseActivate(boolean activate) {
		this.lowercase = activate;
		this.setDefault();
	}

	public void setPasswordLength(int length) {
		this.passwordLength = length;
	}

	private void setDefault() {
		if (!this.number && !this.lowercase && !this.specialChars
				&& !this.uppercase)
			this.lowercase = true;
	}

	private List<String> createTabOfChar() {
		List<String> tabOfChar = new ArrayList<String>();

		if (this.number)
			tabOfChar.addAll(this.addNumber());

		if (this.specialChars)
			tabOfChar.addAll(this.addSpecialChars());

		if (this.uppercase)
			tabOfChar.addAll(this.addUppercase());

		if (this.lowercase)
			tabOfChar.addAll(this.addLowercase());

		Collections.shuffle(tabOfChar);

		return tabOfChar;
	}

	private List<String> addNumber() {
		List<String> numberList = new ArrayList<String>();

		numberList.add("0");
		numberList.add("1");
		numberList.add("2");
		numberList.add("3");
		numberList.add("4");
		numberList.add("5");
		numberList.add("6");
		numberList.add("7");
		numberList.add("8");
		numberList.add("9");

		return numberList;
	}

	private List<String> addSpecialChars() {
		List<String> specialCharsList = new ArrayList<String>();

		specialCharsList.add("~");
		specialCharsList.add("!");
		specialCharsList.add("@");
		specialCharsList.add("#");
		specialCharsList.add("$");
		specialCharsList.add("%");
		specialCharsList.add("^");
		specialCharsList.add("&");
		specialCharsList.add("*");

		specialCharsList.add("(");
		specialCharsList.add(")");
		specialCharsList.add("-");
		specialCharsList.add("_");
		specialCharsList.add("=");
		specialCharsList.add("+");
		specialCharsList.add("[");
		specialCharsList.add("]");
		specialCharsList.add("{");

		specialCharsList.add("}");
		specialCharsList.add(";");
		specialCharsList.add(":");
		specialCharsList.add(",");
		specialCharsList.add(".");
		specialCharsList.add("<");
		specialCharsList.add(">");
		specialCharsList.add("/");
		specialCharsList.add("?");

		return specialCharsList;
	}

	private List<String> addUppercase() {
		List<String> uppercaseList = new ArrayList<String>();

		uppercaseList.add("A");
		uppercaseList.add("B");
		uppercaseList.add("C");
		uppercaseList.add("D");
		uppercaseList.add("E");
		uppercaseList.add("F");
		uppercaseList.add("G");
		uppercaseList.add("H");
		uppercaseList.add("I");
		uppercaseList.add("J");
		uppercaseList.add("K");
		uppercaseList.add("L");
		uppercaseList.add("M");
		uppercaseList.add("N");
		uppercaseList.add("O");
		uppercaseList.add("P");
		uppercaseList.add("Q");
		uppercaseList.add("R");
		uppercaseList.add("S");
		uppercaseList.add("T");
		uppercaseList.add("U");
		uppercaseList.add("V");
		uppercaseList.add("W");
		uppercaseList.add("X");
		uppercaseList.add("Y");
		uppercaseList.add("Z");

		return uppercaseList;
	}

	private List<String> addLowercase() {
		List<String> lowercaseList = new ArrayList<String>();

		lowercaseList.add("a");
		lowercaseList.add("b");
		lowercaseList.add("c");
		lowercaseList.add("d");
		lowercaseList.add("e");
		lowercaseList.add("f");
		lowercaseList.add("g");
		lowercaseList.add("h");
		lowercaseList.add("i");
		lowercaseList.add("j");
		lowercaseList.add("k");
		lowercaseList.add("l");
		lowercaseList.add("m");
		lowercaseList.add("n");
		lowercaseList.add("o");
		lowercaseList.add("p");
		lowercaseList.add("q");
		lowercaseList.add("r");
		lowercaseList.add("s");
		lowercaseList.add("t");
		lowercaseList.add("u");
		lowercaseList.add("v");
		lowercaseList.add("w");
		lowercaseList.add("x");
		lowercaseList.add("y");
		lowercaseList.add("z");

		return lowercaseList;
	}

	private boolean isApprovePassword(String password) {
		if (this.number)
			if (!password.matches(".*\\d.*"))
				return false;

		if (this.specialChars)
			if (!password.matches(".*\\W.*"))
				return false;

		if (this.uppercase)
			if (!password.matches(".*[A-Z].*"))
				return false;

		if (this.lowercase)
			if (!password.matches(".*[a-z].*"))
				return false;

		return true;
	}

	public String generatePassword() {
		int randNumber;
		Random rand = new Random();
		List<String> tabOfChars = this.createTabOfChar();
		String passwordGenerated;

		do {
			passwordGenerated = "";
			for (int i = 0; i < this.passwordLength; i++) {
				randNumber = rand.nextInt(tabOfChars.size());
				passwordGenerated += tabOfChars.get(randNumber);
			}
		} while (!this.isApprovePassword(passwordGenerated));

		return passwordGenerated;
	}
}
