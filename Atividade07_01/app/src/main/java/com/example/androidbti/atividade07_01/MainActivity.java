package com.example.androidbti.atividade07_01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioButton masc = (RadioButton) findViewById(R.id.rdbMasc);
        Button exibir = (Button) findViewById(R.id.btnExibir);
        Button limpar = (Button) findViewById(R.id.btnLimpar);
        final EditText edtNome = (EditText) findViewById(R.id.edtNome);
        final TextView sexo = (TextView) findViewById(R.id.resSexo);
        final TextView nome = (TextView) findViewById(R.id.resNome);

        exibir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(masc.isChecked()){
                    sexo.setText("Masculino");
                } else {
                    sexo.setText("Feminino");
                }
                nome.setText(edtNome.getText());
            }
        });

        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNome.setText("");
                nome.setText("");
                sexo.setText("");
                masc.setSelected(true);
            }
        });
        masc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(masc.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Elemento Masc Clicado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
