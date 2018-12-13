package com.techzade.tourdemumbai;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TopSpotsFragment();
        } else if (position == 1){
            return new LocalFavoritesFragment();
        } else if (position == 2){
            return new HotelsFragment();
        }  else if (position == 3){
            return new KidsFriendlyFragment();
        }  else if (position == 4){
            return new MuseumsFragment();
        } else {
            return new ReligiousSitesFragment();
        }
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 6;
    }

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_top_spots);
        } else if (position == 1) {
            return mContext.getString(R.string.category_local_favorites);
        } else if (position == 2) {
            return mContext.getString(R.string.category_hotels);
        } else if (position == 3) {
            return mContext.getString(R.string.category_kid_friendly);
        } else if (position == 4) {
            return mContext.getString(R.string.category_museums);
        } else {
            return mContext.getString(R.string.category_religious_sites);
        }
    }
}
