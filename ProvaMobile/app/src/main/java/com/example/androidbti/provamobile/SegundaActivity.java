package com.example.androidbti.provamobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "userName";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent = getIntent();
        String nomeDoUsuario = "Prezado(a) " + intent.getStringExtra(EXTRA_MESSAGE);

        TextView tvUsername = (TextView) findViewById(R.id.tvUserName);
        tvUsername.setText(nomeDoUsuario);
    }

    public void voltaPraActivity1(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    AdapterView.OnItemClickListener clickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            int contato = adapterView.getId();
            Toast.makeText(getApplicationContext(),"TESTE",Toast.LENGTH_LONG).show();
        }
    };

}