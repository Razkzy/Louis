package com.example.android.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Louis
 */
public class MidnightAlarmReceiver extends BroadcastReceiver{
    private static final String TAG = "MidnightReceiver";
    public static final int FLAG_MIDNIGHT_RELOAD = 100;
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "Received mighnight alarm ");
        Intent serviceIntent = new Intent(context, AlarmScheduler.class);
        serviceIntent.addFlags(FLAG_MIDNIGHT_RELOAD);
        context.startService(serviceIntent);
    }
}
