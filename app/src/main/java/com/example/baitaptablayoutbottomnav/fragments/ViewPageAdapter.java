package com.example.baitaptablayoutbottomnav.fragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPageAdapter extends FragmentStatePagerAdapter {


    public ViewPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new NameFragment();
            case 1:
                return new ClassFragment();
            case 2:
                return new IDFragment();
            default:
                return new NameFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
