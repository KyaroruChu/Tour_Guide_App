package com.example.android.tourguideapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    /**
     * Create a new {@link SimpleFragmentPagerAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     * @param behavior should be set to BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
     */
    public SimpleFragmentPagerAdapter(Context context, @NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new MapFragment();
        } else if (position == 1){
            return new ShinjukuFragment();
        } else if (position == 2 ){
            return new HarajukuFragment();
        } else {
            return new GinzaFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getString(R.string.Tokyo_Map_Tab);
        } else if (position == 1){
            return mContext.getString(R.string.Shinjuku_Tab);
        } else if (position == 2){
            return mContext.getString(R.string.Harajuku_Tab);
        } else {
            return mContext.getString(R.string.Ginza_Tab);
        }
    }
}
