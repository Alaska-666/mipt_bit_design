package test;

import main.java.Dot;
import main.java.DoubleMath;
import main.java.Square;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void squarePass() {
        Square tester = new Square(new Dot(0, 0), new Dot(5, 5));
        assertEquals(tester.square(), 25);
    }

    @Test
    void squarePassToo() {
        Square tester = new Square(new Dot(0, 0), new Dot(6, 0));
        assertEquals(tester.square(), 18, DoubleMath.epsilon);
    }

}