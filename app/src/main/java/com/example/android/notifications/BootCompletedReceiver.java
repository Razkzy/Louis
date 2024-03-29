package com.example.android.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Louis.
 */
public class BootCompletedReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        //start the scheduler service
        Intent serviceIntent = new Intent(context, AlarmScheduler.class);
        serviceIntent.setFlags(0);
        context.startService(serviceIntent);
    }
}
