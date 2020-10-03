package com.sanattta.lesson2.task7;

public class Age {
    public static void main(String[] args) {
        Age instance = new Age();
        System.out.println(instance.getDescription(32));
        System.out.println(instance.getDescription(52));
        System.out.println(instance.getDescription(66));
        System.out.println(instance.getDescription(82));
        System.out.println(instance.getDescription(25));
        System.out.println(instance.getDescription(44));
        System.out.println(instance.getDescription(60));
        System.out.println(instance.getDescription(75));
        System.out.println(instance.getDescription(22));
        System.out.println(instance.getDescription(119));
    }

    String getDescription(int age) {
        String prefix = "";
        if (age >= 25 && age < 44)
            prefix = "молодой возраст";
        else if (age >= 44 && age < 60)
            prefix = "средний возраст";
        else if (age >= 60 && age < 75)
            prefix = "пожилой возраст";
        else if (age >= 75 && age < 90)
            prefix = "старческий возраст";
        else prefix = "неизвестный возраст";
        return prefix;
    }
}