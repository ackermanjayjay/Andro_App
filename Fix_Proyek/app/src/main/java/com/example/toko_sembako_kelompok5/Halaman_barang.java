package com.example.toko_sembako_kelompok5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//import android.widget.Button;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Halaman_barang extends AppCompatActivity {
ImageButton Home,
        barang
        ,kelompok
        ,beliTelur
        ,beliMinyak;
Button kurangMinyak
        ,kurangTelor
        ,hapusMinyak
        ,hapusTelur;
    int akumulasiTelor=0
            ,akumulasiMinyak=0;

EditText telur
        ,minyak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_barang);
        Home=findViewById(R.id.btn_home_barang);
        kelompok=findViewById(R.id.btn_tentang_barang);


//        Tombol Hapus unit beli
        hapusMinyak=findViewById(R.id.btn_hapusMinyak);
        hapusTelur=findViewById(R.id.btn_hapusTelor);

//    Tombol beli
        beliTelur=findViewById(R.id.btn_beli_telor);
        beliMinyak=findViewById(R.id.btn_beli_minyak);

//        Tombol kurang unit
    kurangMinyak=findViewById(R.id.btn_kurangMinyak);
    kurangTelor=findViewById(R.id.btn_kurangTelor);

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

//        Untuk Tombol Hapus unit barang beli
        hapusTelur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HapusTelur();
            }
        });

        hapusMinyak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HapusMinyak();
            }
        });


//        Untuk tombol pengurangan unit barang
        kurangTelor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TombolKurangTelor();
            }
        });
        kurangMinyak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TombolKurangMinyak();
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
//    Untuk tombol hapus unit aka reset
    public void HapusTelur()
    {
        telur.setText("");
    }
    public  void HapusMinyak()
    {
        minyak.setText("");
    }


//    Untuk Tombol unit barang Decrement
    public void TombolKurangTelor()
    {
        akumulasiTelor--;
        telur.setText(""+akumulasiTelor);
    }
    public void TombolKurangMinyak()
    {
        akumulasiMinyak--;
        minyak.setText(""+akumulasiMinyak);
    }

//    Untuk Tombol unit barang Increment
    public void TransaksiBeliTelur()
    {

        akumulasiTelor++;
        telur.setText(""+akumulasiTelor);
    }
    public void TransaksiBeliMinyak()
    {

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