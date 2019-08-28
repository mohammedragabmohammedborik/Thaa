package com.dtag.thaa.home_activity.availableteacher;

import java.io.Serializable;

public class AvailableTeacherModuleData  implements Serializable {

    private String imageUrl;
    private  String name;
    private  String details;
    private  int  id;
    private  int contentrate;

    public AvailableTeacherModuleData(String imageUrl, String name, String details, int id, int contentrate) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.details = details;
        this.id = id;
        this.contentrate = contentrate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContentrate() {
        return contentrate;
    }

    public void setContentrate(int contentrate) {
        this.contentrate = contentrate;
    }
}
