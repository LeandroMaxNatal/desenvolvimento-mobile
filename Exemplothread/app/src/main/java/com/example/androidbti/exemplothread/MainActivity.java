package com.example.androidbti.exemplothread;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {

    //private TextView textView;

    private TextView txtContent;
    private ProgressBar progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  textView = (TextView)findViewById(R.id.txt_status);

        txtContent = (TextView) findViewById(R.id.txtContent);
        progress = (ProgressBar) findViewById(R.id.prgBar);

        txtContent.setVisibility(View.GONE);

        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(10000);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        showContent();
                    }
                });
            }
        }).start();
    }

    public void showContent(){
        txtContent.setVisibility(View.VISIBLE);
        progress.setVisibility(View.GONE);
    }

    /*
    public void processar(View view){
        textView.setText("Processando...");
        executarAlgoDemorado();
        //textView.setText("Processo Finalizado");
    }
    */

    /*
    private void executarAlgoDemorado(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(3000);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText("Processo Finalizado");
                    }
                });
            }
        }).start();
    }
    */
}
