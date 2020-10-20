package com.sanattta.lesson5.task3;

import java.util.Random;

public class App {
    static public void main(String[] args) {
        final int total = 500 + new Random().nextInt(501);
        int errCount = 0;
        for (int i = 0; i < total; ++i) {
            final int m = new Random().nextInt(5);
            final int n = new Random().nextInt(5);
            try {
                final int m_n = m / n;
            }
            catch (ArithmeticException e) {
                ++errCount;
            }
        }
        System.out.format("Из %d операций деления %d было выполненно с ошибкой%n", total, errCount);
    }
}
