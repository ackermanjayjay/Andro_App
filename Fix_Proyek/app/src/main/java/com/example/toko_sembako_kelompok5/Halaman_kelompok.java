package com.example.toko_sembako_kelompok5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Halaman_kelompok extends AppCompatActivity {
    ImageButton Home_ku,barang_ku,kelompok_ku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_kelompok);
        Home_ku=findViewById(R.id.btn_home_kelompok);
        barang_ku=findViewById(R.id.btn_barang_kelompok);
//        Tombol menuju Home
        Home_ku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BukaHalamanHome();
            }
        });

//        Tombol menuju Halaman barang
        barang_ku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BukaHalamanBarang();
            }
        });
    }
    public  void BukaHalamanBarang()
    {
        Intent buka_Halaman_barang = new Intent(Halaman_kelompok.this,Halaman_barang.class);

        startActivity(buka_Halaman_barang);
    }
    public void BukaHalamanHome()
    {
        Intent buka_Halaman_home = new Intent(Halaman_kelompok.this,Halaman_home.class);

        startActivity(buka_Halaman_home);
    }

}