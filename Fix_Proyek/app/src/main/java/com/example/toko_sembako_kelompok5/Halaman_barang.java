package com.example.toko_sembako_kelompok5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//import android.widget.Button;
import android.view.View;
import android.widget.ImageButton;

public class Halaman_barang extends AppCompatActivity {
ImageButton Home,barang,kelompok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_barang);
        Home=findViewById(R.id.btn_home_barang);
        kelompok=findViewById(R.id.btn_tentang_barang);
        getSupportActionBar().setTitle("Halaman barang");

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BukaHalamanHome();
            }
        });
        kelompok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BukaHalamanKelompok();
            }
        });
    }
    public void BukaHalamanKelompok()
    {
        Intent buka_Halaman_kelompok = new Intent(Halaman_barang.this,Halaman_kelompok.class);

        startActivity(buka_Halaman_kelompok);
    }
    public void BukaHalamanHome()
    {
        Intent buka_Halaman_home = new Intent(Halaman_barang.this,Halaman_home.class);

        startActivity(buka_Halaman_home);
    }
}