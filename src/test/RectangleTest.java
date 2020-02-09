package test;

import main.java.Dot;
import main.java.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void constructorTestEquals() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(new Dot(-5, 0), new Dot(-5, 0), new Dot(3, 4));
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(new Dot(0, 0), new Dot(-5, 1), new Dot(-5, 1));
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(new Dot(1, -1), new Dot(-4, -4), new Dot(1, -1));
        });
    }

    @Test
    void constructorTestStraightAngle() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(new Dot(1, 1), new Dot(9, 4), new Dot(2, 4));
        });
    }

    @Test
    void square() {
        Rectangle tester = new Rectangle(new Dot(0, 0), new Dot(5, 2), new Dot(5, 0));
        assertEquals(tester.square(), 10);
    }

}