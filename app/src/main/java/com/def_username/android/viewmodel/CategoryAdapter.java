package com.def_username.android.viewmodel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.def_username.android.view.ColorsFragment;
import com.def_username.android.view.FamilyMembersFragment;
import com.def_username.android.view.NumbersFragment;
import com.def_username.android.view.PhrasesFragment;

public class CategoryAdapter extends FragmentPagerAdapter {
	private static final int PAGE_COUNT = 4;
	private static final String[] PAGE_TITLES = {"Numbers", "Colors", "Family Members", "Phrases"};

	public CategoryAdapter(@NonNull FragmentManager fm) {
		super(fm);
	}

	@NonNull
	@Override
	public Fragment getItem(int position) {
		switch (position) {
			case 1:
				return new ColorsFragment();
			case 2:
				return new FamilyMembersFragment();
			case 3:
				return new PhrasesFragment();
		}
		return new NumbersFragment();
	}

	@Override
	public int getCount() {
		return PAGE_COUNT;
	}

	@Nullable
	@Override
	public CharSequence getPageTitle(int position) {
		return PAGE_TITLES[position];
	}
}