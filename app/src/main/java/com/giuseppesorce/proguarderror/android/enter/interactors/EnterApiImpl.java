package com.giuseppesorce.proguarderror.android.enter.interactors;

import com.giuseppesorce.proguarderror.android.Login;
import com.giuseppesorce.proguarderror.android.LoginResponse;
import com.giuseppesorce.proguarderror.android.enter.RetrofitEnterApi;
import com.giuseppesorce.proguarderror.android.storage.Environment;



import java.io.File;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import rx.Single;

/**
 * @author Giuseppe Sorce #@copyright xx 24/09/16.
 */
public class EnterApiImpl implements EnterApi {


    private RetrofitEnterApi retrofitEnterApi;


    public EnterApiImpl(RetrofitEnterApi retrofitUserApi, Environment environment) {
        this.retrofitEnterApi = retrofitUserApi;
        Environment environmentData = environment;
    }

    @Override
    public Single<LoginResponse> login(Login login) {
        return retrofitEnterApi.login(login);
    }


}

