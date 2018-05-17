package com.example.androidbti.provamobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1);

        adapter.add("Contato 1");
        adapter.add("Contato 2");
        adapter.add("Contato 3");
        adapter.add("Contato 4");
        adapter.add("Contato 5");

        ListView listView = (ListView) findViewById(R.id.myListView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(clickListener);
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