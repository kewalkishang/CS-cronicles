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
public class frage extends Fragment {
    ListView lv;
    String[] items={"1 ) PRACTICAL EXAMS","2 ) PRACTICAL EXAMS","3 ) PRACTICAL EXAMS","4 ) PRACTICAL EXAMS","5 ) PRACTICAL EXAMS","7 ) THEORY EXAMS","8 ) THEORY EXAMS","9 ) THEORY EXAMS ","10) THEORY EXAMS","11) THEORY EXAMS","12) THEORY EXAMS","14) THEORY EXAMS","15) THEORY EXAMS","16) THEORY EXAMS","17) THEORY EXAMS","18) THEORY EXAMS","19) THEORY EXAMS","21) THEORY EXAMS","22) THEORY EXAMS","23) THEORY EXAMS","24) EID-MILAD","25) CHRISTMAS","26) THEORY EXAMS","28) THEORY EXAMS","29) THEORY EXAMS","30) THEORY EXAMS"};
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.frage,container,false);
        lv= (ListView) v.findViewById(R.id.listView5);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,items);
        lv.setAdapter(adapter);

        return v;
    }
}

