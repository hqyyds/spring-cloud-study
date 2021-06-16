package com.example.feign;

import org.springframework.stereotype.Component;import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote {
@Override
    public String helle(@RequestParam("name") String name) {
        return "Hystrix has opened!";
    }}
