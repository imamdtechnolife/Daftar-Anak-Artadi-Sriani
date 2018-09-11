package com.planetmars23.softmedia.myrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity{
    private ImageView imgProfil;
    private TextView txtNama, txtTanda, txtTTL, txtJK, txtPekerjaan;
    public static final String EKSTRA_NAMA = "ekstra_nama";
    public static final String EKSTRA_TANDA = "ekstra_tanda";
    public static final String EKSTRA_PHOTO = "ekstra_photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgProfil = findViewById(R.id.img_profil_detail);
        txtNama = findViewById(R.id.txtNama);
        txtTanda = findViewById(R.id.txtRemarks);
        txtTTL = findViewById(R.id.txt_TTL);
        txtJK = findViewById(R.id.txt_JK);
        txtPekerjaan = findViewById(R.id.txt_Pekerjaan);

        ambilIntentDatang();
    }

    private void ambilIntentDatang()
    {
        String nama = getIntent().getStringExtra(EKSTRA_NAMA);
        String tanda = getIntent().getStringExtra(EKSTRA_TANDA);
        String photo = getIntent().getStringExtra(EKSTRA_PHOTO);
        String ttl = getIntent().getStringExtra("ttl");
        String jk = getIntent().getStringExtra("jk");
        String pekerjaan = getIntent().getStringExtra("pekerjaan");

        txtTanda.setText(tanda);
        txtNama.setText(nama);
        txtTTL.setText(ttl);
        txtJK.setText(jk);
        txtPekerjaan.setText(pekerjaan);
        Glide.with(this )
                .load(photo)
                .override(250, 350)
                .into(imgProfil);
    }


}
