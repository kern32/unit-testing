package ua.com.codespace.testing;

public class Calculator {

    public int add(int a, int b) {
        return a+b;
    }

    public double sqrt(int a) {
        if(a < 0) {
            throw new IllegalArgumentException("Could not calculate sqrt from negative value");
        }
        return Math.sqrt(a);
    }
}
