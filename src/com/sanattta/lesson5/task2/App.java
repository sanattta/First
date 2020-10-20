package com.sanattta.lesson5.task2;

import com.sanattta.lesson5.task2.Cat;

public class App {
    static public void main(String[] args) {
        Cat cat0 = new Cat("Алиса", 1);
        Cat cat1 = new Cat("Барсик", 2);
        Cat cat3 = new Cat("Мурзик", 3);
        Cat cat4 = new Cat("Котик", 4);
        Cat[] cats = {cat0, cat1, null, cat3, cat4};
        try {
            for (Cat cat : cats) {
                System.out.format("Имя: %s, Возраст: %d%n", cat.getName(), cat.getAge());
            }
        }
        catch (Exception e) {
            System.out.format("Возникло исключение: %s%n", e.getMessage());
        }
    }
}
