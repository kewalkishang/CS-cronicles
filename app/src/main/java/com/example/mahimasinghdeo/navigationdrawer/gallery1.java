package com.example.mahimasinghdeo.navigationdrawer;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.etsy.android.grid.util.DynamicHeightImageView;

import java.util.ArrayList;


public class gallery1 extends ActionBarActivity {
  int pic1[]={R.drawable.lumiere,R.drawable.picb,R.drawable.picc,R.drawable.picd,R.drawable.pice,R.drawable.picf};
    String pics[]={"LUMIERE '15","SPORTS DAY","AYUDHA POOJA","ORIENTATION","TEACHERS DAY","FRESHERS"};

//int pic1[]={R.drawable.pica,R.drawable.pica,R.drawable.pica,R.drawable.pica,R.drawable.pica,R.drawable.pica};
    RecyclerView recyclerView;
    CardView cardView;
    StaggeredGridLayoutManager manager;
    ArrayList<Float> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery1);
        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        cardView = (CardView) findViewById(R.id.cardview);


        manager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(new MyAdapter());


        lista.add((float) 0.9);
        lista.add((float) 1.05);
        lista.add((float) 0.95);
        lista.add((float) 1.1);
    }

    private float getRandomHeight(int position) {
        return lista.get(position % 4);

    }

    private void setAnimation(View viewToAnimate, int position) {
        // If the bound view wasn't previously displayed on screen, it's animated
        int lastPosition = 0;
        if (position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(animation);
            //lastPosition = position;
        } else {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(animation);
          //  lastPosition = position;
        }
    }

    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.holder> {
        @Override
        public holder onCreateViewHolder(ViewGroup parent, int viewType) {
            View V = getLayoutInflater().inflate(R.layout.single3, parent, false);
           // holder mhold = new holder(V);

            return new holder(V);
        }

        @Override
        public void onBindViewHolder(holder holder,  final int position)
        {

            holder.TV.setText(pics[position]);
            holder.DI.setImageResource(pic1[position]);
            holder.DI.setHeightRatio(getRandomHeight(position));
            holder.DI.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(gallery1.this, gallery2.class);
                    intent.putExtra("pos", position);
                    startActivity(intent);
                }
            });
            setAnimation(holder.itemView, position);


        }

        @Override
        public int getItemCount() {
            return 6;
        }

        public class holder extends RecyclerView.ViewHolder {
            DynamicHeightImageView DI;
            TextView TV;

            public holder(View v) {

                super(v);
                TV = (TextView) v.findViewById(R.id.textview);
                DI = (DynamicHeightImageView) v.findViewById(R.id.imageview);

            }
        }
    }

}
