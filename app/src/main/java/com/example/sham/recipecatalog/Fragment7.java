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

public class Fragment7 extends Fragment {

    String androidListViewStrings[] = {"B.B.Q Kofta Kabab", "Beef Shami Kabab", "Chicken Sheesh Kabab", "Gola Kabab", "Galawati Tikkay", "Koyla Kabab", "Malai Seekh Kabab", "Seekh Kabab","Sizzling Beef", "Tawa Qeema"};
    Integer image_id[] = {R.drawable.bbqkofta, R.drawable.beefshami,R.drawable.chicksheesh, R.drawable.golakabab,R.drawable.galwatitikka, R.drawable.koylakabab,R.drawable.malaiseekh, R.drawable.seekhkabab,R.drawable.sizzlingbeef, R.drawable.tawaqeema};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout7, container, false);
        AndroidListAdapter androidListAdapter = new AndroidListAdapter(getActivity(), image_id, androidListViewStrings);
        ListView androidListView = (ListView) view.findViewById(R.id.custom_listview_example);
        androidListView.setAdapter(androidListAdapter);

        androidListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity61.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity62.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity63.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity64.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity65.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity66.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity67.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity68.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity69.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 9) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity70.class);
                    startActivityForResult(myIntent, 0);
                }
            }
        });

        return view;

    }

}