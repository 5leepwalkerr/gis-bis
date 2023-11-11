package com.testovoe.gisbis.controller;

import doodle.algebra.generic.BoundingBox;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gis-bis")
public class RenderController {
    @Value("${test.config}")
    private String test;

    @GetMapping("/render")
    public String renderData(){
        return "hello";
    }
    @GetMapping("/testConfig")
    public String testConfig(){
        return test;
    }
}
