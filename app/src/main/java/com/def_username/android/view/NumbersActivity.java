package com.def_username.android.view;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.android.miwok.R;

public class NumbersActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_container);

		getSupportFragmentManager().beginTransaction()
				.replace(R.id.container, new NumbersFragment())
				.commit();
	}
}