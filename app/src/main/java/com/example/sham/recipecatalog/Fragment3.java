package com.example.sham.recipecatalog;

/**
 * Created by Sham on 14-Oct-16.
 */
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class Fragment3 extends Fragment {

    String androidListViewStrings[] = {"Achari Pasta", "Beef Club Sandwich", "Beef Nuggets", "Crispy Fried Chinese Drumsticks", "California Punch", "Chicken Crumb Roll", "Fajita Spaghetti", "Nuggets with Dip","Qeema Spaghetti", "Squaches"};
    Integer image_id[] = {R.drawable.acharipasta, R.drawable.beefclubsand,R.drawable.beefnugget, R.drawable.crispyfrieddrum,R.drawable.californiapunch, R.drawable.chickcrumbroll,R.drawable.fajitaspaghetti, R.drawable.nuggetdip,R.drawable.qeemaspaghetti, R.drawable.squaches};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout3, container, false);
        AndroidListAdapter androidListAdapter = new AndroidListAdapter(getActivity(), image_id, androidListViewStrings);
        ListView androidListView = (ListView) view.findViewById(R.id.custom_listview_example);
        androidListView.setAdapter(androidListAdapter);

        androidListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity21.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity22.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity23.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity24.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity25.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity26.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity27.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity28.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity29.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity30.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });

        return view;





    }




}