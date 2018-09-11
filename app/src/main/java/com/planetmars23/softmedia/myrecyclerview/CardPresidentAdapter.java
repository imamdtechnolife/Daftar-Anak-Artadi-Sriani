package com.planetmars23.softmedia.myrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import java.util.ArrayList;

public class CardPresidentAdapter extends RecyclerView.Adapter<CardPresidentAdapter.CardViewViewHolder>
{
    private Context context;
    private ArrayList<President> listPresident;
    private String nama;

    public CardPresidentAdapter(Context context)
    {
        this.context = context;
    }

    public ArrayList<President> getListPresident() {
        return listPresident;
    }

    public void setListPresident(ArrayList<President> listPresident) {
        this.listPresident = listPresident;
    }



       @Override
    public CardViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
           return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final CardPresidentAdapter.CardViewViewHolder holder, int position) {
        President p = getListPresident().get(position);

        Glide.with(context)
                .load(p.getPhoto())
                .override(350, 550)
                .into(holder.imgPhoto);

        holder.txtNama.setText(p.getNama());
        holder.txtRemarks.setText(p.getRemarks());

        holder.btnDetail.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback()
        {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Detail "+getListPresident().get(position).getNama(), Toast.LENGTH_SHORT).show();

                if (getListPresident().get(position).getNama().equals("Imam Afriyadi")) {
                    Intent imamProfil = new Intent(context, DetailActivity.class);
                    imamProfil.putExtra(DetailActivity.EKSTRA_NAMA, getListPresident().get(position).getNama());
                    imamProfil.putExtra(DetailActivity.EKSTRA_TANDA, getListPresident().get(position).getRemarks());
                    imamProfil.putExtra(DetailActivity.EKSTRA_PHOTO, getListPresident().get(position).getPhoto());
                    imamProfil.putExtra("ttl", "Sumbawa Besar, 1 April 1992");
                    imamProfil.putExtra("jk", "Laki-laki");
                    imamProfil.putExtra("pekerjaan", "Staf IT RSUD Kab. Lombok Utara");
                    context.startActivity(imamProfil);
                }
                else if (getListPresident().get(position).getNama().equals("Selvia Andriani")) {
                    Intent selviProfil = new Intent(context, DetailActivity.class);
                    selviProfil.putExtra(DetailActivity.EKSTRA_NAMA, getListPresident().get(position).getNama());
                    selviProfil.putExtra(DetailActivity.EKSTRA_TANDA, getListPresident().get(position).getRemarks());
                    selviProfil.putExtra(String.valueOf(DetailActivity.EKSTRA_PHOTO), getListPresident().get(position).getPhoto());
                    selviProfil.putExtra("ttl", "Sumbawa Besar, 29 September 1995");
                    selviProfil.putExtra("jk", "Perempuan");
                    selviProfil.putExtra("pekerjaan", "Staf Administrasi Bank BTN");
                    context.startActivity(selviProfil);
                }
                else if (getListPresident().get(position).getNama().equals("Arya Tri Setyadi")) {
                    Intent aryaProfil = new Intent(context, DetailActivity.class);
                    aryaProfil.putExtra(DetailActivity.EKSTRA_NAMA, getListPresident().get(position).getNama());
                    aryaProfil.putExtra(DetailActivity.EKSTRA_TANDA, getListPresident().get(position).getRemarks());
                    aryaProfil.putExtra(DetailActivity.EKSTRA_PHOTO, getListPresident().get(position).getPhoto());
                    aryaProfil.putExtra("ttl", "Sumbawa Besar, 18 Januari 1998");
                    aryaProfil.putExtra("jk", "Laki-laki");
                    aryaProfil.putExtra("pekerjaan", "Mahasiswa S1-Hukum Universitas Mataram ");
                    context.startActivity(aryaProfil);
                }
                else if (getListPresident().get(position).getNama().equals("Ari Ardiansyah")) {
                    Intent ariProfil = new Intent(context, DetailActivity.class);
                    ariProfil.putExtra(DetailActivity.EKSTRA_NAMA, getListPresident().get(position).getNama());
                    ariProfil.putExtra(DetailActivity.EKSTRA_TANDA, getListPresident().get(position).getRemarks());
                    ariProfil.putExtra(DetailActivity.EKSTRA_PHOTO, getListPresident().get(position).getPhoto());
                    ariProfil.putExtra("ttl", "Sumbawa Besar, 27 Mei 2003");
                    ariProfil.putExtra("jk", "Laki-laki");
                    ariProfil.putExtra("pekerjaan", "Siswa MTSn 1 Sumbawa Besar");
                    context.startActivity(ariProfil);
                }
            }
        }));

        holder.btnShare.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback()
        {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share "+getListPresident().get(position).getNama(), Toast.LENGTH_SHORT).show();
            }
        }));
    }

    @Override
    public int getItemCount() {
        return listPresident.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder
    {
        private TextView txtNama, txtRemarks;
        private Button btnShare, btnDetail;
        private ImageView imgPhoto;

        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = (ImageView) itemView.findViewById(R.id.img_item_photo);
            txtNama = (TextView) itemView.findViewById(R.id.tv_item_name);
            txtRemarks = (TextView) itemView.findViewById(R.id.tv_item_remarks);
            btnShare = (Button) itemView.findViewById(R.id.btn_set_share);
            btnDetail = (Button) itemView.findViewById(R.id.btn_set_favorite);
        }
    }
}
