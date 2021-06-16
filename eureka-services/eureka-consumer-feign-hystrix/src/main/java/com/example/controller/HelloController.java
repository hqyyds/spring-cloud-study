package com.example.controller;

import com.example.feign.HelloRemote;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

    @GetMapping("/{name}")
    String hello(@PathVariable("name") String name){
        return helloRemote.helle(name);
    }

}
