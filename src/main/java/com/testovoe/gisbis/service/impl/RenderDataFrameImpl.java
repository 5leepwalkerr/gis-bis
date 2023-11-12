package com.testovoe.gisbis.service.impl;

import com.testovoe.gisbis.service.RenderDataFrame;
import doodle.algebra.generic.BoundingBox;
import doodle.algebra.generic.BoundingBox$;
import org.apache.hc.core5.http.impl.nio.BufferedData;
import org.springframework.aop.framework.AopInfrastructureBean;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.image.BufferedImage;

@Service
public class RenderDataFrameImpl implements RenderDataFrame {
    @Override
    public void renderData(int height, int width, BoundingBox bbox, String outputFilePath) {
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();

        g2d.setBackground(Color.GREEN);
        g2d.clearRect(0,0,width,height);

        int x1 = (int) bbox.top();
        int y1 = (int) bbox.height();
        int x2 = (int) bbox.left();
        int y2 = (int) bbox.right();

        g2d.setColor(Color.RED);
        g2d.drawRect(x1,y1,x2-x1,y2-y1);
        g2d.dispose();

    }
}
