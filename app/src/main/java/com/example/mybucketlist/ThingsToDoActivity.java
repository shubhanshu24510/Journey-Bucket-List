package com.example.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setuplist();
    }
    private void setuplist(){
        BucketListEntry [] thingsToDo ={
                new BucketListEntry("Badrinath","The nature waterfall which is pure,want to splash on my body .",R.drawable.badrinath_waterfall__1_,4.8f),
                new BucketListEntry("Sky Drive","Preferably over somewhere with an amazing view!",R.drawable.skydive,4.9f),
                new BucketListEntry("Climb Mt Himalaya","Do it the difficult way but will be amazing on the top view of rock!",R.drawable.himalayamountain,4.4f),
                new BucketListEntry("Road Trip,Lakhdar","Hire a bike from the west coast and visit each place of the mountains.",R.drawable.road_trip,4.5f),
                new BucketListEntry("Ice Sliding","Khajjiar in Himachal Pradesh wants to slide on the ice mountain.",R.drawable.ice_slidng,4.7f),
                new BucketListEntry("Experience the northern lights","Somewhere in the Arctic circle,probably Norway",R.drawable.northern_lights,4.3f),
                new BucketListEntry("Scuba Drive"," Goa,Andaman",R.drawable.scubadive,4.2f)

        };
        RecyclerView recycleView =findViewById(R.id.card_view_things_to_do);
        BucketListEntryAdapter adapter =new BucketListEntryAdapter(thingsToDo);
        recycleView.setAdapter(adapter);
    }
}