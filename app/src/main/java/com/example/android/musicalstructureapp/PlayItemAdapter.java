package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class PlayItemAdapter extends ArrayAdapter<PlayItem> {

    public PlayItemAdapter(Activity context, ArrayList<PlayItem> playItems) {
        super(context, 0, playItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        PlayItem currentPlayItem = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.name);
        nameTextView.setText(currentPlayItem.getmPlayItemName());

        TextView authorTextView = listItemView.findViewById(R.id.author);
        authorTextView.setText(currentPlayItem.getmPlayItemAuthor());

        return listItemView;
    }
}