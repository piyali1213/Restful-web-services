package com.webservices.restfulwebservices.controller;

import com.webservices.restfulwebservices.entity.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/HelloWorld")
public class HelloWorldController {

    //  @RequestMapping(method = RequestMethod.GET, path = "/HelloWorld") //Another Way of Get Mapping
    @GetMapping("/restApi")
    public String print() {
        return "Hello Rest Api World !!!";
    }
@GetMapping("/hello-World-Bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World RestApi");

    }
    // path parameter
    // {id} ,{name} etc these are path variable of your urls
    // user/{id}/todo/{id} -> user/ 1/ todo/1
    //helloWorld/path-variable/ {name}
    // helloWorld/path-variable/ Piyali
@GetMapping("/Hello-World/path-variable/{name}")
    public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name)
    {
       // return new HelloWorldBean(String.format("Hello World, %s", name));
        return new HelloWorldBean("Hello World!!" ,name);
    }
}
