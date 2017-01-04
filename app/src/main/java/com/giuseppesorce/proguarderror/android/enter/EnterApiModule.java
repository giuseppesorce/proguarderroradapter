package com.giuseppesorce.proguarderror.android.enter;




import com.giuseppesorce.proguarderror.android.enter.interactors.EnterApi;
import com.giuseppesorce.proguarderror.android.enter.interactors.EnterApiImpl;
import com.giuseppesorce.proguarderror.android.storage.Environment;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * @author Giuseppe Sorce
 */
@Module
public class EnterApiModule {

  @Provides
  @Singleton
  RetrofitEnterApi provideRetrofitUserApi(Retrofit retrofit) {
    return retrofit.create(RetrofitEnterApi.class);
  }

  @Provides
  @Singleton
  EnterApi provideUserApi(RetrofitEnterApi retrofitUserApi, Environment environment) {
    return new EnterApiImpl(retrofitUserApi, environment);

  }




}
