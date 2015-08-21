package com.example.mahimasinghdeo.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;

import com.etsy.android.grid.util.DynamicHeightImageView;


public class gallery2 extends ActionBarActivity {
   // int size;

    int pica[] = {R.drawable.lu1,R.drawable.lu2,R.drawable.lu3,R.drawable.lu4,R.drawable.lu5,R.drawable.lu6,R.drawable.lu7,R.drawable.lu8,R.drawable.lu9,R.drawable.lu10,R.drawable.lu11,R.drawable.lu12,R.drawable.lu13};
    int picb[] = {R.drawable.bas,R.drawable.bas2,R.drawable.bas3,R.drawable.bas4,R.drawable.bas5,R.drawable.bas6,R.drawable.bas7,R.drawable.bas8,R.drawable.bas9,R.drawable.bas10};
    int picc[] = {R.drawable.ay1,R.drawable.ay2,R.drawable.ay3,R.drawable.ay4,R.drawable.ay5,R.drawable.ay6,R.drawable.ay7,R.drawable.ay8,R.drawable.ay9,R.drawable.ay10,R.drawable.ay11};
    int picd[] = {R.drawable.or1,R.drawable.or2,R.drawable.or3,R.drawable.or4,R.drawable.or5,R.drawable.or6};
    int pice[] = {R.drawable.td1,R.drawable.td2,R.drawable.td3,R.drawable.td4,R.drawable.td5,R.drawable.td6,R.drawable.td7,R.drawable.td8,R.drawable.td9,R.drawable.td10,R.drawable.td11,R.drawable.td12,R.drawable.td13,R.drawable.td14,R.drawable.td15};
    int picf[] = {R.drawable.fr2,R.drawable.fr1,R.drawable.fr3,R.drawable.fr4,R.drawable.fr5,R.drawable.fr6,R.drawable.fr7,R.drawable.fr8,R.drawable.fr9,R.drawable.fr11};
    int[][] pic={pica,picb,picc,picd,pice,picf};
    int len;
    RecyclerView recyclerView;
    CardView cardView;
    StaggeredGridLayoutManager manager;

 int y;

    //String[] items = getResources().getStringArray(R.array.kewal);
    // int[] gallery={};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery2);
        recyclerView = (RecyclerView) findViewById(R.id.recycleview2);
        cardView = (CardView) findViewById(R.id.cardview);


        manager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(new MyAdapter());
       Intent intent = getIntent();
        y = intent.getIntExtra("pos", -1);
        switch (y)
        {case 0:len=pica.length;
              break;

            case 1:len=picb.length;
                break;
            case 2:len=picc.length;
                break;
            case 3:len=picd.length;
                break;
            case 4:len=pice.length;
                break;
            case 5:len=picf.length;
                break;


        }


}


    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.holder> {
        @Override
        public holder onCreateViewHolder(ViewGroup parent, int viewType) {
            View V = getLayoutInflater().inflate(R.layout.single3, parent, false);
            //holder mhold1 = new holder(V);

         return new holder(V);
        }

        @Override
        public void onBindViewHolder(holder holder, final int position) {

            holder.DI.setImageResource(pic[y][position]);
            holder.DI.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(gallery2.this, gallery3.class);
                    intent.putExtra("pic",pic[y][position]);
                    startActivity(intent);
                }
            });

        }

        @Override
        public int getItemCount() {


            return len;
        }

        public class holder extends RecyclerView.ViewHolder {
            DynamicHeightImageView DI;


            public holder(View v) {

                super(v);

                DI = (DynamicHeightImageView) v.findViewById(R.id.imageview);

            }
        }
    }


}


