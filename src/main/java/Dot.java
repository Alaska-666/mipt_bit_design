package main.java;

public class Dot {
    public Dot(int firstCoord, int secondCoord) {
        x = firstCoord;
        y = secondCoord;
    }

    private int x;
    private int y;

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    double distance(Dot other) {
        return Math.sqrt(Math.pow(other.getX() - x, 2) + Math.pow(other.getY() - y, 2));
    }

    boolean isEqual(Dot other) {
        return other.getX() == x && other.getY() == y;
    }
}
