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
public class fragc extends Fragment {
    ListView lv;
    String[] items={"2 ) GANDHI JAYANTHI","5 ) SECOND IA","6 ) SECOND IA","7 ) SECOND IA","12) MAHAALAYA","22) AYUDHA POOJA","23) VIJAYA DASHAMI","24) MOHARRAM","27) VALMIKI JAYANTHI"};
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragc, container, false);
        lv = (ListView) v.findViewById(R.id.listView3);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, items);
        lv.setAdapter(adapter);

        return v;
    }
}