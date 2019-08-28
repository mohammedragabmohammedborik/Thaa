package com.dtag.thaa.home_activity.chat;

public class ChatMessage {

    public static final int TEXT=0;

private  String mtype;

private String  message_time;


private  String  durationint;
private int message_id;
private String nickName;
    private String maintext;

    public ChatMessage(String mtype, String message_time, String durationint, int message_id, String nickName, String maintext) {
        this.mtype = mtype;
        this.message_time = message_time;
        this.durationint = durationint;
        this.message_id = message_id;
        this.nickName = nickName;
        this.maintext = maintext;
    }

    public static int getTEXT() {
        return TEXT;
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    public String getMessage_time() {
        return message_time;
    }

    public void setMessage_time(String message_time) {
        this.message_time = message_time;
    }

    public String getDurationint() {
        return durationint;
    }

    public void setDurationint(String durationint) {
        this.durationint = durationint;
    }

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMaintext() {
        return maintext;
    }

    public void setMaintext(String maintext) {
        this.maintext = maintext;
    }
}
