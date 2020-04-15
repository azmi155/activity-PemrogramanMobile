package com.example.myapplication;
import android.content.Intent;
import android.net.Uri;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate() \n Pertama kali aplikasi dijalankan", Toast.LENGTH_SHORT).show();


    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart() \n Mengindikasikan activity yang ditampilkan ke pengguna", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume() \n aplikasi mulai berinteraksi dengan pengguna", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause() \n Aplikasi yang kita jalankan kembali ke halaman sebelumnya", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop() \n Aplikasi kita bekerja dibelakang layar dalam waktu cukup lama", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart() \n Activity kembali menampilkan user interface setelah status stop ", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy() \n Dipanggil saat aplikasi benar- benar berhenti", Toast.LENGTH_LONG).show();
    }
    public void BukaActivity(View v) {
        Intent codetr = new Intent(Intent.ACTION_VIEW);
        codetr.setData(Uri.parse("http://codetanwir.blogspot.com"));
        startActivity(codetr);
    }
    public void KelarActivity(View v) {
        finish();
    }
}
