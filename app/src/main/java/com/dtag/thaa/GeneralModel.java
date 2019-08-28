package com.dtag.thaa;

import com.google.gson.annotations.SerializedName;

public class GeneralModel {

    @SerializedName("status")
    private boolean  status;
    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private GeneralModel1 generalModel1;

    @SerializedName("errors")
    private ErrorModel erroModel;

    public ErrorModel getErroModel() {
        return erroModel;
    }

    public void setErroModel(ErrorModel erroModel) {
        this.erroModel = erroModel;
    }

    public GeneralModel1 getGeneralModel1() {
        return generalModel1;
    }

    public void setGeneralModel1(GeneralModel1 generalModel1) {
        this.generalModel1 = generalModel1;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
