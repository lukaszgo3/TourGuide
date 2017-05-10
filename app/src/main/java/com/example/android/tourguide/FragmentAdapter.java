package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new AttractionsFragment();
            case 1:
                return new ShopsFragment();
            case 2:
                return new RestaurantsFragment();
            case 3:
                return new HotelsFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.fragment1);
            case 1:
                return mContext.getString(R.string.fragment2);
            case 2:
                return mContext.getString(R.string.fragment3);
            case 3:
                return mContext.getString(R.string.fragment4);
        }
        return null;
    }
}
