package com.example.baitaptablayoutbottomnav.classes;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.baitaptablayoutbottomnav.fragments.ClassFragment;
import com.example.baitaptablayoutbottomnav.fragments.IDFragment;
import com.example.baitaptablayoutbottomnav.fragments.NameFragment;

public class ClassViewPageAdapter extends FragmentStatePagerAdapter {


    public ClassViewPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Tab1Fragment();
            case 1:
                return new Tab2Fragment();
            default:
                return new Tab1Fragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Lớp sinh hoạt";
            case 1:
                return "Lớp học phần";
            default:
                return "Lớp sinh hoạt";
        }
    }
}
