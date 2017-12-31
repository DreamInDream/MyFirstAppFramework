package com.example.maqiang8.myfirstappframework;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

import com.example.maqiang8.myfirstappframework.fragment.AndroidFragment;
import com.example.maqiang8.myfirstappframework.fragment.MathFragment;
import com.example.maqiang8.myfirstappframework.fragment.ModelFragment;
import com.example.maqiang8.myfirstappframework.fragment.WebFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
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
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_model) {
            Log.e(TAG,item.getTitle()+"被点击");
            getSupportFragmentManager().beginTransaction().replace(R.id.content_main,new ModelFragment()).commit();
        } else if (id == R.id.nav_math) {
            Log.e(TAG,item.getTitle()+"被点击");
            getSupportFragmentManager().beginTransaction().replace(R.id.content_main,new MathFragment()).commit();
        } else if (id == R.id.nav_web) {
            Log.e(TAG,item.getTitle()+"被点击");
            getSupportFragmentManager().beginTransaction().replace(R.id.content_main,new WebFragment()).commit();
        } else if (id == R.id.nav_android) {
            Log.e(TAG,item.getTitle()+"被点击");
            getSupportFragmentManager().beginTransaction().replace(R.id.content_main,new AndroidFragment()).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
