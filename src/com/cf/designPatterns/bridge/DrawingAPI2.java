package com.cf.designPatterns.bridge;

public class DrawingAPI2 implements DrawingAPI{
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API2.circle at %f:%f radius %f\n", x, y, radius);
    }
}
