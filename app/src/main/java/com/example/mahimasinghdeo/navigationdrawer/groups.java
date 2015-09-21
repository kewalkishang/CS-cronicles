package com.example.mahimasinghdeo.navigationdrawer;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class groups extends Activity  {
    ListView lv1;
    String items[]={"Microsoft Innovation Lab","Centre for Ophtalmic Instrumentation & Technology","VTU Research Lab"};
    String nums[]={"Microsoft Innovation lab (MILs) are facilities that provide world-class resources and support for students, entrepreneurs and startups, accelerating the creation of new companies, jobs, and growth of the local software ecosystem.\n \nThe MICs play a critical role in bridging the gap between technology and the needs of the world. \n \n Faculty incharge -\nMrs. Poornima A.B \n Mrs.Shubha Bhat \n Mrs. Rashmi S.R ","Research concentrates on flourescence spectroscopy in the eye designing instruments for automating,thus the physiological parameters of our interest could be measured. \n The data collected is then processed and compared from a normal person's eye to a diabetic person with contact lens \n \n In collaboratiion with Dr.S.P.Srinivas,IU ,Bloomingtom,USA \n \n Faculty incharge -\n Ms. Asnika.S \nMrs. Sahana Damale     ","\n" +
            "VTU has Research Centres in more than 75 affiliated institutions.  More than thousand research scholars are working for Master's and Doctoral degree programmes of VTU. "};
    public class customadapter extends BaseAdapter {


        @Override
        public int getCount() {
            return items.length;
        }

        @Override
        public Object getItem(int position) {
            return items[position];
        }


        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            holder h;
            if (convertView == null) {
                LayoutInflater INFLATE = getLayoutInflater();
                convertView = INFLATE.inflate(R.layout.single4, parent, false);
                h = new holder(convertView);
                convertView.setTag(h);

            } else {
                h = (holder) convertView.getTag();

            }
            h.TV1.setText(items[position]);
            h.TV2.setText(nums[position]);

            return convertView;
        }

        class holder {
            TextView TV1, TV2;



            holder(View v) {


                TV1 = (TextView) v.findViewById(R.id.textView);
                TV2 = (TextView) v.findViewById(R.id.textView2);
            }


        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);
        lv1=(ListView)findViewById(R.id.listView);

        lv1.setAdapter(new customadapter());



    }

}


