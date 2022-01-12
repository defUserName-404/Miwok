package com.def_username.android.model;

import android.media.MediaPlayer;

public class MediaPlayerHelper {
	public static MediaPlayer releaseMediaPlayer(MediaPlayer soundPlayer) {
		// If the media player is not null, then it may be currently playing a sound.
		soundPlayer.release();
		return null;
	}
}