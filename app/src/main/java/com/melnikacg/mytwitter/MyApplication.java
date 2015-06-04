package com.melnikacg.mytwitter;

import android.app.Application;

import com.crashlytics.android.Crashlytics;

/**
 * Created by Admin on 03.06.2015.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Crashlytics.start(this);
    }


}
