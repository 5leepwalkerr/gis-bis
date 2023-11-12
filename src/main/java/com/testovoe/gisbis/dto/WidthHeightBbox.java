package com.testovoe.gisbis.dto;

import doodle.algebra.generic.BoundingBox;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Component;


public class WidthHeightBbox {
    int width;
    int height;
    BoundingBox bbox;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setBbox(BoundingBox bbox) {
        this.bbox = bbox;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public BoundingBox getBbox() {
        return bbox;
    }
}
