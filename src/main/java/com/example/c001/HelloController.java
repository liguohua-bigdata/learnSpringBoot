package com.example.c001;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liguohua on 01/03/2017.
 */
@RestController
public class HelloController {
    //todo http://localhost:8080/c001/hello
    @RequestMapping("c001/hello")
    public String index() {
        return "Hello World";
    }
}