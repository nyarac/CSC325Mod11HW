package org.example;

public class Rectangle implements Shape {
    public void draw(int x1, int y1, int x2, int y2) {
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        int newX = Math.min(x1, x2);
        int newY = Math.min(y1, y2);
        System.out.println("Rectangle with coordinate top-left corner (" + newX + ";" + newY + "), width: " + width
                + ", height: " + height);
    }
}
