package cn.wdidada.test.mybatisspringbootstarter.entity;

import java.io.Serializable;

public class Sign implements Serializable {

    private static final long serialVersionUID = -6941982727502659409L;

    private String id;
    private String date;
    private String userId;
    private String weekday;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
}
