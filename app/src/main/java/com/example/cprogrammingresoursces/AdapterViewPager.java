package com.example.cprogrammingresoursces;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class AdapterViewPager extends FragmentPagerAdapter {
    public AdapterViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int pos) {
        switch (pos) {
            case 0:
                Fragment_BookLink fb = new Fragment_BookLink();
                return fb;
            case 1:
                Fragment_ProgrammingResource fp = new Fragment_ProgrammingResource();
                return fp;
            case 2:
                Fragment_JobLink fj = new Fragment_JobLink();
                return fj;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
