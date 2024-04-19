package com.webservices.restfulwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWorld")
public class HelloWorldController {

    //  @RequestMapping(method = RequestMethod.GET, path = "/HelloWorld") //Another Way of Get Mapping
    @GetMapping("/restApi")
    public String print()
    {
        return "Hello Rest Api World !!!";
    }
}
