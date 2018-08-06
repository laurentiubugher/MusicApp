package com.example.lauru.musicapp;

import android.app.LauncherActivity;
import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a list of details
        ArrayList<Word> details = new ArrayList<Word>();
        details.add(new Word("In My Feelings", "Drake"));
        details.add(new Word("Sicko Mode", "Travis Scott"));
        details.add(new Word("Better Now", "Post Malone"));
        details.add(new Word("I like it", "Cardi B"));
        details.add(new Word("Lucid Dreams", "Juice WRLD"));


        WordAdapter adapter = new WordAdapter(this, details);

        final ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(i);
            }
        });

    }
}
