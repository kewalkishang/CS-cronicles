package com.example.mahimasinghdeo.navigationdrawer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class syllabus2 extends Activity implements AdapterView.OnItemClickListener
{
    ListView lv1;
    String items[] = {"MATHS III", "EC", "LD", "DMS", "DS", "OOPS","DS LAB","EC/LD LAB" };
    String items2[] = {"MATHS IV", "GTC", "DAA", "UNIX", "MP", "CO","DAA LAB","MP LAB" };
    String items3[] = {"SE", "SS", "OS", "DBMS", "CN-I", "FLAT","DBA LAB","SS/OS LAB" };
    String items4[] = {"USP", "CD", "CN-II", "CGV", "OR", "S&S","DC","PR","SMA","PL","CGV LAB","ÜSP/CD LAB" };
    String items5[] = {"OOMD", "ECS", "PW", "ACA", "ADBMS", "DSP","J&J","MC","DW/DM","NN","C&.net" };
    String items6[] = {"", "charizard6", "poliwag6", "geodud2e", "pidgey2", "jynx2","kewal","kishan" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus2);
        lv1 = (ListView) findViewById(R.id.listView2);
        Intent intent=getIntent();
        int y=intent.getIntExtra("name",-1);
        if (y==0) {
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
            lv1.setAdapter(adapter); }else
        if (y==1) {
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items2);
            lv1.setAdapter(adapter);}else
        if (y==2) {
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items3);
            lv1.setAdapter(adapter);}else
        if (y==3) {
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items4);
            lv1.setAdapter(adapter); }else
        if (y==4) {
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items5);
            lv1.setAdapter(adapter);  }else
        {
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items6);
            lv1.setAdapter(adapter);}


        lv1.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView temp=(TextView)view;
        Toast.makeText(this, temp.getText() + " " + position, Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,syllabus3.class);
        intent.putExtra("name",position);
        startActivity(intent);
    }
}

