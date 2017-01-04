package com.giuseppesorce.proguarderror.android.enter.interactors;



import com.giuseppesorce.proguarderror.android.Login;
import com.giuseppesorce.proguarderror.android.LoginResponse;

import java.io.File;

import okhttp3.ResponseBody;
import rx.Single;

/**
 * @author Giuseppe Sorce #@copyright xx 24/09/16.
 */

public interface EnterInteractor {


    Single<LoginResponse> login(Login login);




}
