package com.example.mahimasinghdeo.navigationdrawer;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class faculty2 extends ActionBarActivity {
    TextView tv1;
    ImageView imageView;
  //  String items[] = {" Dr. Ramesh Babu D.R", " Dr. Amutha S ", " Mr. Sasidhar B ", " Mr. Amaresha K.S", " Mr. Anil Sagar T", " Ms. Anitha M", " Mrs. Annapoorna ", "Anupama Vijay Kumar"," Dr. Arbind Kumar Gupta"," Mr. Nakatha Arun Kumar"," Mrs. Asha Philip"," Ms. Asnika.S"," Bhanupriya M P"," Prof. Bhaskara Rao"," Mr. Deepak.G","  Dhara K N"," Mr. Harish Kumar N","  Mrs. Kusuma M"," Mrs. Mamatha.R","  Mr. Mohd. Tajuddin"," Mrs. Monika P"," Mr. Nagaraj J"," Ms. Nayana N "," Mrs. Poornima A.B"," Mr. Prasad A.M ","  Mrs. Preeti Satish","  Prof. Ramakrishna K.A","  Mrs. Rashmi S.R", "  Mr. Ravichandra H","  Mrs. Sahana Damale", "  Mrs. Sandhya N ","  Mr. Sasikumar Gurumoorthy","  Mrs. Shubha Bhat", " Mrs. SmeraLingesh"," Mrs. Sonal N Kharecha"," Mrs. Sunitha M S","  Mrs. Swetha M D","  Dr. S. Venkatesan","  Mrs. Vindhya M"};
   int nums[] = {R.string.ramesh,R.string.amutha,R.string.sasidhar,R.string.amaresha,R.string.anil,R.string.anitha,R.string.annapoorna,R.string.anupama,R.string.arbind,R.string.arun,R.string.asha,R.string.asnika,R.string.bhanu,R.string.bhaskara,R.string.deppak,R.string.dhara,R.string.harish,R.string.kusuma,R.string.mamtha,R.string.taj,R.string.moknika,R.string.nagaraj,R.string.nayana,R.string.poornima,R.string.prasad,R.string.preeti,R.string.rama,R.string.rashmi,R.string.ravi,R.string.sahana,R.string.sandhya,R.string.sasi,R.string.shubha,R.string.smera,R.string.sonal,R.string.sunitha,R.string.swetha,R.string.venkat,R.string.vindhya};
    int IMAGES[] = {R.drawable.f1,R.drawable.f2,R.drawable.sasi,R.drawable.amaresh,R.drawable.anil,R.drawable.anitha,R.drawable.annapoor,R.drawable.anupam,R.drawable.arbi,R.drawable.arun,R.drawable.asha,R.drawable.asnika,R.drawable.bhanu,R.drawable.bhask,R.drawable.deep,R.drawable.dhar,R.drawable.haris,R.drawable.kusum,R.drawable.mamatha,R.drawable.mohd,R.drawable.monika,R.drawable.nagar,R.drawable.naya,R.drawable.poorni,R.drawable.prasa,R.drawable.preet,R.drawable.ramak,R.drawable.rashm,R.drawable.ravi,R.drawable.sah,R.drawable.sand,R.drawable.sasik,R.drawable.shu,R.drawable.sme,R.drawable.son,R.drawable.suni,R.drawable.swe,R.drawable.venkat,R.drawable.vindh};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty2);

        Intent intent=getIntent();
        int y =intent.getIntExtra("pos",-1);
        //tv1= (TextView) findViewById(R.id.textView);
        tv1= (TextView) findViewById(R.id.textView2);
        imageView= (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(IMAGES[y]);

        tv1.setText(nums[y]);

    }


}

