package com.giuseppesorce.proguarderror.android.enter.interactors;



import com.giuseppesorce.proguarderror.android.Login;
import com.giuseppesorce.proguarderror.android.LoginResponse;


import rx.Single;

/**
 * @author Giuseppe Sorce #@copyright xx 24/09/16.
 */

public interface EnterApi {


    Single<LoginResponse> login(Login login);



}
