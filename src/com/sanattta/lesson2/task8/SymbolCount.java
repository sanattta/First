package com.sanattta.lesson2.task8;

// With Break
/*public class SymbolCount {

    public static void main(String[] args) {
        final int n = -1;
        switch (n) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("AA");
                break;
            case 3:
                System.out.println("AAA");
                break;
            case 4:
                System.out.println("AAAA");
                break;
            default:
                System.out.println("AAAAA");
        }
    }

}
*/

// Without Break

public class SymbolCount {

    public static void main(String[] args) {
        final int n = 10;
        switch (n) {
            default:
                System.out.print("A");
            case 4:
                System.out.print("A");
            case 3:
                System.out.print("A");
            case 2:
                System.out.print("A");
            case 1:
                System.out.print("A");
        }
    }

}