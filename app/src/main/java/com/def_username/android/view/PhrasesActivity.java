package com.def_username.android.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.def_username.android.model.Word;
import com.def_username.android.viewmodel.WordAdapter;
import com.example.android.miwok.R;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_phrases);

		// Create a list of phrases
		ArrayList<Word> phrases = new ArrayList<>();
		phrases.add(new Word("Where are you going?", "minto wuksus?"));
		phrases.add(new Word("What is your name?", "tinnә oyaase'nә?"));
		phrases.add(new Word("My name is...", "oyaaset..."));
		phrases.add(new Word("How are you feeling?", "michәksәs?"));
		phrases.add(new Word("I’m feeling good.", "kuchi achit"));
		phrases.add(new Word("Are you coming?", "әәnәs'aa?"));
		phrases.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
		phrases.add(new Word("I’m coming.", "әәnәm"));
		phrases.add(new Word("Let’s go.", "yoowutis"));
		phrases.add(new Word("Come here.", "әnni'nem"));

		// Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
		// adapter knows how to create list items for each item in the list.
		WordAdapter adapter = new WordAdapter(this, phrases, getResources().getColor(R.color.category_phrases));

		// Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
		// There should be a {@link ListView} with the view ID called list, which is declared in the
		// word_list.xml layout file.
		ListView listView = (ListView) findViewById(R.id.listView);

		// Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
		// {@link ListView} will display list items for each {@link Word} in the list.
		listView.setAdapter(adapter);
	}
}