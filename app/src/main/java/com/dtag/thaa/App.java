package com.dtag.thaa;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

public class App  extends Application {

   private  ApiInterface  apiInterface;
   private APIClient apiClient;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
        apiClient=new APIClient();

        setupAPiInterface();
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }

    private  void setupAPiInterface(){
        apiInterface=apiClient.getApi(this);
    }

    public  ApiInterface  getApiI(){
        return  apiInterface;
    }
}
