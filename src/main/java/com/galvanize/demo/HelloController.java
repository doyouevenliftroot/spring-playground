package com.galvanize.demo;

import org.springframework.web.bind.annotation.GetMapping; //required import for  @GetMapping in the class below
import org.springframework.web.bind.annotation.PostMapping; //required import for @PostController below
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; //required import for @RestController below

@RestController //required for class instantiation (Spring/web content request handling), see associated import above
@RequestMapping("/app") //used to force a prefix to all the below controller methods, can be any string you want
public class HelloController {

    @GetMapping("/") //required inside class for handling requests, see associated import above
    public String helloWorld() {
        return "Hello from Spring!";
    }

    @PostMapping("/postTest")
    public String doAPostTest() {
        return "You did a POST test successfully";
    }
    @RequestMapping("/genericRequestTest")
    public String doGenericRequestTest() {
        return "You did a generic Request (no specific POST or GET) test successfully";
    }
}