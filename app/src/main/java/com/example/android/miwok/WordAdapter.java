package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word>{


    public WordAdapter(@NonNull Context context, int resource, ArrayList<Word> words) {
        super(context,resource,words);
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

        TextView defaultTxt = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTxt.setText(currentWord.getDefaultTranslation());

        TextView miwokTxt = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTxt.setText(currentWord.getMiwokTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.miwok_image);
        imageView.setImageResource(currentWord.getImageResourceID());

        return listItemView;
//        return super.getView(position, convertView, parent);
    }
}
