import java.math.BigInteger;

/**
 * BigInt
 * Created November 10, 2018 by Daniel Denenberg
 * This class is basically java's BigInteger class, except it allows for easier initialization, calculations, and changing of the object itself
 * @param <T>: If you want to use number objects that can be coerced into strings (Long, Integer, etc)
 */
public class BigInt<T> {
    private BigInteger number;

    public BigInt(String num) {
        number = new BigInteger(num);
    }

    public BigInt(T num) {
        this.number = new BigInteger("" + num);
    }
    public BigInt(int num) {
        this.number = new BigInteger("" + num);
    }


    /* -------------- ADDING --------------*/
    public void addToSelf(T num) {
        number = number.add(new BigInteger("" + num));
    }

    public void addToSelf(int num) {
        number = number.add(new BigInteger("" + num));
    }

    public void addToSelf(BigInt b) {
        number = number.add(new BigInteger(b.toString()));
    }

    // instead of adding the value to this object, it returns a new object of the resulting value
    public BigInt add(T num) {
        return new BigInt(number.add(new BigInteger("" + num)).toString());
    }

    public BigInt add(int num) {
        return new BigInt(number.add(new BigInteger("" + num)).toString());
    }


    /* -------------- SUBTRACTING --------------*/
    public void subtractFromSelf(T num) {
        number = number.subtract(new BigInteger("" + num));
    }
    public void subtractFromSelf(int num) {
        number = number.subtract(new BigInteger("" + num));
    }

    public void subtractFromSelf(BigInt b) {
        number = number.subtract(new BigInteger(b.toString()));
    }

    // instead of adding the value to this object, it returns a new object of the resulting value
    public BigInt subtract(T num) {
        return new BigInt(number.subtract(new BigInteger("" + num)).toString());
    }
    public BigInt subtract(int num) {
        return new BigInt(number.subtract(new BigInteger("" + num)).toString());
    }



    /* -------------- MULTIPLYING --------------*/
    public void multiplyWithSelf(T num) {
        number = number.multiply(new BigInteger("" + num));
    }
    public void multiplyWithSelf(int num) {
        number = number.multiply(new BigInteger("" + num));
    }

    public void multiplyWithSelf(BigInt b) {
        number = number.multiply(new BigInteger(b.toString()));
    }

    // instead of adding the value to this object, it returns a new object of the resulting value
    public BigInt multiply(T num) {
        return new BigInt(number.multiply(new BigInteger("" + num)).toString());
    }
    public BigInt multiply(int num) {
        return new BigInt(number.multiply(new BigInteger("" + num)).toString());
    }



    /* -------------- DIVIDE --------------*/
    public void divideWithSelf(T num) {
        number = number.divide(new BigInteger("" + num));
    }
    public void divideWithSelf(int num) {
        number = number.divide(new BigInteger("" + num));
    }

    public void divideWithSelf(BigInt b) {
        number = number.divide(new BigInteger(b.toString()));
    }

    // instead of adding the value to this object, it returns a new object of the resulting value
    public BigInt divide(T num) {
        return new BigInt(number.divide(new BigInteger("" + num)).toString());
    }
    public BigInt divide(int num) {
        return new BigInt(number.divide(new BigInteger("" + num)).toString());
    }



    /* -------------- MODULUS --------------*/
    public void modWithSelf(T num) {
        number = number.mod(new BigInteger("" + num));
    }
    public void modWithSelf(int num) {
        number = number.mod(new BigInteger("" + num));
    }

    public void modWithSelf(BigInt b) {
        number = number.mod(new BigInteger(b.toString()));
    }

    // instead of adding the value to this object, it returns a new object of the resulting value
    public BigInt mod(T num) {
        return new BigInt(number.mod(new BigInteger("" + num)).toString());
    }
    public BigInt mod(int num) {
        return new BigInt(number.mod(new BigInteger("" + num)).toString());
    }


    public void absSelf() {
        number = number.abs();
    }

    public BigInt abs() {
        return new BigInt(number.abs().toString());
    }

    // return the factorial of this number
    public BigInt factorialSelf() {
        BigInt fac = new BigInt(1);

        // make sure the number is positive
        number = number.abs();
        // while the number is not 1 yet, multiply it with fac, subtract 1
        while (!number.toString().equals("1")) {
            fac.multiplyWithSelf(new BigInt(number.toString()));
            number = number.subtract(BigInteger.ONE);
        }

        // set this to be the factorial
        number = new BigInteger(fac.toString());

        // return the value just in case one wants to use the value right away
        return this;
    }



    public String toString() {
        return "" + number;
        //number
    }

    public void printSelf() {
        System.out.println(this);
    }
}
