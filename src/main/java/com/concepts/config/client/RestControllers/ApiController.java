package com.concepts.config.client.RestControllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ApiController {


    @Value("${message: Default Hello}")
    private String message;

    @GetMapping("/testHello")
    public String sayHello(){
        return message;
    }
}
