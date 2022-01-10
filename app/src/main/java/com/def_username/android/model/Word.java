package com.def_username.android.model;

public class Word {
	private final String defaultTranslation, miwokTranslation;

	public Word(String defaultTranslation, String miwokTranslation) {
		this.defaultTranslation = defaultTranslation;
		this.miwokTranslation = miwokTranslation;
	}

	public String getDefaultTranslation() {
		return defaultTranslation;
	}

	public String getMiwokTranslation() {
		return miwokTranslation;
	}
}