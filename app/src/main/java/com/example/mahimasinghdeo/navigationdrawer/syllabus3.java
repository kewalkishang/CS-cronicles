package com.example.mahimasinghdeo.navigationdrawer;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class syllabus3 extends ActionBarActivity {
  int [] textual={R.string.math};
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus3);
        tv= (TextView) findViewById(R.id.tv3);
        Intent intent=getIntent();
        int y=intent.getIntExtra("name",-1);

        tv.setText(textual[y]);

    }

}
