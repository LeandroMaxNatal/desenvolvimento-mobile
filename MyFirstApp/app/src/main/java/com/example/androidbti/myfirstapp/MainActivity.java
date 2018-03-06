package com.example.androidbti.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("MeuApp","Mensagem de Informação");
        Log.d("MeuApp","Mensagem de Debug");
        Log.w("MeuApp","Mensagem de Warn");
        Log.e("MeuApp","Mensagem de Erro");
        Log.v("MeuApp","Mensagem de Verbose");
    }
}
