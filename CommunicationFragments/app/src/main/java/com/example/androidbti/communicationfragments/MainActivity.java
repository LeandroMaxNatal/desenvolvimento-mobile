package com.example.androidbti.communicationfragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements testfragment.OnInvertListener{

    private resultfragment resultfragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        resultfragment = (resultfragment) getFragmentManager().findFragmentById(R.id.frag_result);


    }

    @Override
    public void onInvert(String texto) {
        resultfragment.inverta(texto);
    }
}
