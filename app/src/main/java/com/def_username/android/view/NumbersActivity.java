package com.def_username.android.view;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.def_username.android.model.Word;
import com.def_username.android.viewmodel.WordAdapter;
import com.example.android.miwok.R;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_numbers);

		// Create a list of numbers
		ArrayList<Word> numbers = new ArrayList<>();
		numbers.add(new Word("one", "lutti"));
		numbers.add(new Word("two", "otiiko"));
		numbers.add(new Word("three", "tolookosu"));
		numbers.add(new Word("four", "oyyisa"));
		numbers.add(new Word("five", "massokka"));
		numbers.add(new Word("six", "temmokka"));
		numbers.add(new Word("seven", "kenekaku"));
		numbers.add(new Word("eight", "kawinta"));
		numbers.add(new Word("nine", "wo’e"));
		numbers.add(new Word("ten", "na’acha"));

		// Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
		// adapter knows how to create list items for each item in the list.
		WordAdapter adapter = new WordAdapter(this, numbers);

		// Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
		// There should be a {@link ListView} with the view ID called list, which is declared in the
		// word_list.xml layout file.
		ListView listView = (ListView) findViewById(R.id.listView);

		// Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
		// {@link ListView} will display list items for each {@link Word} in the list.
		listView.setAdapter(adapter);
	}
}