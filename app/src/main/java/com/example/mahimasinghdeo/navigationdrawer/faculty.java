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
    String items[] = {" Dr. Ramesh Babu D.R", " Dr. Amutha S ", " Mr. Sasidhar B ", " Mr. Amaresha K.S", " Mr. Anil Sagar T", " Ms. Anitha M", " Mrs. Annapoorna ", "Anupama Vijay Kumar"," Dr. Arbind Kumar Gupta"," Mr. Nakatha Arun Kumar"," Mrs. Asha Philip"," Ms. Asnika.S"," Bhanupriya M P"," Prof. Bhaskara Rao"," Mr. Deepak.G","  Dhara K N"," Mr. Harish Kumar N","  Mrs. Kusuma M"," Mrs. Mamatha.R","  Mr. Mohd. Tajuddin"," Mrs. Monika P"," Mr. Nagaraj J"," Ms. Nayana N "," Mrs. Poornima A.B"," Mr. Prasad A.M ","  Mrs. Preeti Satish","  Prof. Ramakrishna K.A","  Mrs. Rashmi Reddy","Mrs. Rashmi S.R ", "  Mr. Ravichandra H","  Mrs. Sahana Damale", "  Mrs. Sandhya N ","  Mr. Sasikumar Gurumoorthy","  Mrs. Shubha Bhat", " Mrs. SmeraLingesh"," Mrs. Sonal N Kharecha"," Mrs. Sunitha M S","  Mrs. Swetha M D","  Dr. S. Venkatesan","  Mrs. Vindhya M"};

    String nums[] = {"   Professor & Head","  Professor","  Asst. Prof.","  Asst. Prof.","  Asst. Prof"," Asst. Prof","  Asst. Prof"," Asst. Prof"," Professor "," Asst. Prof"," Asst. Prof"," Asst. Prof"," Asst. Prof"," Asst. Prof"," Asst. Prof"," Asst. Prof"," Asst. Prof"," Asst. Prof"," Asst. Prof"," Asst. Prof"," Asst. Prof."," Asst. Prof"," Asst. Prof"," Asst. Prof"," Asst. Prof"," Asst. Prof"," Prof."," Asst. Prof"," Asst. Prof"," Asst. Prof"," Asst. Prof"," Asst. Prof"," Asst. Prof"," Asst. Prof"," Asst. Prof"," Asst. Prof"," Asst. Prof"," Professor"," Asst. Prof."};
    int IMAGES[] = {R.drawable.f1,R.drawable.f2,R.drawable.sasi,R.drawable.amaresh,R.drawable.anil,R.drawable.anitha,R.drawable.annapoor,R.drawable.anupam,R.drawable.arbi,R.drawable.arun,R.drawable.asha,R.drawable.asnika,R.drawable.bhanu,R.drawable.bhask,R.drawable.deep,R.drawable.dhar,R.drawable.haris,R.drawable.kusum,R.drawable.mamatha,R.drawable.mohd,R.drawable.monika,R.drawable.nagar,R.drawable.naya,R.drawable.poorni,R.drawable.prasa,R.drawable.preet,R.drawable.ramak,R.drawable.rashm,R.drawable.rash,R.drawable.ravi,R.drawable.sah,R.drawable.sand,R.drawable.sasik,R.drawable.shu,R.drawable.sme,R.drawable.son,R.drawable.suni,R.drawable.swe,R.drawable.venkat,R.drawable.vindh};


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
