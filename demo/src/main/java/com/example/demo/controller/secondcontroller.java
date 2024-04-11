package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class secondcontroller {

//     @GetMapping("/second")
//     public String secondGreetings(){
//         return "second controller Info";
//     }
// }

// @RestController
// @RequestMapping("/second")
// public class secondcontroller {

//     @GetMapping("/welcome")
//     public String secondGreetings(){
//         return "second controller Info";
//     }
// }

@RestController
public class secondcontroller{

    @GetMapping("/wel")
    public String secondGreetings(@RequestParam String name){
        return "second controller Info"+ name;
    }
}
