package com.testovoe.gisbis.service;

import doodle.algebra.generic.BoundingBox;

public interface RenderDataFrame {
    void renderData(int height, int width, BoundingBox bbox, String path);
}
