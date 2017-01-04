package com.giuseppesorce.proguarderror.android;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.view.inputmethod.InputMethodManager;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;



/**
 * @author Giuseppe Sorce @copyright AmasingApps srl  2016.
 */

@Module
public class AppModule {

    private final Context context;


    public AppModule(Context context) {
        this.context = context;

    }

    @Provides
    @Singleton
    Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    Resources provideResources() {
        return context.getResources();
    }


    @Provides
    @Singleton
    Gson proviceGson() {
        return new Gson();
    }


    @Provides
    @Singleton
    MyApplication provideSMApplication() {
        return (MyApplication) context;
    }



}
