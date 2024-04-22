package com.example.cc1practice1.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ccModel {

    @Value("${app.Name}")
    private String name;

    @Value("${app.Version}")
    private String version;

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

}
