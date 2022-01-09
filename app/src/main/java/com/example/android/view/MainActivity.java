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
package com.example.android.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.android.miwok.R;
import com.example.android.miwok.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        activityMainBinding.numbers.setOnClickListener(view -> {
            Intent startNumbersActivity = new Intent(this, NumbersActivity.class);
            startActivity(startNumbersActivity);
        });

        activityMainBinding.family.setOnClickListener(view -> {
            Intent startFamilyActivity = new Intent(this, FamilyMembersActivity.class);
            startActivity(startFamilyActivity);
        });

        activityMainBinding.colors.setOnClickListener(view -> {
            Intent startColorsActivity = new Intent(this, ColorsActivity.class);
            startActivity(startColorsActivity);
        });

        activityMainBinding.phrases.setOnClickListener(view -> {
            Intent startFamilyActivity = new Intent(this, PhrasesActivity.class);
            startActivity(startFamilyActivity);
        });
    }
}