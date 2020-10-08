package com.sanattta.lesson3.task3;

public class Application {
    public static void main(String[] args) {
        Human valery = new Human("Валерий", 70, null, null);
        Human alexandra = new Human("Александра", 68, null, null);
        Human ivan = new Human("Иван", 72, null, null);
        Human sergey = new Human("Сергей", 50, valery, alexandra);
        Human marina = new Human("Марина", 45, ivan, null);
        Human vitaliy = new Human("Виталий", 25, sergey, marina);
        Human elena = new Human("Елена", 22, sergey, marina);
        Human[] grandParents = new Human[4];
        int n = 0;
        for (Human parent : elena.parents()) {
            for (Human gParent : parent.parents()) {
                grandParents[n] = gParent;
                ++n;
            }
        }
        for ( Human grandParent : grandParents) {
           if (grandParent != null)
               System.out.println(grandParent.name);
        }
    }
}
