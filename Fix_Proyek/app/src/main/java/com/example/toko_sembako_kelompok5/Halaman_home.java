package com.example.toko_sembako_kelompok5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Halaman_home extends AppCompatActivity {
ImageButton home,tentang,barang;
Button beli,kelompok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_home);

//        Button content
        beli=findViewById(R.id.btn_buy);
        kelompok=findViewById(R.id.btn_kelompok);


//        Navigasi bawah
        home=findViewById(R.id.btn_home);
        tentang=findViewById(R.id.btn_tentang);
        barang=findViewById(R.id.btn_barang);
        getSupportActionBar().setTitle("Halaman Home");

//        Button kontent
        beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Buka_Halaman_beli();
            }
        });

        kelompok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Buka_halaman_kelompok();
            }
        });



//  Untuk halaman kelompok navigasi bawah
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                halamanKelompok();
            }
        });

//        Untuk halaman barang navgiasi bawah
        barang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                halamanbarang();
            }
        });

    }

//    Button kontent
    public void Buka_Halaman_beli()
    {
        Intent openBeli=new Intent(Halaman_home.this, Halaman_barang.class);
        startActivity(openBeli);
    }
    public  void Buka_halaman_kelompok()
    {
        Intent openHalamanKelompok=new Intent(Halaman_home.this, Halaman_kelompok.class);
        startActivity(openHalamanKelompok);
    }

//    Navigasi bawah
    public void halamanKelompok()
    {
        Intent openKelompok=new Intent(Halaman_home.this, Halaman_kelompok.class);
        startActivity(openKelompok);
    }
    public void halamanbarang()
    {
        Intent pindah_lagi=new Intent(Halaman_home.this, Halaman_barang.class);
        startActivity(pindah_lagi);
    }
}