package com.example.sham.recipecatalog;

/**
 * Created by Sham on 14-Oct-16.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class Fragment5 extends Fragment {

    String androidListViewStrings[] = {"Amrat sari Fried Fish", "Beijing Chicken", "Bangladeshi Roast", "Bombay Biryani", "Creole Chicken", "Chinese Pulao", "Gujrati Daal", "Japanese Style Chicken Wings","Jaipur Biryani", "Teriyaki Chicken"};
    Integer image_id[] = {R.drawable.amratsari, R.drawable.beijingchik,R.drawable.bangladeshi, R.drawable.bombaybir,R.drawable.creolechick, R.drawable.chinesepulao,R.drawable.gujratidal, R.drawable.japanesechick,R.drawable.jaipurbir, R.drawable.teriyakichick};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout5, container, false);
        AndroidListAdapter androidListAdapter = new AndroidListAdapter(getActivity(), image_id, androidListViewStrings);
        ListView androidListView = (ListView) view.findViewById(R.id.custom_listview_example);
        androidListView.setAdapter(androidListAdapter);

        androidListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity41.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity42.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity43.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity44.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity45.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity46.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity47.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity48.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity49.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity50.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });

        return view;

    }

}