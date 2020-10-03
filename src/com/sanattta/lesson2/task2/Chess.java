package com.sanattta.lesson2.task2;

public class Chess {

    static public void main(String[] args) {
        int[][] AA = new int[8][8];
        for (int i = 0; i < 8; ++i)
            for (int j = 0; j < 8; ++j)
                AA[i][j] = (i + j) % 2;
        Chess chess = new Chess();
        chess.forLoop(AA);
        System.out.println("");
        chess.forEachLoop(AA);
        System.out.println("");
        chess.whileLoop(AA);
    }

    public void forLoop(int[][] A) {
        for (int i = 0; i < A.length; ++i) {
            for (int j = 0; j < A[i].length; ++j) {
                System.out.print(A[i][j]);
            }
            System.out.println("");
        }
    }

    public void forEachLoop(int[][] B) {
        for (int[] x : B) {
            for (int y : x) {
                System.out.print(y);
            }
            System.out.println("");
        }
    }

    public void whileLoop(int[][] A) {
        int i = 0;
        while (i < A.length) {
            int j = 0;
            while (j < A[i].length) {
                System.out.print(A[i][j]);
                j = j + 1;
            }
            System.out.println("");
            i = i + 1;
        }

    }

}
