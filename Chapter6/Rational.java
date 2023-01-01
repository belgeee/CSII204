/* File: Rational.java
 * -------------------
 * Rational class from the book that has 
 * BigInteger instead of normal integer.
 */

package Chapter6;

import java.math.BigInteger;

public class Rational {
	
	public Rational() {
		this(BigInteger.ZERO);
	}
	public Rational(BigInteger n) {
		this(n, BigInteger.ONE);
	}
	
	public Rational(BigInteger x, BigInteger y) {
		BigInteger g = gcd(x.abs(), y.abs());
		num = x.divide(y);
		den = y.abs().divide(g);
		if (y.intValue() < 0) num = num.negate();
	}
	
	public Rational add(Rational r) {
		return new Rational((this.num.multiply(r.den)).add(r.num.multiply(this.den)),
							this.den.multiply(r.den));
	}
	
	public Rational subtract(Rational r) {
		return new Rational((this.num.multiply(r.den)).divide(r.num.multiply(this.den)),
							this.den.multiply(r.den));
	}
	
	public Rational multiply(Rational r) {
		return new Rational(this.num.multiply(r.num), this.den.multiply(r.den));
	}
	
	public Rational divide(Rational r) {
		return new Rational(this.num.multiply(r.den), this.den.multiply(r.num));
	}
	
	public String toString() {
		if (den == BigInteger.ONE) {
			return "" + num;
		} else {
			return num + "/" + den;
		}
	}
	
	private BigInteger gcd(BigInteger x, BigInteger y) {
		BigInteger r = x.remainder(y);
		while (r != BigInteger.ZERO) {
			x = y;
			y = r;
			r = x.remainder(y);
		}
		return y;
	}
	
/* Private instance variables */
	private BigInteger num;
	private BigInteger den;

}
