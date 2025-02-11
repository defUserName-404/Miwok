package com.def_username.android.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.def_username.android.model.Word;
import com.def_username.android.viewmodel.WordAdapter;
import com.example.android.miwok.R;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_colors);

		// Create a list of colors
		ArrayList<Word> colors = new ArrayList<>();
		colors.add(new Word
				("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
		colors.add(new Word
				("green", "chokokki", R.drawable.color_green, R.raw.color_green));
		colors.add(new Word
				("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
		colors.add(new Word
				("black", "ṭopoppi", R.drawable.color_black, R.raw.color_black));
		colors.add(new Word
				("white", "kululli", R.drawable.color_white, R.raw.color_white));
		colors.add(new Word
				("gray", "kelelli", R.drawable.color_gray, R.raw.color_gray));
		colors.add(new Word
				("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
		colors.add(new Word
				("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

		// Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
		// adapter knows how to create list items for each item in the list.
		WordAdapter adapter = new WordAdapter(this, colors,R.color.category_colors);

		// Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
		// There should be a {@link ListView} with the view ID called list, which is declared in the
		// word_list.xml layout file.
		ListView listView = findViewById(R.id.listView);

		// Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
		// {@link ListView} will display list items for each {@link Word} in the list.
		listView.setAdapter(adapter);
	}
}