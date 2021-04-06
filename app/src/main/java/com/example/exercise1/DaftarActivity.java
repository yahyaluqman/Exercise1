package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class DaftarActivity extends AppCompatActivity {
    //Deklarasi variabel dengan tipe data EditText
    EditText edNama, edAlamat, edEmail, edPassword, edrepass;
    //Deklarasi variabel untuk TextView
    TextView edtJenis, edtAgama;

    //Deklarasi variabel untuk button
    Button btDaftar, btKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        //Menghubungkan variabel btnLogin dengan componen button pada layout
        btDaftar =findViewById(R.id.btdaftar);
        btKembali =findViewById(R.id.btkembali);
        edNama = findViewById(R.id.edName);
        edAlamat = findViewById(R.id.edAlamat);
        edEmail = findViewById(R.id.edEmail);
        edPassword = findViewById(R.id.edPass);
        edrepass = findViewById(R.id.edrepas);

        btDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Membuat kondisi untuk mengecek apakah EditText kosong atau tidak
                if (edNama.getText().toString().isEmpty() ||
                        edAlamat.getText().toString().isEmpty() ||
                        edEmail.getText().toString().isEmpty() ||
                        edPassword.getText().toString().isEmpty() ||
                        edrepass.getText().toString().isEmpty())
                {
                    //Menampilkan pesan notifikasi jika pendaftaran berhasil
                    Snackbar.make(view, "Data Harus Diisi Semua", Snackbar.LENGTH_LONG).show();
                }
                //Tampilan jika email dan password salah
                else {
                    // redirect to DaftarActivity
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil...",
                            Toast.LENGTH_LONG).show();
                }
            }
        });


        btKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // redirect to DaftarActivity
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
