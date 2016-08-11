package Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import Events.Codesprint;
import Events.Electronics;
import Events.Entrepreneurial;
import Events.Nontech;
import Events.Programming;
import Events.Varta;
import Events.Workshops;

/**
 * Created by satyam sehgal on 6/4/2016.
 */
public class TabPagerAdapter extends FragmentPagerAdapter {
  int mNumOfTabs;

    public TabPagerAdapter(FragmentManager fm,int NumOfTabs) {
        super(fm);
        this.mNumOfTabs=NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new Electronics();
            case 1: return new Programming();
            case 2: return new Nontech();
            case 3: return new Codesprint();
            case 4: return new Entrepreneurial();
            case 5: return new Varta();
            case 6: return new Workshops();
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

   /* @Override
    public CharSequence getPageTitle(int position){
        return  "Programming" ;
    }*/
}
