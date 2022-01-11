package com.def_username.android.model;

public class Word {
	private final String defaultTranslation, miwokTranslation;
	private final int audioResourceId;
	private int imageResourceId = -1;

	/**
	 * This constructor is called only when there is no need of images with the associated word.
	 * @param defaultTranslation is the translation of the Miwok word in the default language.
	 * @param miwokTranslation is the given word.
	 * @param audioResourceId is the audio sound for miwok pronunciation of the word
	 */
	public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
		this.defaultTranslation = defaultTranslation;
		this.miwokTranslation = miwokTranslation;
		this.audioResourceId = audioResourceId;
	}

	/**
	 * This constructor is called only when there needs to be an image with the associated word.
	 * @param defaultTranslation is the translation of the Miwok word in the default language.
	 * @param miwokTranslation is the given word.
	 * @param imageResourceId is the drawable resource id of the image that needs to be displayed.
	 * @param audioResourceId is the audio sound for miwok pronunciation of the word
	 */
	public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
		this.defaultTranslation = defaultTranslation;
		this.miwokTranslation = miwokTranslation;
		this.imageResourceId = imageResourceId;
		this.audioResourceId = audioResourceId;
	}

	public String getDefaultTranslation() {
		return defaultTranslation;
	}

	public String getMiwokTranslation() {
		return miwokTranslation;
	}

	public int getImageResourceId() {
		return imageResourceId;
	}

	public int getAudioResourceId() {
		return audioResourceId;
	}

	public boolean hasImage() {
		return (imageResourceId != -1);
	}
}