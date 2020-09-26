package com.sanattta.lesson1.task1;

public class Square {
     static public void main(String[] args) {
         Square x=new Square();
         System.out.println(x.Area1(0));
         System.out.println(x.Area1(2));
         System.out.println(x.Area1(100));
    }
    public double Area1 (int radius) {
        return 3.14 * radius * radius;
    }
}
