package com.example.androidbti.provamobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abreActivity(View view) {
        EditText nomeDoUsiario = (EditText) findViewById(R.id.myEditText);
        String userName = nomeDoUsiario.getText().toString();
        Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
        intent.putExtra("userName", userName);
        startActivity(intent);
    }
}
