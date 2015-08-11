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
 * Created by kewal on 3/29/2015.
 */
public class fraga extends Fragment {
    ListView lv;
    String items[]={"3)  START OF CLASSES","8)  FACULTY MEETING","15) INDEPENDENCE DAY","21) PROCTOR MEETING","22) PRE-PLACEMENT ACTIVTY"};

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =inflater.inflate(R.layout.fraga, container, false);
        lv= (ListView) v.findViewById(R.id.listView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,items);
        lv.setAdapter(adapter);

        return v;
    }
}
