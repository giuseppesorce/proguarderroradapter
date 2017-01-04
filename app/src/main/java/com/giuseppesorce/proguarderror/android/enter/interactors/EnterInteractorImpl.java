package com.giuseppesorce.proguarderror.android.enter.interactors;

import com.giuseppesorce.proguarderror.android.Login;
import com.giuseppesorce.proguarderror.android.LoginResponse;

import java.io.File;

import okhttp3.ResponseBody;
import rx.Single;

/**
 * @author Giuseppe Sorce
 */
public class EnterInteractorImpl implements EnterInteractor {


    private EnterApi api;

    public EnterInteractorImpl(EnterApi api) {
        this.api = api;
    }

    @Override
    public Single<LoginResponse> login(Login login) {
        return api.login(login);
    }


}
