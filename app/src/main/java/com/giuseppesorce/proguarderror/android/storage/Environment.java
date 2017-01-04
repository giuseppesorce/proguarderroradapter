package com.giuseppesorce.proguarderror.android.storage;


import javax.inject.Inject;
import javax.inject.Singleton;


/**
 * @author Giuseppe Sorce @copyright AmasingApps.com  2016.
 */

@Singleton
public class Environment {


  private String baseUrl;


  @Inject
  public Environment(String baseUrl) {
    this.baseUrl = baseUrl;

  }


  public String getBaseUrl() {
    return  "http://www.giuseppesorce.com/";

  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

}
