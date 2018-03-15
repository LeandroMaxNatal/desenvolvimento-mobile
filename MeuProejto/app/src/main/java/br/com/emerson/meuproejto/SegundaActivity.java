package br.com.emerson.meuproejto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaActivity extends Activity {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        botao = findViewById(R.id.btn);

        //Quando esta activity é chamada, o contador é enviado pela Activity1 dentro do bundle.
        //Este código extrai esta informação da intent recebida.
        Bundle b = getIntent().getExtras();
        int contador = b.getInt("cont");

        //botão com o novo valor do contador (recebido da Activity1)
        botao.setText(String.valueOf(contador));


    }

    public void segundaAcao(View view) {

        //Quando ocorre um clique no botão, lê o texto do botão (que é o valor atual do contador) e incrementa
        //o valor
        int contador = Integer.parseInt(botao.getText().toString());
        contador++;

        //Cria uma nova intent (que será enviada de volta para a Activity1)
        Intent i = new Intent();

        //Cria um bundle, coloca o contador dentro dele e atrela o bundle à intent
        Bundle b = new Bundle();
        b.putInt("cont", contador);
        i.putExtras(b);

        //Define um result e uma intent antes de terminar a activity
        setResult(RESULT_OK, i);

        //Termina a activity, o que vai ocasionar a chamada de onActivityResult() em Activity1
        finish();
    }
}
