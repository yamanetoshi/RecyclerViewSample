package com.example.recyclerviewsample;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SimpleRecyclerAdapter extends RecyclerView.Adapter<SimpleRecyclerAdapter.ViewHolder> {

    private static final String TAG = "SimpleRecyclerView";

    private LayoutInflater mLayoutInflater;
    private ArrayList<String> mList;


    public SimpleRecyclerAdapter(Context context, ArrayList<String> list) {
        super();
        mLayoutInflater = LayoutInflater.from(context);
        mList = list;
    }

    @Override
    public SimpleRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.list_item_card, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(SimpleRecyclerAdapter.ViewHolder holder, int position) {
        String data = mList.get(position);
        holder.textView.setText(data);
        holder.currentItem = data;
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        CardView cardView;
        String currentItem;

        public ViewHolder(View view) {
            super(view);
            textView = (TextView) view.findViewById(R.id.text1);
            cardView = (CardView) view.findViewById(R.id.cardView);
            cardView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Log.d(TAG, "currentItem : " + currentItem);
                }
            });
        }
    }
}