package com.example.mahimasinghdeo.navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mahimasinghdeo.navigationdrawer.R;

/**
 * Created by kewal on 3/29/2015.
 */
public class fragb extends Fragment {

    ListView lv;
    String[] items={"3 ) FIRST IA","4 ) FIRST IA","5 ) FIRST IA","17) GANESHA CHATURTHI","24) BAKRID",};
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragb,container,false);
        lv= (ListView) v.findViewById(R.id.listView2);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,items);
        lv.setAdapter(adapter);

        return v;
    }
}
