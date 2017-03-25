package com.example.sham.recipecatalog;

/**
 * Created by Sham on 04-Oct-16.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class Fragment2 extends Fragment {



    String androidListViewStrings[] = {"Aloo Pita Paratha", "Chicken Cheese Paratha", "Donut Kabab", "Greek Bread", "Lobia Chana Masala", "Masala Matar", "Paratha Qeema", "Peshawari Vegetable Kabab","Peanut Butter Chicken Kieve", "Pizza Paratha"};
    Integer image_id[] = {R.drawable.aloopita, R.drawable.cheeseparatha,R.drawable.donutkabab, R.drawable.greekbread,R.drawable.lobiachana, R.drawable.matarmasala,R.drawable.qeemaparatha, R.drawable.peshawarikabab,R.drawable.peanutkieve, R.drawable.pizzaparatha};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout2, container, false);
        AndroidListAdapter androidListAdapter = new AndroidListAdapter(getActivity(), image_id, androidListViewStrings);
        ListView androidListView = (ListView) view.findViewById(R.id.custom_listview_example);
        androidListView.setAdapter(androidListAdapter);

        androidListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity11.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity12.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity13.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity14.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity15.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity16.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity17.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity18.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity19.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity20.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });

        return view;

    }


}