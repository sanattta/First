package com.sanattta.lesson6.task2.generator;

import java.util.Random;

public class AgeGenerator {

    public static int generate() {
        return 20 + new Random().nextInt(55);
    }

}
