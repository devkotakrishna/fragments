package com.krishna.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.krishna.fragments.Adapter.ViewPagerAdapter;
import com.krishna.fragments.fragments.FirstFragment;
import com.krishna.fragments.fragments.Secondfragment;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewPager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabId);

        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new FirstFragment(),"sum");
        viewPagerAdapter.addFragment(new Secondfragment(),"Area of Circle");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
