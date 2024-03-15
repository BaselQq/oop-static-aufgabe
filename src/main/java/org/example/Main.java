package org.example;

public class Main {
    public static void main(String[] args) {
        Mathematical math1 = new Mathematical();
        Mathematical math2 = new Mathematical();
        Mathematical math3 = new Mathematical();

        // instant methods
        math1.incrementInstantCount();
        math1.incrementInstantCount();
        math1.incrementInstantCount();
        System.out.println(math1.instantCount);

        // static method
        Mathematical.incrementTotalCount();
        Mathematical.incrementTotalCount();
        Mathematical.incrementTotalCount();
        System.out.println(Mathematical.totalCount);

        // print object through toString() method
        System.out.println(math1);

        //
        Calculator.sumNumbers(5,2);
        Calculator.subNumbers(5,2);
        Calculator.mulNumbers(5,2);
        Calculator.divNumbers(5,2);
        System.out.println(Calculator.getSum());
        System.out.println(Calculator.getSub());
        System.out.println(Calculator.getMul());
        System.out.println(Calculator.getDiv());
    }
}