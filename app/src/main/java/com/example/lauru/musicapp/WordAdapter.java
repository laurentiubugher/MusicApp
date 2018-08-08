package com.example.lauru.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Song>  {



    public WordAdapter(Context context, ArrayList<Song> details) {
        super(context, 0, details);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_name.
        TextView songNameTextView = listItemView.findViewById(R.id.song_name);
        // Get the song name from the currentSong object and set this text on
        // the song name TextView.
        songNameTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID artist_name.
        TextView artistNameTextView = listItemView.findViewById(R.id.artist_name);
        // Get the artist name from the currentSong object and set this text on
        // the artist name TextView.
        artistNameTextView.setText(currentSong.getmArtistName());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}