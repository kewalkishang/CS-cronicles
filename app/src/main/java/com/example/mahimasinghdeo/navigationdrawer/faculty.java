package com.example.mahimasinghdeo.navigationdrawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class faculty extends Activity implements AdapterView.OnItemClickListener {
    ListView lv1;
    String items[] = {"pikachu", "charizard", "poliwag", "geodude", "pidgey", "jynx", "bulbasaur", "got"};
    String nums[] = {"1213", "13221", "1231", "13123153", "14141134", "56457", "235756", "2465426"};
    int IMAGES[] = {R.drawable.ic_launcher, R.drawable.abc_cab_background_internal_bg, R.drawable.ic_launcher, R.drawable.abc_cab_background_internal_bg, R.drawable.ic_launcher, R.drawable.abc_cab_background_internal_bg, R.drawable.ic_launcher, R.drawable.abc_cab_background_internal_bg};


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
            holder h;
            if (convertView == null) {
                LayoutInflater INFLATE = getLayoutInflater();
                convertView = INFLATE.inflate(R.layout.single2, parent, false);
                h = new holder(convertView);
                convertView.setTag(h);

            } else {
                h = (holder) convertView.getTag();

            }
            h.TV1.setText(items[position]);
            h.TV2.setText(nums[position]);
            h.im1.setImageResource(IMAGES[position]);
            return convertView;
        }

        class holder {
            TextView TV1, TV2;
            ImageView im1;


            holder(View v) {


                im1 = (ImageView) v.findViewById(R.id.imageView);
                TV1 = (TextView) v.findViewById(R.id.textView);
                TV2 = (TextView) v.findViewById(R.id.textView2);
            }


        }

    }

    //  public static final String NAME="KEWAL";
    // public static final String NUM="NUMBER";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        lv1 = (ListView) findViewById(R.id.listView);

        lv1.setAdapter(new customadapter());
        lv1.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent in = new Intent(faculty.this, faculty2.class);
        in.putExtra("pos", position);
        startActivity(in);

    }
}
