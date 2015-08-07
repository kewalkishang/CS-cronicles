package com.example.mahimasinghdeo.navigationdrawer;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class groupMainActivity2 extends ActionBarActivity {
    String name[] = {"about group " +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "" +
            "\n" ,"aisdashdasihdasid","Asduagsdgaisd","adsaisdaushdaccasc"};
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_main_activity2);
        tv = (TextView) findViewById(R.id.tv3);
        Intent intent = getIntent();
        int y = intent.getIntExtra("name", -1);
        tv.setText(name[y]);
    }
}

