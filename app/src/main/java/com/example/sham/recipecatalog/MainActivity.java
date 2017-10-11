package com.example.sham.recipecatalog;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NavUtils;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.mikhaellopez.circularimageview.CircularImageView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    FragmentManager fragmentManager;
    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;
    Fragment4 fragment4;
    Fragment5 fragment5;
    Fragment6 fragment6;
    Fragment7 fragment7;
    Fragment9 fragment9;
    Fragment10 fragment10;
    DrawerLayout drawer;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);


        setSupportActionBar(toolbar);
        fragmentManager=getSupportFragmentManager();

        fragment1= new Fragment1();
        fragmentManager.beginTransaction().replace(R.id.content_frame,fragment1).commit();
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_frag1) {

            fragment1= new Fragment1();
            fragmentManager.beginTransaction().replace(R.id.content_frame,fragment1).commit();
        }
        else if (id == R.id.nav_frag2) {
            fragment3 = new Fragment3();
            fragmentManager.popBackStack();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.setCustomAnimations(R.anim.enter, R.anim.exit);
            transaction.replace(R.id.content_frame, fragment3);
            transaction.addToBackStack("");
            transaction.commit();

        } else if (id == R.id.nav_slideshow) {
            fragment7 = new Fragment7();
            fragmentManager.popBackStack();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.setCustomAnimations(R.anim.enter, R.anim.exit);
            transaction.replace(R.id.content_frame, fragment7);
            transaction.addToBackStack("");
            transaction.commit();
        } else if (id == R.id.nav_manage) {

            fragment2= new Fragment2();
            fragmentManager.popBackStack();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.setCustomAnimations(R.anim.enter, R.anim.exit);
            transaction.replace(R.id.content_frame, fragment2);
            transaction.addToBackStack("");
            transaction.commit();

        } else if (id == R.id.nav_share) {
            fragment4 = new Fragment4();
            fragmentManager.popBackStack();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.setCustomAnimations(R.anim.enter, R.anim.exit);
            transaction.replace(R.id.content_frame, fragment4);
            transaction.addToBackStack("");
            transaction.commit();

        } else if (id == R.id.nav_send) {
            fragment5 = new Fragment5();
            fragmentManager.popBackStack();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.setCustomAnimations(R.anim.enter, R.anim.exit);
            transaction.replace(R.id.content_frame, fragment5);
            transaction.addToBackStack("");
            transaction.commit();

        }
        else if (id == R.id.nav_south) {
            fragment6 = new Fragment6();
            fragmentManager.popBackStack();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.setCustomAnimations(R.anim.enter, R.anim.exit);
            transaction.replace(R.id.content_frame, fragment6);
            transaction.addToBackStack("");
            transaction.commit();
        }
//        else if (id == R.id.nav_develop) {
//          fragment9 = new Fragment9();
//            fragmentManager.popBackStack();
//            FragmentTransaction transaction = fragmentManager.beginTransaction();
//            transaction.setCustomAnimations(R.anim.enter, R.anim.exit);
//            transaction.replace(R.id.content_frame, fragment9);
//            transaction.addToBackStack("");
//            transaction.commit();
//        }
//        else if (id == R.id.nav_supervis) {
//           fragment10 = new Fragment10();
//            fragmentManager.popBackStack();
//            FragmentTransaction transaction = fragmentManager.beginTransaction();
//            transaction.setCustomAnimations(R.anim.enter, R.anim.exit);
//            transaction.replace(R.id.content_frame, fragment10);
//            transaction.addToBackStack("");
//            transaction.commit();
//        }
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }


}
