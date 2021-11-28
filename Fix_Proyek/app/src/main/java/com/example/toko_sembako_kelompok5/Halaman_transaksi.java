package com.example.toko_sembako_kelompok5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Halaman_transaksi extends AppCompatActivity {
TextView totalTelur
        ,totalMinyak
        ,totalTransaksi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_transaksi);
        totalTelur=(TextView)findViewById(R.id.hasil_barang1);
        totalMinyak=(TextView)findViewById(R.id.hasil_barang2);
        totalTransaksi=(TextView)findViewById(R.id.total_harga);
        //        Untuk judul atas
        getSupportActionBar().setTitle("Halaman Transaksi");

//        Hasil Beli Telur
        int dapatTelur=getIntent().getExtras().getInt("HasilTelur");
        totalTelur.setText("Rp."+Integer.toString(dapatTelur));

//        Hasil Beli Minyak
        int dapatMinyak=getIntent().getExtras().getInt("HasilMinyak");
        totalMinyak.setText("Rp."+Integer.toString(dapatMinyak));

        int total= dapatMinyak+dapatTelur;
        totalTransaksi.setText("Rp"+Integer.toString(total));

    }
}