package com.example.mahimasinghdeo.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.mahimasinghdeo.navigationdrawer.R.layout;


public class MainActivity extends ActionBarActivity {
    DrawerLayout drawerLayout;
    RecyclerView listView;
    ActionBarDrawerToggle drawerListener;
    Toolbar tb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        tb = (Toolbar) findViewById(R.id.tb);


        setSupportActionBar(tb);
//        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setTitle("DSCE-CSE");
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        tb.setTitle("hakm");
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);
//        actionBar.setDisplayShowHomeEnabled(true);
//        actionBar.setDisplayShowTitleEnabled(true);
//        actionBar.setDisplayUseLogoEnabled(false);
//        actionBar.setHomeButtonEnabled(true);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawerListener = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, R.string.drawer_open, R.string.drawer_close);
        drawerLayout.setDrawerListener(drawerListener);
        listView = (RecyclerView) findViewById(R.id.drawerList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        listView.setLayoutManager(layoutManager);
        listView.setAdapter(new MyAdapter1());


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      //  return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (drawerListener.onOptionsItemSelected(item)) {


        }
        if(item.getItemId()==R.id.credits){
           Intent intent=new Intent(MainActivity.this,MainActivity3.class);
            startActivity(intent);
        }
        return true;
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerListener.syncState();
    }

//    class MyAdapter extends BaseAdapter {
//        String[] items;
//        int[] images = {R.drawable.fac, R.drawable.clubs, R.drawable.ach, R.drawable.gall, R.drawable.cal, R.drawable.place};
//        private Context context;
//
//        public MyAdapter(Context context) {
//            this.context = context;
//            items = context.getResources().getStringArray(R.array.Categories);
//
//        }
//
//        @Override
//        public int getCount() {
//            return items.length;
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return items[position];
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return position;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            View row;
//            if (convertView == null) {
//                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//                row = inflater.inflate();
//
//
//            } else {
//                row = convertView;
//            }
//
//
//            return row;
//        }
//    }

    class MyAdapter1 extends RecyclerView.Adapter<MyAdapter1.MyHolder> {
        int[] images = {R.drawable.news,R.drawable.fac, R.drawable.clubs, R.drawable.ach, R.drawable.gall, R.drawable.cal, R.drawable.place};
        String[] items = getResources().getStringArray(R.array.Categories);

        @Override
        public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = getLayoutInflater().inflate(R.layout.custom_row, parent, false);
            MyHolder myHolder = new MyHolder(v);
            return myHolder;

        }

        @Override
        public void onBindViewHolder(MyHolder holder, final int position) {
            holder.titleTextView.setText(items[position]);
            holder.titleImageView.setImageResource(images[position]);
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplication(), "" + position, Toast.LENGTH_SHORT).show();
                    if (position == 0) {
                        Intent intent = new Intent(getApplication(), newsfeed.class);

                        startActivity(intent);
                    }
                    if (position == 1) {
                        Intent intent = new Intent(getApplication(), faculty.class);

                        startActivity(intent);
                    }
                    if (position == 2) {
                        Intent intent = new Intent(getApplication(), groups.class);

                        startActivity(intent);
                    }
                    if (position == 3) {
                        Intent intent = new Intent(getApplication(), achievements2.class);

                        startActivity(intent);
                    }
                    if (position == 4) {
                        Intent intent = new Intent(getApplication(), gallery1.class);

                        startActivity(intent);
                    } else if (position == 5) {
                        Intent in = new Intent(MainActivity.this, calendar.class);
                        startActivity(in);
                    } else if (position == 6) {
                        Intent intent = new Intent(MainActivity.this, syllabus.class);
                        startActivity(intent);
                    }

                }


            });
        }

        @Override
        public int getItemCount() {
            return images.length;
        }

        class MyHolder extends RecyclerView.ViewHolder {

            TextView titleTextView;
            ImageView titleImageView;

            public MyHolder(View row) {
                super(row);
                titleTextView = (TextView) row.findViewById(R.id.textView);
                titleImageView = (ImageView) row.findViewById(R.id.imageView);
            }
        }
    }

}
