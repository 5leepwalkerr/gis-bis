package com.testovoe.gisbis.controller;

import doodle.algebra.generic.BoundingBox;
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

    @GetMapping("/render")
    public String renderData(@RequestParam BoundingBox boundingBox, @RequestParam int width, @RequestParam int height){
        return "hello";
    }
}
