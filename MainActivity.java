package com.example.ricardo.drawer;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity  implements OnNavigationItemSelectedListener {


    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = findViewById(R.id.drawer_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.menu);
        mDrawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    //this code below makes sure that the drawer opens and closes
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:

                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
//the code for the drawer opening and closing ended on the line before this comment

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {


            case R.id.PetoPark:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,
                        new PetcoparkFragment())
                        .addToBackStack(null)

                        .commit();
                mDrawerLayout.closeDrawer(GravityCompat.START);


                break;
            case R.id.oldtown:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,
                        new OldTownFragment())
                        .addToBackStack(null)

                        .commit();
                mDrawerLayout.closeDrawer(GravityCompat.START);


                break;

            case R.id.SanDiegoZoo:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,
                        new SanDiegoZooFragment())
                        .addToBackStack(null)

                        .commit();
                mDrawerLayout.closeDrawer(GravityCompat.START);


            case R.id.SanDiegoBay:
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame,
                        new SanDiegoBay())
                        .addToBackStack(null)
                        .commit();
                mDrawerLayout.closeDrawer(GravityCompat.START);
                return true;



//
        }
        return true;
    }
}
