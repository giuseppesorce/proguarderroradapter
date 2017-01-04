package com.giuseppesorce.proguarderror.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.giuseppesorce.proguarderror.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApplication.appComponent.environment().setBaseUrl("https://wwww.giuseppesorce.com");

        EnterPresenter enterPresenter = MyApplication.appComponent.enterPresenter();
        enterPresenter.loadLogin();
    }
}
