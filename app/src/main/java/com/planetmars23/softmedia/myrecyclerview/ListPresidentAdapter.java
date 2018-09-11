package com.planetmars23.softmedia.myrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class ListPresidentAdapter extends RecyclerView.Adapter<ListPresidentAdapter.CatagoryViewHolder> {
    private Context context;
    private ArrayList<President> listPresident;

    public ArrayList<President> getListPresident(){
        return listPresident;
    }

    public void setListPresident (ArrayList<President> listPresident)
    {
        this.listPresident = listPresident;
    }

    public ListPresidentAdapter (Context context)
    {
        this.context = context;
    }

    @Override
    public CatagoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_president, parent, false);
        return new CatagoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(CatagoryViewHolder holder, int position) {
        holder.tvNama.setText(getListPresident().get(position).getNama());
        holder.tvRemarks.setText(getListPresident().get(position).getRemarks());

        Glide.with(context)
                .load(getListPresident().get(position).getPhoto())
                .override(55, 55)
                .crossFade()
                .into(holder.ivPhoto);
    }

    @Override
    public int getItemCount() {
        return getListPresident().size();
    }


    class CatagoryViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvNama;
        TextView tvRemarks;
        ImageView ivPhoto;

        public CatagoryViewHolder(View itemView)
        {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_name);
            tvRemarks = itemView.findViewById(R.id.tv_remarks);
            ivPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
