package com.giuseppesorce.proguarderror.android.enter;



import com.giuseppesorce.proguarderror.android.EnterPresenter;
import com.giuseppesorce.proguarderror.android.enter.interactors.EnterInteractor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Giuseppe Sorce @copyright Amasingapps srl  2016.
 */
@Module
public class EnterModule {

  @Provides
  @Singleton
  EnterPresenter provideEnterPresenter(EnterInteractor enterInteractor) {
    return new EnterPresenterImpl(enterInteractor);
  }
}
