package com.sanattta.lesson3.task4;

public class Human {
    String name;
    Human[] friends = new Human[3];

    Human(String name) {
        this.name = name;
    }

    void addFriends(Human friend) {
        int index = 0;
        while (friends[index] != null) {
            if (friends[index] == friend) return;
            index++;
        }
        friends[index] = friend;
        friend.addFriends(this);
    }
}
