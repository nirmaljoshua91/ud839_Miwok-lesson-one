package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Nirmal Joshua Laptop on 5/1/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Context context, List<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextview = (TextView) listItemView.findViewById(R.id.list_item_miwokText);
        miwokTextview.setText(currentWord.getmMiwokWord());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.list_item_DefaultText);
        defaultTextView.setText(currentWord.getDefaultWord());
        return listItemView;


    }
}
