package com.example.lauru.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a list of details
        ArrayList<Song> details = new ArrayList<Song>();
        details.add(new Song("In My Feelings", "Drake"));
        details.add(new Song("Sicko Mode", "Travis Scott"));
        details.add(new Song("Better Now", "Post Malone"));
        details.add(new Song("I like it", "Cardi B"));
        details.add(new Song("Lucid Dreams", "Juice WRLD"));


        WordAdapter adapter = new WordAdapter(this, details);

        final ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent nowPlayingIntent  = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(nowPlayingIntent );
            }
        });

    }
}
