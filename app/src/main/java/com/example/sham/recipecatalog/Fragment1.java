package com.example.sham.recipecatalog;

/**
 * Created by Sham on 04-Oct-16.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class Fragment1 extends Fragment {

    String androidListViewStrings[] = {"Achari Chicken", "Afghani Pulao", "BBQ Biryani", "Chicken Broast", "Fry Chilli Chicken", "Sindhi Biryani", "Spicy Chicken Rolls", "Tandoori Roast Chicken","Tandoori Chicken Masala", "Yakhni Pulao"};
    Integer image_id[] = {R.drawable.acharichik, R.drawable.afghanipulao,R.drawable.bbqbiryani, R.drawable.chikbroast,R.drawable.frychilli, R.drawable.sindhibiryani,R.drawable.spicyrolls, R.drawable.roasttandoori,R.drawable.masalatandoori, R.drawable.yakhnipulao};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout1, container, false);
        AndroidListAdapter androidListAdapter = new AndroidListAdapter(getActivity(), image_id, androidListViewStrings);
        ListView androidListView = (ListView) view.findViewById(R.id.custom_listview_example);
        androidListView.setAdapter(androidListAdapter);
        androidListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity1.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity2.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity3.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity4.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity5.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity6.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity7.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity8.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity9.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity10.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });

        return view;

    }


}