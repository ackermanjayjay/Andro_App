package com.example.toko_sembako_kelompok5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class Halaman_barang extends AppCompatActivity {
ImageButton Home,
        barang
        ,kelompok
        ,beliTelur
        ,beliMinyak;

EditText telur
        ,minyak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_barang);
        Home=findViewById(R.id.btn_home_barang);
        kelompok=findViewById(R.id.btn_tentang_barang);

//    Tombol beli Telor
        beliTelur=findViewById(R.id.btn_beli_telor);
        beliMinyak=findViewById(R.id.btn_beli_minyak);

//        Hasil pembelian
        telur=findViewById(R.id.txt_telor);
        minyak=findViewById(R.id.txt_minyak);

//        Untuk judul atas
        getSupportActionBar().setTitle("Halaman barang");

//        Untuk Navgasi bottom button
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
//        Untuk Tombol beli barang minyak dan telur
        beliTelur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            TransaksiBeliTelur();
            }
        });
        beliMinyak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TransaksiBeliMinyak();

            }
        });
    }
//    Untuk transaksi barang
    public void TransaksiBeliTelur()
    {
        int akumulasi=0;
        akumulasi++;
        telur.setText(""+akumulasi);
    }
    public void TransaksiBeliMinyak()
    {
        int akumulasiMinyak=0;
        akumulasiMinyak++;
        minyak.setText(""+akumulasiMinyak);

    }

//    Navigasi bottom button
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