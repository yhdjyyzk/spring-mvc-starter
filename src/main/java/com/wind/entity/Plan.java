package com.wind.entity;

import java.io.Serializable;

public class Plan implements Serializable{
    private String plan;
    private String date;
    private int id;
    private boolean checked;

    public Plan(String date, String plan, int id, boolean checked) {
        this.plan = plan;
        this.date = date;
        this.id = id;
        this.checked = checked;
    }

    public Plan() {
    }

    public void setPlan(String plan) {

        this.plan = plan;
    }

    public String getPlan() {
        return plan;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "plan='" + plan + '\'' +
                ", date='" + date + '\'' +
                ", id=" + id +
                '}';
    }
}
