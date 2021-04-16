package com.BE.RedLine;

import org.springframework.web.bind.annotation.*;

@RestController
public class BaseEndpoint {
    //@GetMapping("")
    @CrossOrigin
    @RequestMapping(method= RequestMethod.GET, path = "")
    public String main(){
        return "<html><body><h1 color='#ff0000' >This endpoint works! welcome to online hosting! have a good day</h1></body></html>";
    }
}
