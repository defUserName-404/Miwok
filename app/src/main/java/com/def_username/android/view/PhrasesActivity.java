package com.def_username.android.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android.miwok.R;

public class PhrasesActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_container);

		getSupportFragmentManager().beginTransaction()
				.replace(R.id.container, new PhrasesFragment())
				.commit();
	}
}