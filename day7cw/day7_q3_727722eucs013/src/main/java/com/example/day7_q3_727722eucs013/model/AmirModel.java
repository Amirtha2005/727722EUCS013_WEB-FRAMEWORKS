package com.example.day7_q3_727722eucs013.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AmirModel {
    @Id
    private int doorId;
    private String location;
    private String accessCode;
    private String accessType;

    public AmirModel(){}
    public AmirModel(int doorId, String location, String accessCode, String accessType) {
        this.doorId = doorId;
        this.location = location;
        this.accessCode = accessCode;
        this.accessType = accessType;
    }
    public int getDoorId() {
        return doorId;
    }
    public void setDoorId(int doorId) {
        this.doorId = doorId;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getAccessCode() {
        return accessCode;
    }
    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }
    public String getAccessType() {
        return accessType;
    }
    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }
    
    
}
