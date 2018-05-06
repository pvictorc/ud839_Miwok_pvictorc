package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>{
    int mColorID;

    public WordAdapter(@NonNull Context context, int resource, ArrayList<Word> words, int colorID) {
        super(context,resource,words);
        mColorID=colorID;
    }
//
//    public WordAdapter(@NonNull Context context, int resource, @NonNull List<Word> objects) {
//        super(context, resource, objects);
//    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
                    listItemView = LayoutInflater.from(getContext()).inflate(
                            R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        View textContainer = (View) listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorID);
        textContainer.setBackgroundColor(color);

        TextView defaultTxt = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTxt.setText(currentWord.getDefaultTranslation());

        TextView miwokTxt = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTxt.setText(currentWord.getMiwokTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.miwok_image);

        if(currentWord.getImageResourceID() != -1 ) {
            imageView.setImageResource(currentWord.getImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        }
        else //Set visibility do GONE if the currentWord doesn't have a Image
            imageView.setVisibility(View.GONE);

        return listItemView;
//        return super.getView(position, convertView, parent);
    }
}
