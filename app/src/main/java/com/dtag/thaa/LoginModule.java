package com.dtag.thaa;

import com.google.gson.annotations.SerializedName;

public class LoginModule {
    @SerializedName("customer_id")
    private int  customerId;
    @SerializedName("profile_image")
    private String profileImage;
    @SerializedName("token")
    private String token;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
