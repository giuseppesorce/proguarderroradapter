package com.giuseppesorce.proguarderror.android.retrofit;




import com.giuseppesorce.proguarderror.android.storage.Environment;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Singleton;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author GiuseppeSorce
 */
@Singleton
final class AuthHeaderInterceptor implements Interceptor {


  private Environment environment;

  @Inject
  public AuthHeaderInterceptor(Environment environment) {
    this.environment = environment;
  }

  @Override
  public Response intercept(Chain chain) throws IOException {
    Request request = chain.request();
    Request.Builder builder = request.newBuilder();
    builder.addHeader("X-CLIENT","");
    builder.addHeader("X-SID", "");
    builder.addHeader("X-TOKEN","");
     return chain.proceed(builder.build());
  }
}
