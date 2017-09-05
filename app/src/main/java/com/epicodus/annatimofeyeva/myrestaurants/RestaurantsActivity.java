package com.epicodus.annatimofeyeva.myrestaurants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RestaurantsActivity extends AppCompatActivity {
    private TextView StevesTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        StevesTest = (TextView) findViewById(R.id.locationTextView);
        StevesTest.setText(location);
    }
}
