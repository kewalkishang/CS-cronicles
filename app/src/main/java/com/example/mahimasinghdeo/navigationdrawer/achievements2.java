package com.example.mahimasinghdeo.navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;



public class achievements2 extends FragmentActivity {
    ViewPager viewPager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements2);

        viewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));
    }


    class MyAdapter extends FragmentStatePagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            Fragment fragment = null;
            if (i == 0) {
                fragment = new fragaa();
            }
            if(i==1) {
                fragment = new fragbb();
            }
            if(i==2) {
                fragment = new fragcc();
            }
            if(i==3) {
                fragment = new fragdd();
            }


//        }
            return fragment;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if (position == 0) {
                return "2012";

            }
            if (position == 1) {
                return "2013";

            }
            if (position == 2) {
                return "2014";

            }
            if (position == 3) {
                return "2015";

            }

            return null;
        }

        @Override
        public int getCount() {
            return 4;
        }
    }
}
