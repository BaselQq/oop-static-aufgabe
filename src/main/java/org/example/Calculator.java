package org.example;

public class Calculator {

    public static double sum;
    public static double sub;
    public static double mul;
    public static double div;

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
}
