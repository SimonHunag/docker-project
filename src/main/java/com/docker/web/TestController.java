package com.docker.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 **/
@RestController
public class TestController
{

    @GetMapping("/t")
    public String getTest()
    {
        return "hehe";
    }

}
