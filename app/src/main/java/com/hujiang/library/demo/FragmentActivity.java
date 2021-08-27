/*
 * FragmentActivity      2016-03-01
 * Copyright (c) 2016 hujiang Co.Ltd. All right reserved(http://www.hujiang.com).
 * 
 */

package com.hujiang.library.demo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

/**
 * class description here
 *
 * @author simon
 * @version 1.0.0
 * @since 2016-03-01
 */
public class FragmentActivity extends androidx.fragment.app.FragmentActivity {

    ViewPager mViewPager;
    Fragment imageFragment;
    Fragment textFragment;
    Fragment kotlinFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_activity_layout);

        mViewPager = (ViewPager)findViewById(R.id.fragment_pager);

        imageFragment = Fragment.instantiate(this, ImageFragment.class.getName());
        textFragment = Fragment.instantiate(this, TextFragment.class.getName());
        kotlinFragment = Fragment.instantiate(this, KotlinFragment.class.getName());

        mViewPager.setOffscreenPageLimit(4);
        mViewPager.setCurrentItem(0);
        mViewPager.setAdapter(new FPagerAdapter(getSupportFragmentManager()));

        //调用kotlin类，aspectj无法捕获方法
        new Greeter().greet();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    class FPagerAdapter extends FragmentPagerAdapter {

        public FPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return imageFragment;
            } else if (position == 1) {
                return textFragment;
            } else {
                return kotlinFragment;
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}