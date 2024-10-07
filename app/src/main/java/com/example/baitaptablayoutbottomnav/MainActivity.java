package com.example.baitaptablayoutbottomnav;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import com.example.baitaptablayoutbottomnav.fragments.ViewPageAdapter;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        bnv = findViewById(R.id.bottom_nav);

        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                switch (position){
                    case 0:
                        bnv.getMenu().findItem(R.id.menu_name).setChecked(true);
                        break;
                    case 1:
                        bnv.getMenu().findItem(R.id.menu_class).setChecked(true);
                        break;
                    case 2:
                        bnv.getMenu().findItem(R.id.menu_id_num).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.menu_name){
                    viewPager.setCurrentItem(0);
                }
                if (item.getItemId() == R.id.menu_class){
                    viewPager.setCurrentItem(1);
                }
                if (item.getItemId() == R.id.menu_id_num){
                    viewPager.setCurrentItem(2);
                }
                return  true;
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}