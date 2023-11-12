package com.testovoe.gisbis.controller;

import com.testovoe.gisbis.dto.WidthHeightBbox;
import com.testovoe.gisbis.service.RenderDataFrame;
import doodle.algebra.generic.BoundingBox;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gis-bis")
public class RenderController {
    @Value("${test.config}")
    private String test;
    @Autowired
    private RenderDataFrame renderDataFrame;

    @GetMapping("/testConfig")
    public String testConfig(){
        return test;
    }
    @PostMapping("/render")
    public ResponseEntity<?> renderFrame(@RequestBody WidthHeightBbox whb){
        renderDataFrame.renderData(whb.getHeight(), whb.getWidth(), whb.getBbox(),"output");
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
