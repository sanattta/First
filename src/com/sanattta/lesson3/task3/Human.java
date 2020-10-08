package com.sanattta.lesson3.task3;


public class Human {
    public String name;
    public int age;
    public Human father;
    public Human mother;

    public Human(String name, int age, Human father, Human mother) {
        this.name = name;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public Human[] parents() {
        if (father != null && mother != null)
            return new Human[]{father, mother};
        else if (father != null)
            return new Human[]{father};
        else if (mother != null)
            return new Human[]{mother};
        else
            return new Human[0];
    }
}
