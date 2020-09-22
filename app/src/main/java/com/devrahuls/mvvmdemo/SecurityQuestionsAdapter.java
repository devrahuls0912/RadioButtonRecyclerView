package com.devrahuls.mvvmdemo;

import android.content.Context;

import java.util.List;

public class SecurityQuestionsAdapter extends RadioAdapter<String> {
    public SecurityQuestionsAdapter(Context context, List<String> items) {
        super(context, items);
    }

    @Override
    public void onBindViewHolder(RadioAdapter.ViewHolder viewHolder, int i) {
        super.onBindViewHolder(viewHolder, i);
        viewHolder.mText.setText(mItems.get(i));
    }
}
