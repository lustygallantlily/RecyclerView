package com.lustygallantlily.verly.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Verly on 10/6/2017.
 */

public class rvAdapter extends RecyclerView.Adapter<rvAdapter.ViewHolder>{

    private ArrayList<String> rvData;

    public rvAdapter(ArrayList<String> rvData) {
        this.rvData = rvData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_listitem,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final String name = rvData.get(position);

        holder.mTitle.setText(rvData.get(position));
        holder.mSubTitle.setText("data ke "+ position);
    }

    @Override
    public int getItemCount() {
        return rvData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView mTitle;
        public TextView mSubTitle;

        public ViewHolder(View itemView) {
            super(itemView);

            mTitle = (TextView) itemView.findViewById(R.id.textViewBig);
            mSubTitle = (TextView) itemView.findViewById(R.id.textViewSmall);
        }
    }
}
