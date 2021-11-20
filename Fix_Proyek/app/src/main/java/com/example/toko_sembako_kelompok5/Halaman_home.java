package com.example.toko_sembako_kelompok5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Halaman_home extends AppCompatActivity {
ImageButton home,tentang,barang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_home);
        home=findViewById(R.id.btn_home);
        tentang=findViewById(R.id.btn_tentang);
        barang=findViewById(R.id.btn_barang);
        getSupportActionBar().setTitle("Halaman Home");

        barang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                halamanbarang();
            }
        });

    }
    public void halamanbarang()
    {
        Intent pindah_lagi=new Intent(Halaman_home.this, Halaman_barang.class);
        startActivity(pindah_lagi);
    }
}