package Lab3;

public class Lab3 {

}
/**
 * Class Rational that represents mathematical rational numbers of the form num/den
 @author: EECS2030 - F23
 *
 */
class Rational {
    private int num;
    private int den;

    /**
     * creates a rational number object that is equal to 1/1
     */
    public Rational() {
        this.num = 1;
        this.den = 1;
    }
    /**
     * creates a rational number object in its reduced form
     * by dividing num and denum by their gcd.
     * @param numerator the numerator of the rational number
     * @param denominator the denominator of the rational number
     */
    public Rational(int numerator, int denominator) {
        // The constructor should make sure that
        //the denominator is different than zero. If denominator is equal to zero, num and den are set
        //to 1. Otherwise, the num must have the value of the numerator divided by the gcd, and the
        //den must have the value of the denominator divided by the gcd. This is known to be the
        //reduced form of a rational number
        if(denominator == 0) {
            this.num = 1;
            this.den = 1;
        }
        else {
            this.num = numerator/gcd(numerator,denominator);
            this.den = denominator/gcd(numerator,denominator);
        }
    }
    /**
     * Returns the numerator  of the rational number.
     * @return the numerator
     */
    public int getNum() {
        return this.num;
    }
    /**
     * Sets the numerator of the rational number.
     * @param num the new value of the numerator.
     */
    public void setNum(int num) {
        this.num = num;
    }
    /**
     * Returns the denominator  of the rational number.
     * @return the denominator
     */
    public int getDen() {
        return this.den;
    }
    /**
     * Sets the denominator  of the rational number.
     * @param den the new value of the denominator.
     */
    public void setDen(int den) {
        if(den == 0) {
            this.den = 1;
        }
        else {
            this.den = den;
        }
    }
    /**
     * Computes the multiplication of this rational number with another rational number
     * @param b is the rational number to be multiplied by this rational number.
     * @return returns a new rational number of the multiplication result
     */
    public Rational times(Rational b) {
        int num = this.num * b.num;
        int den = this.den * b.den;
        return new Rational(num, den);
    }
    /**
     * Computes the addition of this rational number with another rational number
     * @param b is the rational number to be added to this rational number.
     * @return returns a new rational number of the addition result
     */
    public Rational plus(Rational b) { // a/b + c/d = (ad + bc)/bd
        int newNum = this.num * b.den + this.den * b.num;
        int newDen = this.den * b.den;
        return new Rational(newNum, newDen);
    }
    /**
     * Computes the division of this rational number with another rational number
     * @param b is the rational number to divide this rational number.
     * @return returns a new rational number of the division result
     */
    public Rational divides(Rational b) {
        int newNum = this.num * b.den;
        int newDen = this.den * b.num;
        return new Rational(newNum, newDen);
    }
    /**
     * Returns a string representation of the rational number as num/den,
     * where num, and den are the components of the rational number
     * @return a string representation of the rational number
     */
    public String toString() {
        return this.num + "/" + this.den;
    }
    /**
     * Checks the equality of two rational numbers
     * @param b rational number to be compared with this rational number.
     * @return true if both rational numbers are equal, false otherwise
     */
    public boolean equals(Rational b) {
        return this.num == b.num && this.den == b.den;
    }
    /**
     * Static method to calculate the gcd of two positive integers
     * @param m is the larger positive integer
     * @param n is the smaller positive integer
     * @return an integer which is the gcd of both m and n
     */
    public static int gcd(int m, int n) {
        int gcd = 1;
        if(m == 0 || n == 0) {
            return 0;
        }
        else {
            for(int i = 1; i <= m && i <= n; i++) {
                if(m%i == 0 && n%i == 0) {
                    gcd = i;
                }
            }
        }
        return gcd;
    }
}
