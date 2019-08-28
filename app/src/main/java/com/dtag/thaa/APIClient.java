package com.dtag.thaa;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public  class APIClient {

    private  Retrofit retrofit = null;



//  m n  static CookieJar cookieJar = new CookieJar() {
//        private final HashMap<String, List<Cookie>> cookieStore = new HashMap<>();
//
//        @Override
//        public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
//            cookieStore.put(url.host(), cookies);
//        }
//
//        @Override
//        public List<Cookie> loadForRequest(HttpUrl url) {
//            List<Cookie> cookies = cookieStore.get(url.host());
//            return cookies != null ? cookies : new ArrayList<Cookie>();
//        }
//    };


    private  OkHttpClient buildClient( Context context) {
        return new OkHttpClient
                .Builder()
                .connectTimeout(50, TimeUnit.SECONDS)
                .writeTimeout(50, TimeUnit.SECONDS)
                .readTimeout(50, TimeUnit.SECONDS)
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .addInterceptor(new ReceivedCookiesInterceptor(context))
                .build();
    }

        public   Retrofit  getClient(Context context) {


// m           OkHttpClient client = new OkHttpClient();
//
//            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//
//            OkHttpClient.Builder builder = new OkHttpClient.Builder();
//          builder.addInterceptor(new AddCookiesInterceptor(context)); // VERY VERY IMPORTANT
//           builder.addInterceptor(new ReceivedCookiesInterceptor(context));
//            builder.addInterceptor(interceptor);
//
//
//            client = builder.build();
//


            if(retrofit == null) {

                retrofit = new Retrofit.Builder()
                        .baseUrl("https://elber.amr-work.dtagdev.com/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(buildClient(context))
                        .build();

            }

        return retrofit;
    }

    public  ApiInterface getApi(Context context){
        return (ApiInterface) getClient(context ).create(ApiInterface.class);
    }

}
