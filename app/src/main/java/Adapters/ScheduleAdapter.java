package Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import Schedule.Secondsept;
import Schedule.Thirdsept;
import Schedule.firstsept;


/**
 * Created by satyam sehgal on 6/5/2016.
 */
public class ScheduleAdapter extends FragmentPagerAdapter {
    int mNumOfTabs;

    public ScheduleAdapter(FragmentManager fm,int NumOfTabs) {
        super(fm);
        this.mNumOfTabs=NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        
        switch (position){
            case 0: return new firstsept();
            case 1: return new Secondsept();
            case 2: return new Thirdsept();
            default:return null;
        }
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
