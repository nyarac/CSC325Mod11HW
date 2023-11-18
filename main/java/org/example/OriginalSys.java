package org.example;

public class OriginalSys {
    public static void main(String[] args) {
        Object[] shapes = {new Circle(), new Rectangle()};
        int x1 = 10, y1 = 20;
        int r= 60;
        int width = 40, height = 40;
        for (Object shape : shapes) {
            if (shape.getClass().getSimpleName().equals("Circle")) {
                ((Circle)shape).draw(x1, y1, r);
            } else if (shape.getClass().getSimpleName().equals("Rectangle")) {
                ((Rectangle)shape).draw(x1, y1, width, height);
            }
        }
    }
}
