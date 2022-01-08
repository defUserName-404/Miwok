package com.example.android.activities;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.Numbers;

public class NumbersActivity extends ListActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ListView listNumbers = getListView();

		ArrayAdapter<Numbers> numbersAdapter =
				new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Numbers.NUMBERS);

		listNumbers.setAdapter(numbersAdapter);
	}
}