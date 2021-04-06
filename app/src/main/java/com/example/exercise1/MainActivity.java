package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk TextView
    TextView terdaftar;

    //Deklarasi variabel untuk EditText
    EditText edemail,edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel terdaftar pada layout
        terdaftar = (TextView) findViewById(R.id.terdaftar);

        //Menghubungkan variabel btnLogin dengan componen button pada layout
        btnLogin =findViewById(R.id.btSignIn);

        //Menghubungkan variabel edemail dengan componen button pada layout
        edemail =findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada layout
        edpassword =findViewById(R.id.edPassword);

        //membuat fungsi onclik pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menyimpan input user di edittext email kedalam variabel nama
                nama = edemail.getText().toString();

                //menyimpan input user di edittext password kedalam variabel password
                password = edpassword.getText().toString();

                //mengeset email yang benar
                String email = "admin@mail.com";

                //mengeset password yang benar
                String pass = "123456";

                //Tampilan jika email dan password kosong
                if (nama.isEmpty() || password.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email & Password wajib Diisi!", Toast.LENGTH_LONG);
                    edemail.setError("Email Tidak Boleh Kosong");
                    edpassword.setError("Password Tidak Boleh Kosong"); t.show();
                }
                else {
                    //membuat variabel toast dan membuat toast dengan menambahkan variabel nam dan password
                    //Tampilan jika email dan password benar
                    if (nama.equals("admin@mail.com")&&password.equals("123456")){
                        Toast.makeText(getApplicationContext(),"Login Sukses",Toast.LENGTH_SHORT).show();

                        //Membuat objek bundle
                        Bundle b = new Bundle();

                        //memasukkan value dari variabel nama dengan kunci "a"
                        // dan dimasukkan kedalam bundle
                        b.putString("a", nama.trim());

                        //memasukkan value dari variabel password dengan kunci "b"
                        // dan dimasukkan kedalam bundle
                        b.putString("b", password.trim());

                        //membat objek intent berpindah activity dari mainactivity ke Home_Activity
                        Intent i = new Intent(getApplicationContext(), Home_Activity.class);

                        //memasukkan bundle kedalam intent untuk dikirimkan ke ActivityHasil
                        i.putExtras(b);

                        //berpindah ke ActivityHasil
                        startActivity(i);
                    }
                    //Tampilan jika password salah
                    else if (nama.equals("admin@mail.com")){
                        Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_SHORT).show();
                    }
                    //Tampilan jika email salah
                    else if (password.equals("123456")){
                        Toast.makeText(getApplicationContext(), "Email Salah", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        //membuat fungsi onclik pada terdaftar
        terdaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // redirect to DaftarActivity
                Intent intent = new Intent(getApplicationContext(), DaftarActivity.class);
                startActivity(intent);
            }
        });
    }
}