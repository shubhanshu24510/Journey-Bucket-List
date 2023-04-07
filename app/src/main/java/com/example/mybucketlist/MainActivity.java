package com.example.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupClickListeners();
    }

    private void setupClickListeners() {
        CardView thingsTODoCard = findViewById(R.id.card_view_things_to_do);
        CardView placesToGoCard = findViewById(R.id.card_view_places_to_go);

        thingsTODoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThingsToDoActivity.class);
                startActivity(intent);

            }
        });
        placesToGoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlacesToGoActivity.class);
                startActivity(intent);

            }
        });


    }
}