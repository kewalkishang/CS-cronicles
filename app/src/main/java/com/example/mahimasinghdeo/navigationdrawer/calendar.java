package com.example.mahimasinghdeo.navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;




public class calendar extends FragmentActivity {
    ViewPager viewPager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        viewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager=getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));
    }

    class MyAdapter extends FragmentStatePagerAdapter
    {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            Fragment fragment=null;
            if(i==0) {
                fragment = new fraga();
            }
            if(i==1) {
                fragment = new fragb();
            }
            if(i==2) {
                fragment = new fragc();
            }
            if(i==3) {
                fragment = new fragd();
            }
            if(i==4) {
                fragment = new frage();
            }

            return fragment;
        }


        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if(position==0){
                return "Jan";

            }
            if(position==1){
                return "Feb";

            }if(position==2){
                return "March";

            }
            if(position==3){
                return "April";

            }
            if(position==4){
                return "May";

            }
            return null;
        }
    }


}