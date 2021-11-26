package com.example.toko_sembako_kelompok5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//import android.widget.Button;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Halaman_barang extends AppCompatActivity {
ImageButton Home
        ,barang
        ,kelompok
        ,beliTelur
        ,beliMinyak;
Button kurangMinyak
        ,kurangTelor
        ,hapusMinyak
        ,hapusTelur
        ,Button;
    int akumulasiTelor=0
            ,akumulasiMinyak=0;

    int hargaTelur=25000
            ,hargaMinyak=18000
            ,totalMinyak;

    boolean kurangOil
            ,kurangTelur
            ,tambahMinyak
            ,tambahTelur;

EditText telur
        ,minyak;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_barang);
        Home=findViewById(R.id.btn_home_barang);
        kelompok=findViewById(R.id.btn_tentang_barang);


//  Coba tombol beli
        Button=findViewById(R.id.btn_beli);

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

//        Test tombol beli
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Buy();
            }
        });

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
            public void onClick(View view)
            {
            TransaksiBeliTelur();
            }
        });
        beliMinyak.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                TransaksiBeliMinyak();

            }
        });
    }


//    Untuk tombol hapus unit aka reset
    public void HapusTelur()
    {

        telur.setText("");
        telur.setText(null);
    }
    public  void HapusMinyak()
    {
        minyak.setText("");
        minyak.setText(null);
    }


//    Untuk Tombol unit barang Decrement
    public void TombolKurangTelor()
    {
        if(telur==null)
        {
            telur.setText("");
        }
        akumulasiTelor--;
        telur.setText(""+akumulasiTelor);
        akumulasiTelor=Integer.parseInt(telur.getText()+"");
        kurangTelur = true;


    }
    public void TombolKurangMinyak()
    {
        if(minyak==null)
        {
            minyak.setText("");
        }
        else {
            akumulasiMinyak--;
            minyak.setText("" + akumulasiMinyak);
            akumulasiMinyak=Integer.parseInt(minyak.getText()+"");
            kurangOil=true;
        }
    }

//    Untuk Tombol unit barang Increment
    public void TransaksiBeliTelur()
    {
        if(telur==null)
        {
            telur.setText("");
            telur.clearFocus();

        }
        else {
            akumulasiTelor++;
            telur.setText("" + akumulasiTelor);
            akumulasiTelor=Integer.parseInt(telur.getText()+"");
            tambahTelur=true;
        }
    }
    public void TransaksiBeliMinyak()
    {

        if(minyak==null)
        {
            minyak.setText("");
            minyak.clearFocus();
        }
        else {
            akumulasiMinyak++;
            minyak.setText("" + akumulasiMinyak);
            akumulasiMinyak=Integer.parseInt(minyak.getText()+"");
            tambahMinyak=true;
        }

    }
    //    Tombol beli
    public void Buy()
    {
        if(tambahMinyak==true)
        {
            Intent hasilTransaksiMinyak = new Intent(Halaman_barang.this,Halaman_transaksi.class);
            int totalMinyak=akumulasiMinyak*hargaMinyak;
            hasilTransaksiMinyak.putExtra("HasilMinyak",totalMinyak);
            startActivity(hasilTransaksiMinyak);
            tambahMinyak=false;
        }
        else if(tambahTelur==true)
        {
            Intent hasilTransaksiTelur = new Intent(Halaman_barang.this,Halaman_transaksi.class);

            int total=akumulasiTelor*hargaTelur;
            hasilTransaksiTelur.putExtra("HasilTelur",total);
                startActivity(hasilTransaksiTelur);
                tambahTelur=false;
        }
        else if(kurangOil==true)
        {
            Intent hasilTransaksiMinyak = new Intent(Halaman_barang.this,Halaman_transaksi.class);
            int totalMinyak=akumulasiMinyak*hargaMinyak;
            hasilTransaksiMinyak.putExtra("HasilMinyak",totalMinyak);
            startActivity(hasilTransaksiMinyak);
            kurangOil=false;
        }
        else if(kurangTelur==true)
        {
            Intent hasilTransaksiTelur = new Intent(Halaman_barang.this,Halaman_transaksi.class);

            int total=akumulasiTelor*hargaTelur;
            hasilTransaksiTelur.putExtra("HasilTelur",total);
            startActivity(hasilTransaksiTelur);
            kurangTelur=false;
        }
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