package main.java;

public class Circle {
    public Circle(int r, Dot cn) {
        if (r <= 0) {
            throw new IllegalArgumentException("You set a non-positive circle radius");
        }
        radius = r;
        center = cn;
    }

    private int radius;
    private Dot center;

    public double square() {
        return Math.PI * Math.pow(radius, 2);
    }
}