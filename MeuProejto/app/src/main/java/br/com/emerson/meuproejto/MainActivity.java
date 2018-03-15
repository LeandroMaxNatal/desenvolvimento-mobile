package br.com.emerson.meuproejto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = findViewById(R.id.button);

        botao.setText("1");
        Log.i("meuApp","oncreate()");
    }

    public void acao(View v){

        //Quando o botão é clicado, lê o texto do botão e incrementa o valor em 1
        int contador = Integer.parseInt(botao.getText().toString());
        contador++;

        //Cria um bundle e coloca o novo valor do contador dentro dele
        Bundle b = new Bundle();
        b.putInt("cont", contador);

        //Cria uma intent, usada para chamar Activity2, e fornece o
        //bundle como parâmetro (que contém o novo valor do contador)
        Intent i = new Intent(this, SegundaActivity.class);
        i.putExtras(b);

        //Chama a Activity2 e aguarda o término dela
        startActivityForResult(i, 10);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //Este método será chamado quando a Activity2 terminar

        //Checa o request code e o resultado fornecido antes de continuar
        if (requestCode == 10 && resultCode == RESULT_OK) {
            //Obtém o bundle relacionado à intent enviada pela Activity2 e extrai o valor
            //atual do contador
            Bundle b = data.getExtras();
            int contador = b.getInt("cont");

            //Define o valor do contador como o novo texto do botão
            botao.setText(String.valueOf(contador));
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("meuApp","onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("meuApp","onResume()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("meuApp","onStop()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("meuApp","onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("meuApp","onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("meuApp","onDestroy)");
    }
}
