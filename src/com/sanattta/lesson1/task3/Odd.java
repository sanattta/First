package com.sanattta.lesson1.task3;


public class Odd {
    public static void main(String[] args) {
        Odd odd = new Odd();
        System.out.println(odd.isOdd(14));
        System.out.println(odd.isOdd(19));
    }

    boolean isOdd(int n) {
        return n % 2 == 1;
    }
}