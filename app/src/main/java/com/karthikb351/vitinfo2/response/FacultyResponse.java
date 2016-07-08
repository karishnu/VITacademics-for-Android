
package com.karthikb351.vitinfo2.response;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.karthikb351.vitinfo2.model.Status;

import co.uk.rushorm.core.RushObject;

public class FacultyResponse extends RushObject{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("room")
    @Expose
    private String room;
    @SerializedName("open_hours")
    @Expose
    private List<OpenHour> openHours = new ArrayList<OpenHour>();
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("school")
    @Expose
    private String school;
    @SerializedName("status")
    @Expose
    private Status status;

    public class OpenHour {

        @SerializedName("day")
        @Expose
        private String day;
        @SerializedName("start_time")
        @Expose
        private String startTime;
        @SerializedName("end_time")
        @Expose
        private String endTime;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    public List<OpenHour> getOpenHours() {
        return openHours;
    }
    public void setOpenHours(List<OpenHour> openHours) {
        this.openHours = openHours;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public Status getStatus() {
        return status;
    }
}
