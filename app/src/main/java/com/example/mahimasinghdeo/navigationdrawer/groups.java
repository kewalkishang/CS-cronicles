package com.example.mahimasinghdeo.navigationdrawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class groups extends Activity implements AdapterView.OnItemClickListener {
    ListView lv1;
    String items[]={"1","2","3","4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);
        lv1=(ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(this);


    }
    @Override
    public void onItemClick(AdapterView<?>parent,View view,int position,long id){
        TextView temp=(TextView)view;
        Toast.makeText(this,temp.getText()+""+position,Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,groupMainActivity2.class);
        intent.putExtra("name",position);
        startActivity(intent);
    }
}


