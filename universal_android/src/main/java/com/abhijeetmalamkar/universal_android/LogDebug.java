package com.abhijeetmalamkar.universal_android;

import android.util.Log;

public class LogDebug {
    private static final String TAG = "Something";

    public static void d(String message) {
        Log.d(TAG,message);
    }
}
