package com.example.lauru.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>  {



    public WordAdapter(Context context, ArrayList<Word> details) {
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

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_name.
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name);
        // Get the song name from the currentWord object and set this text on
        // the song name TextView.
        songNameTextView.setText(currentWord.getSongName());

        // Find the TextView in the list_item.xml layout with the ID artist_name.
        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        // Get the artist name from the currentWord object and set this text on
        // the artist name TextView.
        artistNameTextView.setText(currentWord.getmArtistName());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}