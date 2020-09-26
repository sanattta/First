package com.sanattta.lesson1.task5;

public class Logo {
    public static void main(String[] args) {
        Logo logo = new Logo();
        //    System.out.println(logo.ili(false, false));
        //    System.out.println(logo.ili(false, true));
        //    System.out.println(logo.ili(true, false));
        //    System.out.println(logo.ili(true, true));

        System.out.println(logo.i(false, false));
        System.out.println(logo.i(false, true));
        System.out.println(logo.i(true, false));
        System.out.println(logo.i(true, true));

    }

    // boolean ili (boolean a, boolean b) {return !(a||b);}
    boolean i(boolean a, boolean b) {
        return !(a) && !(b);
    }

}
