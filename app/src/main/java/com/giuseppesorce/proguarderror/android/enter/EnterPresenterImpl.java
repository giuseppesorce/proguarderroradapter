package com.giuseppesorce.proguarderror.android.enter;

import android.util.Log;

import com.giuseppesorce.proguarderror.android.EnterPresenter;
import com.giuseppesorce.proguarderror.android.Login;
import com.giuseppesorce.proguarderror.android.LoginResponse;
import com.giuseppesorce.proguarderror.android.enter.interactors.EnterInteractor;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import retrofit2.adapter.rxjava.HttpException;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * @author Giuseppe Sorce #@copyright xxxx 2017.
 *         <p>......</p>
 */
public class EnterPresenterImpl implements EnterPresenter {

    private  EnterInteractor enterInteractor;

    public EnterPresenterImpl(EnterInteractor enterInteractor) {
        this.enterInteractor= enterInteractor;
    }

    @Override
    public void loadLogin() {
        Login login= new Login();
        login.type="email";
        login.usr="giuseppe.sorce@warpmobile.it";
        login.psw="topolino";
        enterInteractor.login(login).
                subscribeOn(Schedulers.newThread()).timeout(40, TimeUnit.SECONDS)
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<LoginResponse>() {
            @Override
            public void call(LoginResponse loginResponse) {

            Log.i("login", "OK LOGIN: "+loginResponse.token);

            }
        }, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                Log.i("login", "ERRORE: "+throwable.getLocalizedMessage());
            }
        });
    }
}
