package com.example.int_systems.hutano.Pharmacy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import com.example.int_systems.hutano.R;

public class Pharmacies extends AppCompatActivity {

    private Menu _menu = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacies);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        _menu = menu;
        return true;
    }

    private Menu getMenu()
    {
        //use it like this
        return _menu;
    }
}
