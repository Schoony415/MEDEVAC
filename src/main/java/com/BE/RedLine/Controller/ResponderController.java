package com.BE.RedLine.Controller;

import com.BE.RedLine.DAO.RequestRepo;
import com.BE.RedLine.Model.Request;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("")
public class ResponderController {

    final RequestRepo requestRepository;

    public ResponderController(RequestRepo requestRepository) {
        this.requestRepository = requestRepository;
    }


//    View Requests by responder
//    @GetMapping("/responder/{name}")
    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, path = "/responder/{name}")
    public Iterable<Request> getMyRequests(@PathVariable String name){
        return requestRepository.getRequestsByResponder(name);
    }


}
