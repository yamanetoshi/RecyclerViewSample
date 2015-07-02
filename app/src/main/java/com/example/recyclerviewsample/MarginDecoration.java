package com.example.recyclerviewsample;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MarginDecoration extends RecyclerView.ItemDecoration {
    private int horizontal_margin;
    private int vertical_margin;

    public MarginDecoration(Context context) {
        horizontal_margin = context.getResources().getDimensionPixelSize(R.dimen.item_margin);
        vertical_margin = horizontal_margin / 2;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.set(horizontal_margin, vertical_margin, horizontal_margin, vertical_margin);
    }
}
