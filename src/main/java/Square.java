package main.java;

import main.java.Dot;

public class Square extends Rectangle {

    public Square(Dot Dot1, Dot Dot2) {
        super(Dot1, Dot2, thirdDot(Dot1, Dot2));
    }

    private static double angleOfRotation = Math.toRadians(90);

    private static Dot thirdDot(Dot Dot1, Dot Dot2) {
        double xCenter = (Dot1.getX() + Dot2.getX()) / 2.0;
        double yCenter = (Dot1.getY() + Dot2.getY()) / 2.0;
        int xCoord = (int)(xCenter + (Dot1.getX() - xCenter)*Math.cos(angleOfRotation) - (Dot1.getY() - yCenter)*Math.sin(angleOfRotation));
        int yCoord = (int)(yCenter + (Dot1.getX() - xCenter)*Math.sin(angleOfRotation) + (Dot1.getY() - yCenter)*Math.cos(angleOfRotation));
        return new Dot(xCoord, yCoord);
    }
}
