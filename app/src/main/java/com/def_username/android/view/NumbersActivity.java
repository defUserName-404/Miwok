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
		numbers.add(new Word("one", "lutti", R.drawable.number_one));
		numbers.add(new Word("two", "otiiko", R.drawable.number_two));
		numbers.add(new Word("three", "tolookosu", R.drawable.number_three));
		numbers.add(new Word("four", "oyyisa", R.drawable.number_four));
		numbers.add(new Word("five", "massokka", R.drawable.number_five));
		numbers.add(new Word("six", "temmokka", R.drawable.number_six));
		numbers.add(new Word("seven", "kenekaku", R.drawable.number_seven));
		numbers.add(new Word("eight", "kawinta", R.drawable.number_eight));
		numbers.add(new Word("nine", "wo’e", R.drawable.number_nine));
		numbers.add(new Word("ten", "na’acha", R.drawable.number_ten));

		// Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
		// adapter knows how to create list items for each item in the list.
		WordAdapter adapter = new WordAdapter(this, numbers, getResources().getColor(R.color.category_numbers));

		// Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
		// There should be a {@link ListView} with the view ID called list, which is declared in the
		// word_list.xml layout file.
		ListView listView = (ListView) findViewById(R.id.listView);

		// Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
		// {@link ListView} will display list items for each {@link Word} in the list.
		listView.setAdapter(adapter);
	}
}