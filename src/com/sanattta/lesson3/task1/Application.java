package com.sanattta.lesson3.task1;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(4, 2));
        System.out.println(calculator.difference(5, 3));
        System.out.println(calculator.multiply(2, 6));
        System.out.println(calculator.division(5, 3));
    }

}
