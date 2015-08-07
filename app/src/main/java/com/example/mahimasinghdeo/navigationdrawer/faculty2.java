package com.example.mahimasinghdeo.navigationdrawer;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class faculty2 extends ActionBarActivity {
    TextView tv1,tv2;
    ImageView imageView;
    String items[] = {"pikachu", "charizard", "poliwag", "geodude", "pidgey", "jynx", "bulbasaur", "got"};
    String nums[] = {"asadiuiyasdihadaijsdalkjsdmcaiohhdachalkneaihfcihnareak", "asdiohoaihrcqkncdandacnsdiacdsnamsdciasddasdmads", "1231", "13123153", "14141134", "56457", "235756", "2465426"};
    int IMAGES[] = {R.drawable.ic_launcher, R.drawable.abc_cab_background_internal_bg, R.drawable.ic_launcher, R.drawable.abc_cab_background_internal_bg, R.drawable.ic_launcher, R.drawable.abc_cab_background_internal_bg, R.drawable.ic_launcher, R.drawable.abc_cab_background_internal_bg};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty2);

        Intent intent=getIntent();
        int y =intent.getIntExtra("pos",-1);
        tv1= (TextView) findViewById(R.id.textView);
        tv2= (TextView) findViewById(R.id.textView2);
        imageView= (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(IMAGES[y]);
        tv1.setText(items[y]);
        tv2.setText(nums[y]);

    }


}

