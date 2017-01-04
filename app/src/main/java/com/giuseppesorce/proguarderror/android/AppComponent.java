package com.giuseppesorce.proguarderror.android;

import android.content.Context;
import android.content.res.Resources;


import com.giuseppesorce.proguarderror.android.enter.EnterApiModule;
import com.giuseppesorce.proguarderror.android.enter.EnterModule;
import com.giuseppesorce.proguarderror.android.enter.interactors.EnterInteractorModule;
import com.giuseppesorce.proguarderror.android.retrofit.RetrofitModule;
import com.giuseppesorce.proguarderror.android.storage.Environment;
import com.giuseppesorce.proguarderror.android.storage.EnvironmentModule;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * @author Giuseppe Sorce @copyright AmasingApps 2016.
 */
@Singleton
@Component(modules = {AppModule.class, RetrofitModule.class, EnvironmentModule.class, EnterApiModule.class, EnterInteractorModule.class, EnterModule.class

})
public interface AppComponent {

    Context context();
    Resources resources();
    Environment environment();
    Gson Gson();
    Retrofit retrofit();

    EnterPresenter enterPresenter();




}
