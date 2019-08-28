package com.dtag.thaa;


import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface ApiInterface {


//
    @GET("api/provider/types")
    Call<GeneralModel> getProviderTypes();

    @GET("api/categories")
    Call<GeneralModel> getProjectType();


    @FormUrlEncoded
    @POST("api/register")
    Call<GeneralModel> register(@Field("first_name") String first_name, @Field("last_name") String last_name,
                                @Field("email") String email,
                                @Field("phone") String phone,
                                @Field("password") String password,
                                @Field("password_confirmation") String confirmPassword);

//    @FormUrlEncoded
//    @POST("api/provider/validate_activation_code")
//    Call<GeneralModel> activationCode(
//            @Field("activation_code") String email,
//            @Header("token") String token);

    @FormUrlEncoded
    @POST("api/login")
    Call<GeneralModel> login(
            @Field("email") String email,
            @Field("password") String password);

    @GET("api/products")
    Call<GeneralModel> getProducts(@Query("offset") int offest);

    @GET("/api/projects")
    Call<GeneralModel> getProjects(@Query("offset") int offest, @Query("category_id") int categoryId);
    // get  news
    @GET("api/news")
    Call<GeneralModel> getNews(@Query("offset") int offest);
    // get news items

    @GET("api/news/details")
    Call<GeneralModel> getNewsItems(@Query("id") int idItem);

    @GET("api/images")
    Call<GeneralModel> getImages(@Query("offset") int offest);

    @GET("api/fast_donations")
    Call<GeneralModel> getFastDonation();


    // contact us
    @FormUrlEncoded
    @POST("api/contact_us")
    Call<GeneralModel> contactUs(
            @Field("name") String name,
            @Field("message") String message,
            @Field("email") String Email,
            @Field("subject") String title
    );

// reportAbout abstint
    @FormUrlEncoded
    @POST("api/report_abstinent")
    Call<GeneralModel> reportAbout(
            @Field("name") String name,
            @Field("age") String age,
            @Field("address") String address,
            @Field("phone") String phone,
            @Field("description") String description

    );


    // add cart
    @FormUrlEncoded
    @POST("api/cart/add")
    Call<GeneralModel> addCart(
            @Field("item_id") int itemId,
            @Field("item_price") String price,
            @Field("item_type") String donationType, @Header("token") String token


    );

    // edit cart
    @FormUrlEncoded
    @POST("api/cart/edit")
    Call<GeneralModel> editCart(
            @Field("row_id") int itemId,
            @Field("item_quantity") int quantity,
            @Header("token") String token

    );

    // remove cart
    @FormUrlEncoded
    @POST("api/cart/remove")
    Call<GeneralModel> removeCart(
            @Field("row_id") int itemId, @Header("token") String token


    );

    @GET("api/cart/list")
    Call<GeneralModel> getCart(@Header("token") String token);

    @GET("api/profile/details")
    Call<GeneralModel> getInfo(@Header("token") String token);

    // edit cart
    @FormUrlEncoded
    @POST("api/profile/update/info")
    Call<GeneralModel> upDate(
            @Field("first_name") String firName,
            @Field("last_name") String lasName,
            @Field("email") String email,
            @Field("phone") String phone,

            @Header("token") String token

    );

    @Multipart
    @POST("api/profile/update/image")
    Call<GeneralModel>upload_photoU(@Part MultipartBody.Part img, @Header("token") String token);


    @FormUrlEncoded
    @POST("api/profile/update/password")
    Call<GeneralModel> changePassword(
            @Field("old_password") String firName,
            @Field("new_password") String lasName,
            @Field("new_password_confirmation") String email,
            @Header("token") String token

    );

    @GET("api/about")
    Call<GeneralModel> getAbout();


//
//    //here we will upload service provider.
//    @Multipart
//    @POST("api/provider/services/add")
//    Call<GeneralModel> addServices(@Part("title") RequestBody title, @Part("description") RequestBody description
//            , @Part("price") RequestBody price
//            , @Part List<MultipartBody.Part> images, @Header("token") String token);
//
//// here we  get list service Provider  within home provider
//@GET("api/provider/services")
//Call<GeneralModel> getServiceProvider(@Query("offset") int offset1, @Header("token") String token);
//
//@GET("api/provider/services/details")
//    Call<GeneralModel> getServiceProviderDetails(@Query("item_id") int itemId, @Header("token") String token);
//
//    @Multipart
//    @POST("api/provider/services/edit")
//    Call<GeneralModel> modifiServices(@Part("title") RequestBody title, @Part("description") RequestBody description
//            , @Part("price") RequestBody price, @Part("item_id") RequestBody itemId
//            , @Part List<MultipartBody.Part> images, @Part("old_images_names[]") List<RequestBody> previousImages, @Header("token") String token);
//
//
//
//    @FormUrlEncoded
//    @POST("api/provider/services/delete")
//    Call<GeneralModel> deleteServiceProvider(
//            @Field("item_id") String itemId
//            , @Header("token") String token);
//
//    @FormUrlEncoded
//    @POST("api/provider/profile/update/info")
//    Call<GeneralModel> changeProfile(
//            @Field("first_name") String firstName,
//            @Field("last_name") String lastName,
//            @Field("email") String email,
//            @Field("phone") String phone,
//            @Field("website") String website,
//            @Field("address") String address,
//            @Field("city_id") int cityId
//
//            , @Header("token") String token);
//
//    @GET("api/provider/profile/details")
//    Call<GeneralModel> getdetails(@Header("token") String token);
//
//
//// here we will upload image
//
//   @Multipart
//   @POST("api/provider/profile/update/image")
//   Call<GeneralModel>upload_photo(@Part MultipartBody.Part img, @Header("token") String token);
//
//
//    @FormUrlEncoded
//    @POST("api/provider/profile/update/password")
//    Call<GeneralModel>change_password(@Field("old_password") String oldpass, @Field("new_password") String npassword, @Field("new_password_confirmation") String npasswordc, @Header("token") String token);
//
//    //........................................................................................................................................................................................
///**
// * here we  will handle  user api
// *
// */
//
//@FormUrlEncoded
//@POST("api/customer/register")
//Call<GeneralModel> registerUser(@Field("city_id") int cityId, @Field("first_name") String first_name, @Field("last_name") String last_name,
//                                @Field("email") String email,
//                                @Field("phone") String phone,
//                                @Field("password") String password,
//
//                                @Field("password_confirmation") String confirmPassword);
//
//    @FormUrlEncoded
//    @POST("api/customer/login")
//    Call<GeneralModel> loginUser(
//            @Field("email") String email,
//            @Field("password") String password);
//
//
//    @FormUrlEncoded
//    @POST("api/customer/validate_activation_code")
//    Call<GeneralModel> userActiveCode(
//            @Field("active_code") String code,
//            @Header("token") String token);
//
//    @GET("api/customer/get_provider_type")
//    Call<GeneralModel> getProviders(@Query("type") int type, @Query("offset") int offset);
//
//    @GET("api/customer/provider/services")
//    Call<GeneralModel> getGeneralProviderServices(@Query("provider_id") int provider, @Query("offset") int offset);
//
//    @GET("api/customer/provider/about")
//    Call<GeneralModel> getProviderInfou(@Query("provider_id") int provider);
//
//    @GET("api/customer/services/details")
//    Call<GeneralModel> getServiceProviderUDetails(@Query("service_id") int itemId, @Header("token") String token);
//
//    //rat api
//
//    @FormUrlEncoded
//    @POST("api/customer/rates/add")
//    Call<GeneralModel> userRate(
//            @Field("service_id") int serviceId, @Field("rate") int code,
//            @Header("token") String token);
//    //
//    @FormUrlEncoded
//    @POST("api/customer/comments/add")
//    Call<GeneralModel> addcomment(
//            @Field("service_id") int serviceId, @Field("comment") String comment,
//            @Header("token") String token);
//
//    @FormUrlEncoded
//    @POST("api/customer/favorites/add_remove")
//    Call<GeneralModel> addRemoveFavorite(
//            @Field("service_id") int serviceId,
//            @Header("token") String token);
//
//
//    // get list of commit
//
//    @GET("api/customer/comments/list")
//    Call<GeneralModel> getComments(@Query("offset") int offset, @Query("service_id") int itemId, @Header("token") String token);
//
//    @FormUrlEncoded
//    @POST("api/customer/orders/send")
//    Call<GeneralModel> addService(
//            @Field("service_id") int serviceId, @Field("phone") String phone, @Field("name") String name, @Field("order_date") String order_date, @Field("order_time") String order_time
//            , @Header("token") String token);
//
//
//    @GET("api/customer/home")
//    Call<GeneralModel> homeServiceUser(@Query("offset") int offset, @Header("token") String token);
//
//
//    @GET("api/customer/favorites/list")
//    Call<GeneralModel> favoriteService(@Query("offset") int offset, @Header("token") String token);
//    @GET("api/customer/search")
//    Call<GeneralModel> homeServiceUserS(@Query("city_id") int cityId, @Query("type_id") int providerId, @Query("offset") int offset, @Header("token") String token);
//
//    @FormUrlEncoded
//    @POST("api/customer/profile/update/info")
//    Call<GeneralModel> changeProfileU(
//            @Field("first_name") String firstName,
//            @Field("last_name") String lastName,
//            @Field("email") String email,
//            @Field("phone") String phone,
//            @Field("website") String website,
//            @Field("address") String address,
//            @Field("city_id") int cityId
//            , @Header("token") String token);
//
//
//
//    @GET("api/customer/profile/details")
//    Call<GeneralModel> getdetailsU(@Header("token") String token);
//
//
//    @Multipart
//    @POST("api/customer/profile/update/image")
//    Call<GeneralModel>upload_photoU(@Part MultipartBody.Part img, @Header("token") String token);
//
//
//    @FormUrlEncoded
//    @POST("api/customer/profile/update/password")
//    Call<GeneralModel>change_passwordU(@Field("old_password") String oldpass, @Field("new_password") String npassword, @Field("new_password_confirmation") String npasswordc, @Header("token") String token);
//
//
//
//    @GET("api/about_app")
//    Call<GeneralModel> getAbout();
//
//    @GET("api/conditions_terms")
//    Call<GeneralModel> condition();
//
//    // call us
//    @FormUrlEncoded
//    @POST("api/{customer}/contactus")
//    Call<GeneralModel>callUs(@Field("name") String name, @Field("subject") String title, @Field("email") String email, @Field("message") String message, @Path("customer") String typeUser, @Header("token") String token);
//
//
//// provider_comments
//@GET("api/provider/services/comments")
//Call<GeneralModel> getCommentProvider(@Query("offset") int offset, @Query("item_id") int itemId, @Header("token") String token);
//
//    @GET("api/provider/services/orders")
//    Call<GeneralModel> getProviderOrders(@Query("offset") int offset, @Header("token") String token);
//
//// here we will implement resetPassword
//
//
//    @GET("api/{customer}/forget_password")
//    Call<GeneralModel>senforgetPassword(@Path("customer") String typeUser, @Query("email") String email);
//
//
//    @FormUrlEncoded
//    @POST("api/{customer}/set_reset_password")
//    Call<GeneralModel>resetPass(@Field("reset_password") String code, @Field("password") String newPassword, @Field("password_confirmation") String message, @Field("email") String email, @Path("customer") String typeUser);
//
//
//
//
//// get_all_city
//@GET("api/cities")
//Call<GeneralModel> getCity();
//
//






}


