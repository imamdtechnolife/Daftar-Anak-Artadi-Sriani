package com.planetmars23.softmedia.myrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class GridPresidentAdapter extends RecyclerView.Adapter<GridPresidentAdapter.GridViewHolder>{
    private ArrayList<President> listPresident;
    private Context context;

    public GridPresidentAdapter(Context context)
    {
        this.context = context;
    }

    public ArrayList<President> getListPresident() {
        return listPresident;
    }

    public void setListPresident(ArrayList<President> list) {
        this.listPresident = list;
    }

    @Override
    public GridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_president, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListPresident().get(position).getPhoto())
                .override(350, 550)
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListPresident().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView imgPhoto;
        public GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView) itemView.findViewById(R.id.img_photophoto);
        }
    }
}
