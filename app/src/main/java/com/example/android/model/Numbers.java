package com.example.android.model;

public class Numbers {
	private final String number, translation;

	public static final Numbers[] NUMBERS = {
			new Numbers("One", "One"),
			new Numbers("Two", "Two"),
			new Numbers("Three", "Three"),
			new Numbers("Four", "Four"),
			new Numbers("Five", "Five"),
			new Numbers("Six", "Six"),
			new Numbers("Seven", "Seven"),
			new Numbers("Eight", "Eight"),
			new Numbers("Nine", "Nine"),
			new Numbers("Ten", "Ten")
	};

	public Numbers(String number, String translation) {
		this.number = number;
		this.translation = translation;
	}

	public String getNumber() {
		return number;
	}

	public String getTranslation() {
		return translation;
	}
}