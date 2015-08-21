package com.example.mahimasinghdeo.navigationdrawer;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Mahima Singh Deo on 4/29/2015.
 */
public class fragcc extends Fragment {
    ListView lv;
    String items[]={"1.	Accenture     49",
            "2.	Cognizant Technologies   25",
            "3.	I gate     03",
            "4.	Incture	   03",
            "5.	Infosys	   36",
            "6.	L & T Infotech	  04",
            "7.	Oracle    02",
            "8.	Raremile    04",
            "9.	Tech Mahindra   06",
            "10.	Tesco	 08",
            "11.	Mu Sigma	05",
            "12.	Alcatel Lucent	02",
            "13.	Deloitte	03",
            "14.	Microland	 01",
            "15.	Informatica	 02",
            "16.	Pegasystems	 03",
            "17.	Oracle Finance 	01",
            "18.	Mercedez Benz	 01",
            "19.	Yodlee Infotech 	01",
            "20.	HCL 	04",
            "21.	Subex	 01",
            "22.	Unisys	 02",
            "23.	IBM	 01",
            "24.	Amazon 	04",
            "25.	THBS	 01",
            "26.	Coupons	 04",
            "27.	Betsol	  02"};
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
