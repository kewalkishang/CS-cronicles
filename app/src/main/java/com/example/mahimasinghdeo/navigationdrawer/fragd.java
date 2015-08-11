package com.example.mahimasinghdeo.navigationdrawer;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mahimasinghdeo.navigationdrawer.R;

/**
 * Created by kewal on 4/24/2015.
 */
public class fragd extends Fragment{
    ListView lv;
    String[] items={"2 ) THIRD IA","3 ) THIRD IA ","4 ) THIRD IA","10) NARAKA CHATURTHII","12) BALI PADYAMI","17) LAB INTERNALS","18) LAB INTERNALS","19) LAB INTERNALS","20) LAST WORKING DAY","23) PRACTICAL EXAMS","24) PRACTICAL EXAMS","25) PRACTICAL EXAMS","26) PRACTICAL EXAMS","27) PRACTICAL EXAMS","28) KANAKA JAYANTHI"};
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragd,container,false);
        lv= (ListView) v.findViewById(R.id.listView4);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,items);
        lv.setAdapter(adapter);

        return v;
    }
}
