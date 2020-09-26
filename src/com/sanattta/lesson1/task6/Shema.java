package com.sanattta.lesson1.task6;

import com.sanattta.lesson1.task5.Logo;

public class Shema {
    public static void main(String[] args) {
        Shema shema = new Shema();
        System.out.println(shema.out(false, false, false, false));
        System.out.println(shema.out(true, true, true, true));
        System.out.println(shema.out(false, true, false, true));
        System.out.println(shema.out(true, false, true, false));
        System.out.println(shema.out(true, true, false, false));
    }

    boolean out(boolean a, boolean b, boolean c, boolean d) {
        return ((a && b) && !(c || d));
    }


}
