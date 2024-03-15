package org.example;

/*
Create a new class 'Calculator' with a static method 'add' that takes two numbers as parameters and returns their sum.

Write code in the main method to call the 'add' method and print the result.

Optional: Implement additional static methods in the 'Calculator' class (subtraction, multiplication, division) and call them in the main method.

*/
public class Main {
    public static void main(String[] args) {
        Mathematical math1 = new Mathematical();
        Mathematical math2 = new Mathematical();
        Mathematical math3 = new Mathematical();

        math1.incrementInstantCount();
        math1.incrementInstantCount();
        math1.incrementInstantCount();

        math2.incrementInstantCount();
        math3.incrementInstantCount();

        System.out.println(math1.instantCount);
        System.out.println(math2.instantCount);
        System.out.println(math3.instantCount);

        Mathematical.incrementTotalCount();
        System.out.println(Mathematical.totalCount);

        System.out.println(math1);

        Calculator.sumNumbers(5,2);
        Calculator.subNumbers(5,2);
        Calculator.mulNumbers(5,2);
        Calculator.divNumbers(5,2);
        System.out.println(Calculator.sum);
        System.out.println(Calculator.sub);
        System.out.println(Calculator.mul);
        System.out.println(Calculator.div);
    }
}