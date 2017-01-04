package com.giuseppesorce.proguarderror.android;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.giuseppesorce.proguarderror.android.retrofit.RetrofitModule;
import com.giuseppesorce.proguarderror.android.storage.EnvironmentModule;

import java.io.File;

/**
 * @author Giuseppe Sorce #@copyright xxxx 2017.
 *         <p>......</p>
 */

public class MyApplication extends Application {


    public static AppComponent appComponent;


    @Override
    public void onCreate() {
        super.onCreate();


        FacebookSdk.sdkInitialize(getApplicationContext());
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).
                retrofitModule(new RetrofitModule(new File(getCacheDir() + "/cache"),
                        10 * 1024 * 1024)).environmentModule(new EnvironmentModule(""))
                .build();
    }


}