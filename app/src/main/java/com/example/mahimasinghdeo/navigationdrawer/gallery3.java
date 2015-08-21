package com.example.mahimasinghdeo.navigationdrawer;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.widget.ImageView;


public class gallery3 extends ActionBarActivity {
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery3);
        im= (ImageView) findViewById(R.id.imageview);
        Intent intent=getIntent();
        int y=intent.getIntExtra("pic",-1);
        im.setImageResource(y);

    }

}
