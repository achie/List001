package com.droidkids.samples.list001;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Main extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        String[] cities = getResources().getStringArray(R.array.cities);
        setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, cities));
    }
}