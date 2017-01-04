package com.giuseppesorce.proguarderror.android.enter.interactors;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Giuseppe Sorce
 */
@Module
public class EnterInteractorModule {

  @Provides
  @Singleton
  EnterInteractor provideEnterInteractor(EnterApi api) {
    return new EnterInteractorImpl(api);
  }

}
