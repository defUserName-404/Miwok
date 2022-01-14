/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.def_username.android.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.def_username.android.viewmodel.CategoryAdapter;
import com.example.android.miwok.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ViewPager categoryViewPager = findViewById(R.id.category_viewpager);
		CategoryAdapter categoryAdapter = new CategoryAdapter(getSupportFragmentManager());
		categoryViewPager.setAdapter(categoryAdapter);

		TabLayout tabs = findViewById(R.id.tabs);
		tabs.setupWithViewPager(categoryViewPager);
	}
}