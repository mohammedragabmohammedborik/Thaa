package com.dtag.thaa;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ErrorModel {


    @SerializedName("image")
    private List<String> images;

    @SerializedName("reset_password")
    private List<String> resetCode;

    public List<String> getResetCode() {
        return resetCode;
    }

    public void setResetCode(List<String> resetCode) {
        this.resetCode = resetCode;
    }

    @SerializedName("order_date")
    private List<String> order_date;
    @SerializedName("order_time")
    private List<String> order_time;
    @SerializedName("phone")
    private List<String> phone;

    public List<String> getOrder_date() {
        return order_date;
    }

    public void setOrder_date(List<String> order_date) {
        this.order_date = order_date;
    }

    public List<String> getOrder_time() {
        return order_time;
    }

    public void setOrder_time(List<String> order_time) {
        this.order_time = order_time;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    @SerializedName("account")
    private List<String> account;
    @SerializedName("password")
    private List<String> password;

    public List<String> getPassword() {
        return password;
    }

    public void setPassword(List<String> password) {
        this.password = password;
    }

    public List<String> getAccount() {
        return account;
    }

    public void setAccount( List<String> account) {
        this.account = account;
    }

    @SerializedName("new_password")
    private List<String> newPassword;

    public List<String> getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(List<String> newPassword) {
        this.newPassword = newPassword;
    }

    @SerializedName("email")
    private List<String> emailCheck;
    @SerializedName("token")
    private List<String> tokenCheck;

    @SerializedName("old_password")
    private List<String> oldPassword;

    public List<String> getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(List<String> oldPassword) {
        this.oldPassword = oldPassword;
    }

    public List<String> getTokenCheck() {
        return tokenCheck;
    }

    public void setTokenCheck(List<String> tokenCheck) {
        this.tokenCheck = tokenCheck;
    }

    public ErrorModel(List<String> emailCheck) {
        this.emailCheck = emailCheck;
    }

    public List<String> getEmailCheck() {
        return emailCheck;
    }

    public void setEmailCheck(List<String> emailCheck) {
        this.emailCheck = emailCheck;
    }
}
