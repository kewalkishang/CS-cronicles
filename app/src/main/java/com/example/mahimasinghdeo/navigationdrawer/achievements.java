package com.example.mahimasinghdeo.navigationdrawer;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class achievements extends ActionBarActivity implements View.OnClickListener {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);
        b1= (Button) findViewById(R.id.button);
        b2= (Button) findViewById(R.id.button2);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.button) {
            Intent intent = new Intent(this,achievements2.class);
            startActivity(intent);
        }else {
            Intent in = new Intent(this, achievements3.class);
            startActivity(in);
        }
    }
}
