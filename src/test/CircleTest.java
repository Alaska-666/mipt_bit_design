package test;

import main.java.Circle;
import main.java.Dot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void area() {
        Circle tester = new Circle(1, new Dot(10, 9));
        assertEquals(tester.findArea(), Math.PI);
    }

    @Test
    void areaCheck() {
        Circle tester = new Circle(4, new Dot(10, 9));
        assertEquals(tester.findArea(), 4 * 4 *Math.PI);
    }

    @Test
    void constructorNegativeRadius() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Circle(-5, new Dot(-5, 8));
        });
    }

    @Test
    void constructorZeroRadius() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Circle(0, new Dot(0, -3));
        });
    }
}