package com.example.androidbti.myapplication;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

/**
 * Created by android.bti on 07/06/18.
 */

public class NotificationUtils {
    private static final String CHANNEL_ID = "br.imd.android.channel";
    private static final String CHANNEL_NAME = "My Channel";

    public static String getChannelId(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return CHANNEL_ID;
        }

        NotificationManager notificationManager =
                (NotificationManager)context.getSystemService(context.NOTIFICATION_SERVICE);

        NotificationChannel channel = notificationManager.getNotificationChannel(CHANNEL_ID);

        if(channel == null) {
            channel = new NotificationChannel(CHANNEL_ID,CHANNEL_NAME,NotificationManager.IMPORTANCE_DEFAULT);
            notificationManager.createNotificationChannel(channel);
        }

        return CHANNEL_ID;
    }
}
