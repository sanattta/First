package com.sanattta.lesson1.task2;

public class Rectangle {
    static public void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.parameter(2,7));
        System.out.println(rectangle.parameter(6,5));
        System.out.println(rectangle.parameter(6,3));
    }

    boolean parameter (int width, int height) {
        int square = width * height;
        int perimeter = 2 * (width + height);
        int diff = square - perimeter;
        return diff > 0;
    }
}
