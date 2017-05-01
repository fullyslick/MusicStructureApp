package com.example.android.musicstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find genres by id to assign them event Listeners and Custom Font
        Button electronicaButton = (Button) findViewById(R.id.electronica);
        Button discoButton = (Button) findViewById(R.id.disco);
        Button hiphopButton = (Button) findViewById(R.id.hip_hop);
        Button rockButton = (Button) findViewById(R.id.rock);
        Button popButton = (Button) findViewById(R.id.pop);

        //Assigning custom font to genres
        Typeface typefaceCustomFont = Typeface.createFromAsset(getAssets(), "fonts/quicksandbold.ttf");
        electronicaButton.setTypeface(typefaceCustomFont);
        discoButton.setTypeface(typefaceCustomFont);
        hiphopButton.setTypeface(typefaceCustomFont);
        rockButton.setTypeface(typefaceCustomFont);
        popButton.setTypeface(typefaceCustomFont);

        // Find the Close Explanation Button to attach the eventListener
        Button closeExplButton = (Button) findViewById(R.id.closeExplanationButton);

        // Hides explanation box on Close Explanation Button click
        closeExplButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScrollView explanation = (ScrollView) findViewById(R.id.explanation);
                explanation.setVisibility(View.GONE);
            }
        });

        // Set a click listener on the Electronica Button
        electronicaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent electronicaIntent = new Intent(MainActivity.this, ElectronicaActivity.class);
                startActivity(electronicaIntent);
            }
        });

        // Set a click listener on the Disco Button
        discoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent discoIntent = new Intent(MainActivity.this, DiscoActivity.class);
                startActivity(discoIntent);
            }
        });

        // Set a click listener on the Hip Hop Button
        hiphopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hiphopIntent = new Intent(MainActivity.this, HipHopActivity.class);
                startActivity(hiphopIntent);
            }
        });

        // Set a click listener on the Rock Button
        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(rockIntent);
            }
        });

        // Set a click listener on the Pop Button
        popButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);
                startActivity(popIntent);
            }
        });
    }
}
