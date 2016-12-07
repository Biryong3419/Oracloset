package com.example.woocheol.oracloset.Tools;

import android.app.Application;
import android.content.Context;

/**
 * Created by woocheol on 2016. 12. 1..
 */

public class MyApplication extends Application {
    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
    }
    public static Context getsContext(){
        return sContext;
    }
}
