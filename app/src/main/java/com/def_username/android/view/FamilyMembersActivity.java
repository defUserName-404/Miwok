package com.def_username.android.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.def_username.android.model.Word;
import com.def_username.android.viewmodel.WordAdapter;
import com.example.android.miwok.R;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_family_members);

		// Create a list of familyMembers
		ArrayList<Word> familyMembers = new ArrayList<>();
		familyMembers.add(new Word("father", "әpә", R.drawable.family_father));
		familyMembers.add(new Word("mother", "әṭa", R.drawable.family_mother));
		familyMembers.add(new Word("son", "angsi", R.drawable.family_son));
		familyMembers.add(new Word("daughter", "tune", R.drawable.family_daughter));
		familyMembers.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
		familyMembers.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother));
		familyMembers.add(new Word("older sister", "teṭe", R.drawable.family_older_sister));
		familyMembers.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister));
		familyMembers.add(new Word("grandfather", "ama", R.drawable.family_grandfather));
		familyMembers.add(new Word("grandmother", "paapa", R.drawable.family_grandmother));

		// Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
		// adapter knows how to create list items for each item in the list.
		WordAdapter adapter = new WordAdapter(this, familyMembers, getResources().getColor(R.color.category_family));

		// Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
		// There should be a {@link ListView} with the view ID called list, which is declared in the
		// word_list.xml layout file.
		ListView listView = (ListView) findViewById(R.id.listView);

		// Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
		// {@link ListView} will display list items for each {@link Word} in the list.
		listView.setAdapter(adapter);
	}
}