package com.sanattta.lesson2.task1;

public class Friday {
    static public void main(String[] args) {
        String[] words = {"Пятница", "это", "лучший", "день", "недели"};
        Friday friday = new Friday();
        friday.week1(words);
        friday.week2(words);
        friday.week3(words);
    }

    public void week1(String[] words) {
        for (int i = 0; i < words.length; ++i) {
            System.out.print(words[i]);
            if (i + 1 < words.length)
                System.out.print(" ");
            else
                System.out.println(".");
        }
    }

    public void week2(String[] words) {
        String result = "";
        for (String word : words)
            result = result + word + " ";
        result = result.trim();
        System.out.print(result);
        System.out.println(".");
    }


    public void week3(String[] words) {
        int i = 0;
        while (i < words.length) {
            System.out.print(words[i]);
            if (i + 1 < words.length)
                System.out.print(" ");
            else
                System.out.println(".");
            ++i;
        }
    }
}