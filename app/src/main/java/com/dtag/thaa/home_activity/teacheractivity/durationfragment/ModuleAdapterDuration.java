package com.dtag.thaa.home_activity.teacheractivity.durationfragment;

public class ModuleAdapterDuration {
    private  int id;
    private  String  courseName;
    private  String  courseDuration;
    private   String placeOfbirth;

    public ModuleAdapterDuration(int id, String courseName, String courseDuration, String placeOfbirth) {
        this.id = id;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.placeOfbirth = placeOfbirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getPlaceOfbirth() {
        return placeOfbirth;
    }

    public void setPlaceOfbirth(String placeOfbirth) {
        this.placeOfbirth = placeOfbirth;
    }


}
