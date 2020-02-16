package main.java;

public class DoubleMath {
    public static boolean isZero(double value) {
        return Math.abs(value) < epsilon;

    }
    public static final double epsilon = 0.00001;
}
