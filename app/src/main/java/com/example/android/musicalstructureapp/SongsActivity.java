package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playitem_list);

        ArrayList<PlayItem> playItems = new ArrayList<PlayItem>();
        playItems.add(new PlayItem("Dom vill veta", "Osman"));
        playItems.add(new PlayItem("Psycho ft. Ty Dolla $ign", "Post Malone"));
        playItems.add(new PlayItem("Nice For What", "Drake"));
        playItems.add(new PlayItem("Call Out My Name", "The Weeknd"));

        PlayItemAdapter adapter = new PlayItemAdapter(this, playItems);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}