package com.example.androidbti.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class NotificationReceiver extends BroadcastReceiver {
    private static final String ACTION_BUTTON_1 = "br.imd.action.BUTTON_1";
    private static final String ACTION_BUTTON_2 = "br.imd.action.BUTTON_2";

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        String mensagem;

        switch (action) {
            case ACTION_BUTTON_1:
                mensagem = "Clicou no botão 1";
                break;
            case ACTION_BUTTON_2:
                mensagem = "Clicou no botão 2";
                break;
            default:
                mensagem = "Ação desconhecida";
        }

        Toast.makeText(context, mensagem, Toast.LENGTH_SHORT).show();
    }
}
