package com.example.mahimasinghdeo.navigationdrawer;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class achievements3 extends ActionBarActivity {
    ListView lv1;
    String items[]={"Violet","Indigo","Blue","Green","Yellow","Orange","Red"};//create the headings of our listviews
    String num[]={"0001","0010","0011","0100","0101","0110","0111"};




    public class customadapter extends BaseAdapter {

        @Override
        public int getCount() {
            return items.length;
        }

        @Override
        public Object getItem(int position) {
            return items[position];
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater mbindu = getLayoutInflater();
            convertView = mbindu.inflate(R.layout.single2, parent, false);

            TextView tv1 = (TextView) convertView.findViewById(R.id.textView);
            TextView tv2 = (TextView) convertView.findViewById(R.id.textView2);
            tv1.setText(items[position]);
            tv2.setText(num[position]);



            return convertView;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements3);

        lv1=(ListView)findViewById(R.id.listView);
        customadapter custom=new customadapter();
        lv1.setAdapter(custom);

    }
}



