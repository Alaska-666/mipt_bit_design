package main.java;

import main.java.Dot;

public class Rectangle {
    public Rectangle(Dot Dot1, Dot Dot2, Dot Dot3) {
        if (Dot1.isEqual(Dot2) || Dot1.isEqual(Dot3) || Dot2.isEqual(Dot3)) {
            throw new IllegalArgumentException("All dots must be different, but you passed several identical dots.");
        }

        if (!DoubleMath.isZero(Math.pow(Dot1.distance(Dot2), 2) - Math.pow(Dot1.distance(Dot3), 2) - Math.pow(Dot2.distance(Dot3), 2))) {
            throw new IllegalArgumentException("The shape you set is not a rectangle.");
        }

        firstDot = Dot1;
        secondDot = Dot2;
        thirdDot = Dot3;
    }

    private Dot firstDot;
    private Dot secondDot;
    private Dot thirdDot;

    public double square() {
        return firstDot.distance(thirdDot) * secondDot.distance(thirdDot);
    }
}
