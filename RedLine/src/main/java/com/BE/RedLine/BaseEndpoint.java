package com.BE.RedLine;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseEndpoint {
    @GetMapping("")
    public String main(){
        return "<h1 color=#ff0000 >This endpoint works! welcome to online hosting! have a good day</h1>";
    }
}
