package com.example.androidbti.provamobile;

/**
 * Created by android.bti on 15/05/18.
 */

public class Contatos {
    public static Contato[] contatos;

    public Contatos(){
        for (int i = 0; i <= 5; i++){
            contatos[0] = new Contato(
                    "Contato " + (i + 1),
                    "contato"+(i+1)+"@email.com",
                    "9999-999"+i);
        }
    }


}
