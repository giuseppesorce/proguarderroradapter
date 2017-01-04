package com.giuseppesorce.proguarderror.android.enter;


import com.giuseppesorce.proguarderror.android.Login;
import com.giuseppesorce.proguarderror.android.LoginResponse;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Single;

/**
 * @author Giuseppe Sorce
 */

public interface RetrofitEnterApi {

  @POST("/responselogin.php")
  Single<LoginResponse> login(@Body Login login);


}


