package com.dtag.thaa;


import com.google.gson.annotations.SerializedName;

public class GeneralModel1 {
    @SerializedName("about")
    private String about;

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

//    @SerializedName("customer_info")
//    private CustomInformationModule customInformationModule;
//
//    public CustomInformationModule getCustomInformationModule() {
//        return customInformationModule;
//    }
//
//
//    public void setCustomInformationModule(CustomInformationModule customInformationModule) {
//        this.customInformationModule = customInformationModule;
//    }
//
//    @SerializedName("cart_items")
//    private  List<CartDataModule> cartDataModuleList;
//
//    public List<CartDataModule> getCartDataModuleList() {
//        return cartDataModuleList;
//    }
//
//    public void setCartDataModuleList(List<CartDataModule> cartDataModuleList) {
//        this.cartDataModuleList = cartDataModuleList;
//    }
//
//    @SerializedName("fast_donations")
//    private  List<FastDonationItemModule> fastDonationItemModuleList;
//
//    public List<FastDonationItemModule> getFastDonationItemModuleList() {
//        return fastDonationItemModuleList;
//    }
//
//    public void setFastDonationItemModuleList(List<FastDonationItemModule> fastDonationItemModuleList) {
//        this.fastDonationItemModuleList = fastDonationItemModuleList;
//    }
//
//    @SerializedName("images")
//    List<PictureModulleData> pictureModulleDataList;
//
//    public List<PictureModulleData> getPictureModulleDataList() {
//        return pictureModulleDataList;
//    }
//
//    public void setPictureModulleDataList(List<PictureModulleData> pictureModulleDataList) {
//        this.pictureModulleDataList = pictureModulleDataList;
//    }
//
//    @SerializedName("news_item")
//    private  NewsDataModule newsDataModule;
//
//    public NewsDataModule getNewsDataModule() {
//        return newsDataModule;
//    }
//
//    public void setNewsDataModule(NewsDataModule newsDataModule) {
//        this.newsDataModule = newsDataModule;
//    }
//
//    @SerializedName("news")
//    List<NewsDataModule> newsDataModuleList;
//
//    public List<NewsDataModule> getNewsDataModuleList() {
//        return newsDataModuleList;
//    }
//
//    public void setNewsDataModuleList(List<NewsDataModule> newsDataModuleList) {
//        this.newsDataModuleList = newsDataModuleList;
//    }
//
//    @SerializedName("projects")
//    private  List<ProjectDataModule> projectDataModuleList;
//
//    public List<ProjectDataModule> getProjectDataModuleList() {
//        return projectDataModuleList;
//    }
//
//    public void setProjectDataModuleList(List<ProjectDataModule> projectDataModuleList) {
//        this.projectDataModuleList = projectDataModuleList;
//    }
//
//    @SerializedName("categories")
//    private List<SpinnerModuleData> spinnerModuleData;
//
//    public List<SpinnerModuleData> getSpinnerModuleData() {
//        return spinnerModuleData;
//    }
//
//    public void setSpinnerModuleData(List<SpinnerModuleData> spinnerModuleData) {
//        this.spinnerModuleData = spinnerModuleData;
//    }

    @SerializedName("offset")
    private  int offest;

    public int getOffest() {
        return offest;

    }


//    public void setOffest(int offest) {
//        this.offest = offest;
//    }
//
//    public List<ProductDataModule> getProductDataModuleList() {
//        return productDataModuleList;
//    }
//
//    public void setProductDataModuleList(List<ProductDataModule> productDataModuleList) {
//        this.productDataModuleList = productDataModuleList;
//    }

//    @SerializedName("products")
//    List<ProductDataModule> productDataModuleList;

    @SerializedName("auth_data")
    private  LoginModule loginModule;

    public LoginModule getLoginModule() {
        return loginModule;
    }

    public void setLoginModule(LoginModule loginModule) {
        this.loginModule = loginModule;
    }
}
