package com.example.toko_sembako_kelompok5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button login;
EditText nama,pass_ku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nama=findViewById(R.id.txt_nama);
        pass_ku=findViewById(R.id.txt_pass);
        login=findViewById(R.id.btn_login);
        getSupportActionBar().setTitle("Halaman Login");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                halamanhome();
            }
        });
    }
    public void halamanhome()
    {
        if(nama.length()==0)
        {
            nama.requestFocus();
            nama.setError("Masukkan nama anda");
        }
        else {


            Intent pindah = new Intent(MainActivity.this, Halaman_home.class);
            startActivity(pindah);
        }
        }
}