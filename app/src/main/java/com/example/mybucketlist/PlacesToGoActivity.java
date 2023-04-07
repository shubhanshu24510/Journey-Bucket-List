package com.example.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setuplist();

    }

    private void setuplist() {
        BucketListEntry[] placesDOGO = {
                new BucketListEntry("Prem Mandir", "Want to see Radha Krishna temple and also visit to the yamuna river.", R.drawable.prem_mandir___mathura__1_, 4.6f),
                new BucketListEntry("Kedarnath Mandir", "Attend the afternoon aarti and want to climb the ice mountain.", R.drawable.kedarnath___uttarkhand__1_, 5),
                new BucketListEntry("The Taj Mahal", "Visit the taj mahal palace want to see the white stone which is unique in the world", R.drawable.taj__mahal___agra__1_, 4.5f),
                new BucketListEntry("Vietnam", "Con dao islands,Hanoi,Haloing Bay,Hoi an,Lang Co.", R.drawable.vietnam, 4.6f),
                new BucketListEntry("Kerala,India", "Try Varied tea flavours,stay in houseboat,the delicious food!", R.drawable.kerala, 4.9f),
                new BucketListEntry("japan", "Hot Springs,sushi,bamboo forest,bullet train,through mountains.", R.drawable.japan, 4),
                new BucketListEntry("Iceland", "Waterfall,nature reverses,may be the Northern light too!", R.drawable.iceland, 4.7f),
                new BucketListEntry("The Amazon,Brazil", "Try to survive  being scared by all the creepy crawlies!", R.drawable.amazon, 4.8f)

        };
        RecyclerView recycleView = findViewById(R.id.card_view_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(placesDOGO);
        recycleView.setAdapter(adapter);
    }
}










