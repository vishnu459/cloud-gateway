package com.practive.springboot.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBack(){
        return "User service is taking longer than expected..";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBack(){
        return "Department service is taking longer than expected..";
    }
}
