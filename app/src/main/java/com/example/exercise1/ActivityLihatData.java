package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {
    //Deklarasikan variabel dengan jenis data TextView
    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        //membuat variabel dengan jenis data bundle dan
        //assign balue dari variabel tersebut dengan
        //getIntent().getEctras()
        Bundle bundle = getIntent().getExtras();

        //Membuat variabel nama dan assign value dari pesan
        //yang dikirimkan dari activity sebelumnya
        String nama = bundle.getString("a");

        //Menghubungkan variabel tvnama dengan componen Textview pada layout
        tvnama = (TextView) findViewById(R.id.tvNamaKontak);
        //Menghubungkan variabel tvnomor dengan componen Textview pada layout
        tvnomor = (TextView) findViewById(R.id.tvNomorTelepon);

        //Membuat fungsi untuk mengatur textview nama dan nomor telepon
        //berdasarkan pesan yang dikirimkan dari activity sebelumnya
        switch (nama)
        {
            case "Inayah":
                tvnama.setText("Inayah M");
                tvnomor.setText("08122233344");
                break;
            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomor.setText("08133224455");
                break;
            case "Eris":
                tvnama.setText("Eris J");
                tvnomor.setText("08125533344");
                break;
            case "Fikri":
                tvnama.setText("M Fikri");
                tvnomor.setText("08122453344");
                break;
            case "Maul":
                tvnama.setText("Maul M");
                tvnomor.setText("08126633344");
                break;
            case "Intan":
                tvnama.setText("Intan S");
                tvnomor.setText("08122555344");
                break;
            case "Vina":
                tvnama.setText("Vina R");
                tvnomor.setText("08125556344");
                break;
            case "Gita":
                tvnama.setText("Gita S");
                tvnomor.setText("08199233344");
                break;
            case "Lutfi":
                tvnama.setText("Lutfi M");
                tvnomor.setText("08122233234");
                break;
            case "Vian":
                tvnama.setText("Vian M");
                tvnomor.setText("08122969344");
                break;
        }
    }
}