package com.dtag.thaa.home_activity.userrequests;

import java.io.Serializable;

public class UserRequestModuleDataAdapter implements Serializable {

    private  String name;
    private  String status;
    private  int  id;

    public UserRequestModuleDataAdapter( String name, String status, int id) {
        this.name = name;
        this.status = status;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return status;
    }

    public void setDetails(String details) {
        this.status = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
