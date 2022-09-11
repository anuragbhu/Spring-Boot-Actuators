package com.example.springactuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "hello")
public class CustomEndPoint {

    @ReadOperation
    public String getCustomEndPoints(){
        return "Hello World!";
    }
}
