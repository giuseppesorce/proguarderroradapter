package com.giuseppesorce.proguarderror.android.storage;


import android.text.TextUtils;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Giuseppe Sorce
 */
@Module
public class EnvironmentModule {



  private String baseUrl;


  public EnvironmentModule(String baseUrl) {
    this.baseUrl = "http://www.giuseppesorce.com/";
  }



  @Provides
  @Singleton
  public Environment provideEnvironment() {
    if (baseUrl == null || TextUtils.isEmpty(baseUrl)) {
      baseUrl = "http://www.giuseppesorce.com/";
    }


    return new Environment(baseUrl);
  }
}
