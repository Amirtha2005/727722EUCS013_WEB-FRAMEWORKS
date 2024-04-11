package com.example.day2.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class user {
    @Value("${demovalue}")

    private String name;
    public String getName() {
        return name;
    }
}
