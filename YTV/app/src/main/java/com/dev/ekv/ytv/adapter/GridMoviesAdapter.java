package com.dev.ekv.ytv.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by EKV on 4/27/2018 AD.
 */

public class GridMoviesAdapter extends RecyclerView.Adapter<GridMoviesAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvMvTitle, tvMvDuration, tvMvCount;
        ImageView myMovies;
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
