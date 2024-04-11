package com.example.day1_q4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day1_q4.model.Address;


@RestController
public class AddressController {
    @GetMapping("/address")
    public Address addressobject(){
        Address obj = new Address();
        obj.setName("Amirtha");
        obj.setDoorNo(123);
        obj.setStreetName("Main St");
        obj.setPincode(620014);
        obj.setArea("BHEL Township");
        obj.setDistrict("Trichy");
        obj.setState("Tamil Nadu");
        obj.setCountry("India");
        return obj;
    }
}
