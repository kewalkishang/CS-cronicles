package com.example.mahimasinghdeo.navigationdrawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class groups extends Activity  {
    ListView lv1;
    String items[]={"mil","instrumentation","vtu reeasch"};
    String nums[]={"mil stuff","instrumentation stuff","vtu stuff"};
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


