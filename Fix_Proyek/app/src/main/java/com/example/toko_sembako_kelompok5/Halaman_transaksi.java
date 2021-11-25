package com.example.toko_sembako_kelompok5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Halaman_transaksi extends AppCompatActivity {
TextView totalTelur
        ,totalMinyak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_transaksi);
        totalTelur=(TextView)findViewById(R.id.hasil_barang1);
        totalMinyak=(TextView)findViewById(R.id.hasil_barang2);
        //        Untuk judul atas
        getSupportActionBar().setTitle("Halaman Transaksi");

        int dapat=getIntent().getExtras().getInt("HasilTelur");
//        String hasilTelur=dapat.getString("HasilTelur");
        totalTelur.setText(Integer.toString(dapat));
    }
}