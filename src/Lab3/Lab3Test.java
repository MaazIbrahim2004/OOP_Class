package Lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class Lab3Test {

    private double rand() {
        return (int) ((Math.random() * 100.0)*10)/10.0;
    }
    private int gcd(int m, int n) {
        if (0 == n) return m;
        else return gcd(n, m % n);
    }
    @Test
    void test_plus1() {
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(3,4);
        Rational r3 = r1.plus(r2);
        assertEquals(r3.getNum(), 5, "Failed test_plus1");
        assertEquals(r3.getDen(), 4, "Failed test_plus1");
    }

    @Test
    void test_plus2() {
        Rational r1 = new Rational(11,6);
        Rational r2 = new Rational(54,43);
        Rational r3 = r1.plus(r2);
        assertEquals(r3.getNum(), 797, "Failed test_plus2");
        assertEquals(r3.getDen(), 258, "Failed test_plus22");
    }

    @Test
    void test_times1() {
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(3,4);
        Rational r3 = r1.times(r2);
        assertEquals(r3.getNum(), 3, "Failed test_times1");
        assertEquals(r3.getDen(), 8, "Failed test_times11");
    }

    @Test
    void test_times2() {
        Rational r1 = new Rational(11,6);
        Rational r2 = new Rational(54,43);
        Rational r3 = r1.times(r2);
        assertEquals(r3.getNum(), 99, "Failed test_times2");
        assertEquals(r3.getDen(), 43, "Failed test_times22");
    }

    @Test
    void test_divides1() {
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(3,4);
        Rational r3 = r1.divides(r2);
        assertEquals(r3.getNum(), 2, "Failed test_divides1");
        assertEquals(r3.getDen(), 3, "Failed test_divides11");
    }

    @Test
    void test_divides2() {
        Rational r1 = new Rational(11, 6);
        Rational r2 = new Rational(54, 43);
        Rational r3 = r1.divides(r2);
        assertEquals(r3.getNum(), 473, "Failed test_divides2");
        assertEquals(r3.getDen(), 324, "Failed test_divides22");
    }

    @Test
        void testToString() {
            int x1 = (int) rand();
            int y1 = (int) rand();
            int g = gcd(x1, y1);

            Rational r1 = new Rational(x1, y1);
            String expected = (x1 == 0) ? String.valueOf(x1) : ((y1 / g) != 1) ? (x1 / g + "/" + y1 / g) : String.valueOf(x1 / g);

            assertEquals(expected, r1.toString(), "toString() is not correct for the rational number: " + x1 + "/" + y1);
        }

        @Test
        void testEqual() {
            int x1 = (int) rand();
            int y1 = (int) rand();
            int g1 = gcd(x1, y1);

            int x2 = (int) rand();
            int y2 = (int) rand();
            int g2 = gcd(x2, y2);

            boolean expected = (x1 / g1 == x2 / g2) && (y1 / g1 == y2 / g2);
            Rational r1 = new Rational(x1, y1);
            Rational r2 = new Rational(x2, y2);

            assertEquals(expected, r1.equals(r2), "equals() is not correct for " + x1 + "/" + y1 + " and " + x2 + "/" + y2);
    }
}

