package org.example;

public class Circle implements Shape {
    public void draw(int x1, int y1, int x2, int y2) {
        int r = calculateRadius(x1, y1, x2, y2);
        System.out.println("Circle from center (" + x1 + ";" + y1 + "), with radius(" + r + ")");
    }

    private int calculateRadius(int x1, int y1, int x2, int y2) {
        return (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

