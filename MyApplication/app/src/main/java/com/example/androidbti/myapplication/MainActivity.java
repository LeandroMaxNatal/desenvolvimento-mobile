package com.example.androidbti.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exibeDados(View view){
        TextView tv = (TextView) findViewById(R.id.nameResult);
        EditText et = (EditText) findViewById(R.id.editTxName);
        tv.setText(et.getText().toString());
    }
}
