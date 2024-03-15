package org.example;

public class Calculator {

    private static int sum;
    private static int sub;
    private static int mul;
    private static int div;

    public static void sumNumbers(int a, int b) {
        sum = a + b;
    }

    public static void subNumbers(int a, int b) {
        sub = a - b;
    }

    public static void mulNumbers(int a, int b) {
        mul = a * b;
    }

    public static void divNumbers(int a, int b) {
        div = a / b;
    }

    public static int getSum() {
        return sum;
    }

    public static int getSub() {
        return sub;
    }

    public static int getMul() {
        return mul;
    }

    public static int getDiv() {
        return div;
    }
}
