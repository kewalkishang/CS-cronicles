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
int pica[]={};
    int picb[]={};
    int picc[]={};
    int picd[]={};
    int pice[]={};
    int picf[]={};
    RecyclerView recyclerView;
    CardView cardView;
    StaggeredGridLayoutManager manager;
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
        int y = intent.getIntExtra("pos", -1);


    }


    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.holder> {
        @Override
        public holder onCreateViewHolder(ViewGroup parent, int viewType) {
            View V = getLayoutInflater().inflate(R.layout.single3, parent, false);
            holder mhold = new holder(V);

            return mhold;
        }

        @Override
        public void onBindViewHolder(holder holder, final int position) {

            holder.DI.setImageResource(R.drawable.ic_launcher);
            holder.DI.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(gallery2.this,gallery3.class);
                    intent.putExtra("pos",position);
                    startActivity(intent);
                }
            });

        }

        @Override
        public int getItemCount() {
            return 8;
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


