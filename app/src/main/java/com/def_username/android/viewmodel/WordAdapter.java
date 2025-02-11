package com.def_username.android.viewmodel;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.def_username.android.model.MediaPlayerHelper;
import com.def_username.android.model.Word;
import com.example.android.miwok.R;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
	private int colorResourceId;
	private ImageView playButtonIconImageView;
	private MediaPlayer soundPlayer;

	/**
	 * Create a new {@link WordAdapter} object.
	 *
	 * @param context         is the current context (i.e. Activity) that the adapter is being created in.
	 * @param words           is the list of {@link Word}s to be displayed.
	 * @param colorResourceId is the color that needs too be set for the textviews' background.
	 */

	public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
		super(context, 0, words);
		this.colorResourceId = colorResourceId;
	}

	public WordAdapter(Context context) {
		super(context, 0);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// Check if an existing view is being reused, otherwise inflate the view
		View listItemView = convertView;
		if (listItemView == null)
			listItemView = LayoutInflater.from
					(getContext()).inflate(R.layout.list_layout, parent, false);

		// Get the {@link Word} object located at this position in the list
		Word currentWord = getItem(position);

		// find the linearlayouts that hold the two textviews
		LinearLayout linearLayout = listItemView.findViewById(R.id.textviews);
		// Set the color of the linear layout.
		linearLayout.setBackgroundColor(ContextCompat.getColor(getContext(), colorResourceId));
		// find the imageview icon to update while playing the audio
		playButtonIconImageView = listItemView.findViewById(R.id.play_icon_imageview);
		// audio file needs to be played when the linear layout is clicked
		// TODO: Image icon for playbutton isn't changing while audio is playing
		linearLayout.setOnClickListener(view -> {
			if (soundPlayer != null)
				soundPlayer = MediaPlayerHelper.releaseMediaPlayer(soundPlayer);

			soundPlayer = MediaPlayer.create(linearLayout.getContext(), currentWord.getAudioResourceId());
			soundPlayer.start();
			playButtonIconImageView.setImageResource(R.drawable.ic_baseline_pause_24);

			soundPlayer.setOnCompletionListener(listener -> {
				soundPlayer = MediaPlayerHelper.releaseMediaPlayer(soundPlayer);
				playButtonIconImageView.setImageResource(R.drawable.ic_baseline_play_arrow_24);
			});
		});

		// Find the miwok TextView in the list_layout.xml layout.
		TextView miwokTextView = listItemView.findViewById(R.id.miwok_textview);
		// Get the miwok translation from the currentWord object and set this text on the miwok TextView.
		miwokTextView.setText(currentWord.getMiwokTranslation());

		// Find the translation TextView in the list_layout.xml layout.
		TextView defaultTextView = listItemView.findViewById(R.id.translation_textview);
		// Get the default translation from the currentWord object and set this text on the default TextView.
		defaultTextView.setText(currentWord.getDefaultTranslation());

		// Find the associated ImageView in the list_layout.xml layout.
		ImageView imageView = listItemView.findViewById(R.id.default_imageview);
		// Get the default image from the currentWord object and set this image on the default TextView.
		if (currentWord.hasImage())
			imageView.setImageResource(currentWord.getImageResourceId());
		else
			imageView.setVisibility(View.GONE);

		// Return the whole list item layout so that it can be shown in the ListView.
		return listItemView;
	}
}