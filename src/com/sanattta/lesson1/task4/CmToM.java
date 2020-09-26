package com.sanattta.lesson1.task4;

public class CmToM {
    public static void main(String[] args) {
        CmToM cmToM = new CmToM();
        System.out.println(cmToM.m(115));
        System.out.println(cmToM.m(800));
        System.out.println(cmToM.m(278));
    }

    public int m(int cm) {
        return cm / 100;
    }
}
