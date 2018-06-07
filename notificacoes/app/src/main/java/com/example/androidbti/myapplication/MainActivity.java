package com.example.androidbti.myapplication;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void notify(View view) {
        Notification.Builder builder =
                new Notification.Builder(this,NotificationUtils.getChannelId(this));
        builder.setContentTitle("Titulo da Notificacao");
        builder.setContentText("Aqui é o texto da notificacao");
        builder.setSmallIcon(android.R.drawable.sym_action_chat);
        builder.setAutoCancel(true);

        Intent intent = new Intent(this, MessageActivity.class);
        PendingIntent pendingIntent =
                PendingIntent.getActivity(this, 0,intent,0);
        builder.setContentIntent(pendingIntent);

        // cria a notificacao
        Notification notification = builder.build();

        NotificationManager notificationManager =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(50,notification);
    }

    public void notify2(View view) {
        Notification.Builder builder =
                new Notification.Builder(this,NotificationUtils.getChannelId(this));
        builder.setSmallIcon(android.R.drawable.sym_action_chat);
        builder.setAutoCancel(true);
        Notification.BigTextStyle style = new Notification.BigTextStyle()
                .setBigContentTitle("Titulo da notificacao")
                .bigText("Texto da notificacao");
        builder.setStyle(style);

        Intent intent1 = new Intent(this, Notification.class);
        Icon icon = Icon.createWithResource(this, android.R.drawable.ic_menu_view);

        PendingIntent pendingIntent1 = PendingIntent.getBroadcast(this, 0, intent1,0);

        Notification.Action action1 = new Notification.Action(icon, "Botao 1",pendingIntent1).build();

        Notification notification =builder.build();

        NotificationManager notificationManager =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(50, notification);
    }
}
