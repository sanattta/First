package com.sanattta.lesson3.task5;

public class Application {

    public static void main(String[] args) {
        Human[] humans = new Human[20];
        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human();
        }

        for (Human human : humans) {
            for (Human anotherHuman : humans) {
                if (human != anotherHuman
                        && human.cats.length == anotherHuman.cats.length
                        && human.dogs.length == anotherHuman.dogs.length)
                    System.out.printf("%s: %d кошек, %d собак%n", human.name, human.cats.length, human.dogs.length);
            }
        }
    }

}